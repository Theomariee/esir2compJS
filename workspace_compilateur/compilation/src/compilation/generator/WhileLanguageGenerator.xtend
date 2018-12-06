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
import compilation.whileLanguage.Lexpr
import compilation.whileLanguage.If
import compilation.whileLanguage.Nop
import compilation.whileLanguage.Program
import compilation.whileLanguage.Read
import compilation.whileLanguage.While
import compilation.whileLanguage.Write
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
	RegisterList registresAff = new RegisterList("aff");
	RegisterStack registresExpr = new RegisterStack("expr");

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
				for(f:functionTable.getFunctions){
					var inputs = functionTable.getInput(f).toString().substring(1)
					inputs = inputs.substring(0,inputs.length-1)
					fsa.generateFile("temp/"+f+".txt", inputs)
				}
				
		}
	}
	
	def compile(Program p) {
		for (f:p.functions){
			currentName = f.name;
			 //Cr�ation dans la table des fonctions
			functionTable.addFunction(f.name, f.definition.write.variable.size)
			f.definition.read.compile
		}
		for (f:p.functions){
			currentName = f.name;
			f.compile
		}
	}
	def compile(Function f) {
		//init
		functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("array",registresAff.getPrefixe(),null,null))
		functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("array",registresExpr.getPrefixe(),null,null))
		functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("array","var",null,null))
		//Fait au premier passage
		//f.definition.read.compile
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
		functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("nop",null,null,null))
	}
	def compile(While w){
		
	}
	

	def compile(If i) {
		
	}

	def compile(Affectation a) {
		//TODO : Controle du nombre d'affectation pour l'instant c'est 1 := 1
		//Mais pb si on utilise des fonction qui retournent plusieurs param : X,Y := (f1 A) //si f1 retourne plusieurs params
		
		//TODO : presence de la variable ou pas
		for(v:a.affectations){
			if(!functionTable.varExists(currentName,v)){
				functionTable.addVariable(currentName,v);
			}
		}
		for(v:a.valeurs){
			//r =  cons nil ?
			//TO DO : cr�ation de variable par push/pop direct
			
			functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("aff",registresAff.push,v.compile,null))
		}
		for(v:a.affectations){
			//r = cons nil ?
			functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("aff",functionTable.getVariable(currentName,v),registresAff.pop(),null))
		}
	}

	def compile(For f) {
		
	}

	def compile(Foreach f) {
	
	}
	def compile(Write w) {
		functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("array","out",null,null))	
		for(v:w.variable){
			functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("push","out",functionTable.getVariable(currentName,v),null))
		}
		functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("ret","out",null,null))
	}
	def compileToJs()'''
	�FOR f:functionTable.getFunctions()�
	function �f�(�FOR read : functionTable.getInput(f) SEPARATOR ', '�BinTree �functionTable.getVariable(f, read)��ENDFOR�){
		�FOR instruction:functionTable.getInstructions(f)�
			�instruction.compile()�
		�ENDFOR�
	}
	�ENDFOR�
	'''
	
	//return le nom de la variable
	//g�n�re du code 3@
	def String compile(Expr e) {
		if (e.valeur !== null){
			if(e.valeur.equals("nil")){
				// attention c'est du fifo
				//peut etre � changer en stack si besoin pour les autres Expr...
				functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("nil",registresExpr.push,null,null))
				return registresExpr.pop;
			}
			else{
				//TODO  controler la pr�sence de la variable dans la liste des variable,
				//Si elle n'existe pas on fait quoi ?
				//+diff�rence VARIABLE vs SYMBOLE ??
				return functionTable.getVariable(currentName,e.valeur);
			}
			//TODO :Pour les call, checker le nb de param
		}
		else if(e.ope.equals("cons")) {
			var name = registresExpr.push;
			for(expr : e.lexpr.exprs.reverseView){
				functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("cons",name,expr.compile,name))
			}
			return registresExpr.pop;
		}
		else if(e.ope.equals("list")) {
			var name = registresExpr.push;
			for(expr : e.lexpr.exprs.reverseView){
				functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode("list",name,expr.compile,name))
			}
			return registresExpr.pop;
		}
		else if(e.ope.equals("hd") || e.ope.equals("tl") || e.ope.equals("!")) {
			var name = registresExpr.push;
			functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode(e.ope,name,e.expr.compile,null))
			return registresExpr.pop;
		}
		else if(e.ope.equals("and") || e.ope.equals("or") || e.ope.equals("=?")) {
			var name = registresExpr.push;
			functionTable.addThreeAddrInstruction(currentName, new ThreeAddrCode(e.ope,name,e.ex1.compile,e.ex2.compile))
			return registresExpr.pop;
		}
		
	}
}
