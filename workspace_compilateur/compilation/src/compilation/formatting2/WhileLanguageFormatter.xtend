/*
 * generated by Xtext 2.15.0
 */
package compilation.formatting2

import com.google.inject.Inject
import compilation.services.WhileLanguageGrammarAccess
import compilation.whileLanguage.Function
import compilation.whileLanguage.Program
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class WhileLanguageFormatter extends AbstractFormatter2 {
	
	@Inject extension WhileLanguageGrammarAccess

	def dispatch void format(Program program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (function : program.functions) {
			function.format
		}
	}

	def dispatch void format(Function function, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		function.definition.format
	}
	
	// TODO: implement for Definition, Affectation, Commands, Command, Foreach, If, For, While, Expr, Lexpr
}
