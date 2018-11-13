/*
 * generated by Xtext 2.15.0
 */
package compilation.generator

import compilation.whileLanguage.Function
import java.util.Map
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
	
	//Ne sert que dans eclipse, pas dans les commande line
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('greetings.txt', 'People to greet: ' + 
			resource.allContents
				.filter(Function)
				.map[name]
				.join(', '))
	}
	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, String output, Map<String, Integer> indentations) {
		if(output.equals(""))
			System.out.println('Functions : ' + 
				resource.allContents
					.filter(Function)
					.map[name]
					.join(', '))
		fsa.generateFile(output, 'Functions : ' + 
			resource.allContents
				.filter(Function)
				.map[name]
				.join(', '))
		
	}
}
