/*
 * generated by Xtext 2.15.0
 */
package compilation.generator

import compilation.whileLanguage.Affectation
import compilation.whileLanguage.Command
import compilation.whileLanguage.Commands
import compilation.whileLanguage.For
import compilation.whileLanguage.Foreach
import compilation.whileLanguage.Function
import compilation.whileLanguage.If
import compilation.whileLanguage.Nop
import compilation.whileLanguage.Program
import compilation.whileLanguage.Read
import compilation.whileLanguage.While
import compilation.whileLanguage.Write
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
	
	String currentName;
	FunctionTable functionTable;
	boolean code = false;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	
		doGenerate(resource, fsa, context, "", false)
	}

	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, String output, boolean codep){
		code = codep;
		//recup table des symboles
		functionTable = FunctionTable.getInstance();
		
		for (e : resource.allContents.toIterable.filter(typeof(Program))) {
			e.compile
			if (output.equals("")){
				println(compileToJs)
			}
			else
				fsa.generateFile(output, compileToJs);
		}
	}
	
	def compile(Program p) {
		for (f:p.functions){
			 //Cr�ation dans la table des fonctions
			functionTable.addFunction(f.name, f.definition.write.variable.size)
		}
		
		for (f:p.functions){
			f.compile
		}
	}
	def compile(Function f) {
		currentName = f.name;
		f.definition.read.compile
		f.definition.commands.compile
		f.definition.write.compile
		if(code){
			println("Code 3 adresses de "+currentName+" :")
			for(instruction:functionTable.getInstructions(currentName)){
				println(instruction.toString())
			}
			println("------------------")
		}
	}
	
	def compile(Read r) {
		for(v:r.variable){
			functionTable.addInput(currentName, v.toString())
		}
	}
	def compile(Commands c) {
		for(command :c.commands){
			command.compile
		}
		
	}
	def compile(Command c) {
		if( c.command instanceof Nop)
		(c.command as Nop).compile
		else if( c.command instanceof If)
			(c.command as If).compile
		else if( c.command instanceof Affectation)
			(c.command as Affectation).compile
		else if( c.command instanceof While)
			(c.command as While).compile
		else if( c.command instanceof For)
			(c.command as For).compile
		else if( c.command instanceof Foreach)
			(c.command as Foreach).compile
	}
	def compile(Nop w){
		functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("Nop",null,null,null))
	}
	def compile(While w){
		
	}
	

	def compile(If i) {
		
	}

	def compile(Affectation a) {
		
	}

	def compile(For f) {
		
	}

	def compile(Foreach f) {
	
	}
	def compile(Write w) {
		
	}
	def compileToJs()'''
	�FOR f:functionTable.getFunctions()�
	function �f�(�FOR read : functionTable.getInput(f) SEPARATOR ', '��functionTable.getVariable(f, read)��ENDFOR�){
		�FOR instruction:functionTable.getInstructions(f)�
			�instruction.compile()�
		�ENDFOR�
	}
	�ENDFOR�
	'''
}
