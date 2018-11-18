/*
 * generated by Xtext 2.15.0
 */
package compilation.generator

import compilation.whileLanguage.Affectation
import compilation.whileLanguage.Command
import compilation.whileLanguage.Commands
import compilation.whileLanguage.Expr
import compilation.whileLanguage.For
import compilation.whileLanguage.Foreach
import compilation.whileLanguage.Function
import compilation.whileLanguage.If
import compilation.whileLanguage.Lexpr
import compilation.whileLanguage.Nop
import compilation.whileLanguage.Program
import compilation.whileLanguage.While
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WhileLanguageGenerator extends AbstractGenerator {
	// en fait c'est un enum...
	public final static int INDENT_ALL = 0
	public final static int INDENT_FOR = 1
	public final static int INDENT_WHILE = 2
	public final static int INDENT_IF = 3
	public final static int INDENT_FOREACH = 4

	public final static Integer DEFAULT_ALL = 2
	public final static Integer DEFAULT_FOR = Integer.MIN_VALUE
	public final static Integer DEFAULT_WHILE = Integer.MIN_VALUE
	public final static Integer DEFAULT_IF = Integer.MIN_VALUE
	public final static Integer DEFAULT_FOREACH = Integer.MIN_VALUE

	// String des indent sp�cifiques � concat�ner.
	String indentAll = "";
	String indentFor = "";
	String indentWhile = "";
	String indentIf = "";
	String indentForeach = "";

	int i

	List<Integer> indentations = new ArrayList<Integer>();

	// Ne sert que dans eclipse, pas dans les commande line
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		init(indentations)
		doGenerate(resource, fsa, context, "output", indentations)
	}

	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, String output,
		List<Integer> indentations) {
		this.indentations = indentations
		calcIndent(this.indentations)
		//System.out.println(indentations);
		for (e : resource.allContents.toIterable.filter(typeof(Program))) {
			if (output.equals(""))
				System.out.println(e.compile())
			else
				fsa.generateFile(output, e.compile())
		}
	}

	def compile(Program p) '''
		�FOR f : p.functions�
			�f.compile�
		�ENDFOR�
	'''

	def compile(Function f) '''
		function �f.name� :
		read �FOR vr : f.definition.read.variable SEPARATOR ','��vr��ENDFOR�
		%
		�f.definition.commands.compile(indentAll)�
		%
		write �FOR vw : f.definition.write.variable SEPARATOR ','��vw��ENDFOR�
	'''

	def compile(Commands c, String indent) '''
		�FOR command : c.commands SEPARATOR " ;"�
			�indent��(command as Command).compile(indent)�
		�ENDFOR�
	'''

	def compile(Command c, String indent) '''
		�IF c.command instanceof Nop�nop
		�ELSEIF c.command instanceof If�
			�(c.command as If).compile(indent)�
		�ELSEIF c.command instanceof Affectation�
			�(c.command as Affectation).compile()�
		�ELSEIF c.command instanceof While�
			�(c.command as While).compile(indent)�
		�ELSEIF c.command instanceof For�
			�(c.command as For).compile(indent)�
		�ELSEIF c.command instanceof Foreach�
			�(c.command as Foreach).compile(indent)�
		�ENDIF�
	'''

	def compile(While w, String indent) '''
		while �w.expr.compile� do
		�w.commands.compile(indent+indentWhile)�
		�indent�od
	'''
	

	def compile(If i, String indent) '''
		if �i.expr.compile� then
		�i.commands1.compile(indent+indentIf)�
		�IF i.commands2 !== null�
			�indent�else
			�i.commands2.compile(indent+indentIf)�
		�ENDIF�
		�indent�fi
	'''

	def compile(Affectation a) '''
		�FOR nom : a.affectations SEPARATOR ','��nom��ENDFOR� := �FOR expr : a.valeurs SEPARATOR ','��expr.compile��ENDFOR�
	'''

	def compile(For f, String indent) '''
		for �f.expr.compile� do
		�f.commands.compile(indent+indentFor)�
		�indent�od
	'''

	def compile(Foreach f, String indent) '''
		foreach �f.expr1.compile� in �f.expr2.compile� do
		�f.commands.compile(indent+indentForeach)�
		�indent�od
	'''

	def compile(Expr e) 
	'''�IF e.valeur !== null��e.valeur.toString()��ELSEIF e.ope.toString().equals('and') || e.ope.toString().equals('or') || e.ope.toString().equals('=?')�(�e.ex1.compile� �e.ope.toString()� �e.ex2.compile�)�ELSEIF e.ope.toString().equals('tl') || e.ope.toString().equals('!') || e.ope.toString().equals('hd')�(�e.ope.toString()� �(e.expr as Expr).compile�)�ELSE�(�e.ope.toString()� �(e.lexpr as Lexpr).compile�)�ENDIF�'''

	def compile(Lexpr l)
	'''�FOR expr : l.exprs SEPARATOR " "��expr.compile��ENDFOR�'''

	def static init(List<Integer> integers) {
		integers.add(INDENT_ALL, DEFAULT_ALL)
		integers.add(INDENT_FOR, DEFAULT_FOR)
		integers.add(INDENT_WHILE, DEFAULT_WHILE)
		integers.add(INDENT_IF, DEFAULT_IF)
		integers.add(INDENT_FOREACH, DEFAULT_FOREACH)
	}

	// Calcule les indentations pour chaque structure de controle selon les valeurs d'indentation donn�es
	def calcIndent(List<Integer> integers) {
		for (i = 0; i < indentations.get(INDENT_ALL); i++) {
			indentAll += " "
			indentFor += " "
			indentWhile += " "
			indentIf += " "
			indentForeach += " "
		}
		if(indentations.get(INDENT_FOR) != Integer.MIN_VALUE) indentFor = ""
		for (i = 0; i < indentations.get(INDENT_FOR); i++)
			indentFor += " "
		if(indentations.get(INDENT_WHILE) != Integer.MIN_VALUE) indentWhile = ""
		for (i = 0; i < indentations.get(INDENT_WHILE); i++)
			indentWhile += " "
		if(indentations.get(INDENT_IF) != Integer.MIN_VALUE) indentIf = ""
		for (i = 0; i < indentations.get(INDENT_IF); i++)
			indentIf += " "
		if(indentations.get(INDENT_FOREACH) != Integer.MIN_VALUE) indentForeach = ""
		for (i = 0; i < indentations.get(INDENT_FOREACH); i++)
			indentForeach += " "
	}
}
