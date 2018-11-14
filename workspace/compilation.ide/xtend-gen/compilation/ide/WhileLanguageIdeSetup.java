/**
 * generated by Xtext 2.15.0
 */
package compilation.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import compilation.WhileLanguageRuntimeModule;
import compilation.WhileLanguageStandaloneSetup;
import compilation.ide.WhileLanguageIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class WhileLanguageIdeSetup extends WhileLanguageStandaloneSetup {
  @Override
  public Injector createInjector() {
    WhileLanguageRuntimeModule _whileLanguageRuntimeModule = new WhileLanguageRuntimeModule();
    WhileLanguageIdeModule _whileLanguageIdeModule = new WhileLanguageIdeModule();
    return Guice.createInjector(Modules2.mixin(_whileLanguageRuntimeModule, _whileLanguageIdeModule));
  }
}