/**
 * generated by Xtext 2.15.0
 */
package compilation.generator;

<<<<<<< HEAD
import com.google.common.collect.Iterables;
import compilation.whileLanguage.Command;
import compilation.whileLanguage.Commands;
import compilation.whileLanguage.Definition;
import compilation.whileLanguage.Function;
import compilation.whileLanguage.Program;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> f5dc28789b83d9b75484de810c0f74677736ed83
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
<<<<<<< HEAD
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
=======
>>>>>>> f5dc28789b83d9b75484de810c0f74677736ed83

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WhileLanguageGenerator extends AbstractGenerator {
<<<<<<< HEAD
  private final static Map<String, Integer> DEFAULT_MAP = new HashMap<String, Integer>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.doGenerate(resource, fsa, context, "output.wh", WhileLanguageGenerator.DEFAULT_MAP);
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context, final String output, final Map<String, Integer> indentations) {
    Iterable<Program> _filter = Iterables.<Program>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Program.class);
    for (final Program e : _filter) {
      boolean _equals = output.equals("");
      if (_equals) {
        System.out.print(this.compile(e));
      } else {
        fsa.generateFile(output, this.compile(e));
      }
    }
  }
  
  public CharSequence compile(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Function> _functions = p.getFunctions();
      for(final Function f : _functions) {
        CharSequence _compile = this.compile(f);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Function f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function ");
    String _name = f.getName();
    _builder.append(_name);
    _builder.append(" :");
    _builder.newLineIfNotEmpty();
    CharSequence _compile = this.compile(f.getDefinition());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Definition d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("read ");
    {
      EList<String> _variable = d.getRead().getVariable();
      boolean _hasElements = false;
      for(final String vr : _variable) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(vr);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    _builder.append("  ");
    CharSequence _compile = this.compile(d.getCommands());
    _builder.append(_compile, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    _builder.append("write ");
    {
      EList<String> _variable_1 = d.getWrite().getVariable();
      boolean _hasElements_1 = false;
      for(final String vw : _variable_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(vw);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Commands c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Command> _commands = c.getCommands();
      for(final Command command : _commands) {
        _builder.append("Ceci est une commande");
        _builder.newLine();
      }
    }
    return _builder;
=======
  public final static int INDENT_ALL = 0;
  
  public final static int INDENT_FOR = 1;
  
  public final static int INDENT_WHILE = 2;
  
  public final static int INDENT_IF = 3;
  
  public final static int INDENT_FOREACH = 4;
  
  public final static int INDENT_DO = 5;
  
  private List<Integer> indentations = new ArrayList<Integer>();
  
  private String indentFor;
  
  private String indentWhile;
  
  private String indentIf;
  
  private String indentForeach;
  
  private String indentDo;
  
  private int i;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    WhileLanguageGenerator.init(this.indentations);
    this.doGenerate(resource, fsa, context, "", this.indentations);
  }
  
  public static void init(final List<Integer> integers) {
    integers.add(WhileLanguageGenerator.INDENT_ALL, Integer.valueOf(2));
    integers.add(WhileLanguageGenerator.INDENT_FOR, Integer.valueOf(0));
    integers.add(WhileLanguageGenerator.INDENT_WHILE, Integer.valueOf(0));
    integers.add(WhileLanguageGenerator.INDENT_IF, Integer.valueOf(0));
    integers.add(WhileLanguageGenerator.INDENT_FOREACH, Integer.valueOf(0));
    integers.add(WhileLanguageGenerator.INDENT_DO, Integer.valueOf(0));
  }
  
  public void calcIndent(final List<Integer> integers) {
    for (this.i = 0; (this.i < (this.indentations.get(WhileLanguageGenerator.INDENT_ALL)).intValue()); this.i++) {
      {
        String _indentFor = this.indentFor;
        this.indentFor = (_indentFor + " ");
        String _indentWhile = this.indentWhile;
        this.indentWhile = (_indentWhile + " ");
        String _indentIf = this.indentIf;
        this.indentIf = (_indentIf + " ");
        String _indentForeach = this.indentForeach;
        this.indentForeach = (_indentForeach + " ");
        String _indentDo = this.indentDo;
        this.indentDo = (_indentDo + " ");
      }
    }
    Integer _get = this.indentations.get(WhileLanguageGenerator.INDENT_FOR);
    boolean _notEquals = ((_get).intValue() != 0);
    if (_notEquals) {
      this.indentFor = "";
    }
    for (this.i = 0; (this.i < (this.indentations.get(WhileLanguageGenerator.INDENT_FOR)).intValue()); this.i++) {
      String _indentFor = this.indentFor;
      this.indentFor = (_indentFor + " ");
    }
    Integer _get_1 = this.indentations.get(WhileLanguageGenerator.INDENT_WHILE);
    boolean _notEquals_1 = ((_get_1).intValue() != 0);
    if (_notEquals_1) {
      this.indentWhile = "";
    }
    for (this.i = 0; (this.i < (this.indentations.get(WhileLanguageGenerator.INDENT_WHILE)).intValue()); this.i++) {
      String _indentWhile = this.indentWhile;
      this.indentWhile = (_indentWhile + " ");
    }
    Integer _get_2 = this.indentations.get(WhileLanguageGenerator.INDENT_IF);
    boolean _notEquals_2 = ((_get_2).intValue() != 0);
    if (_notEquals_2) {
      this.indentIf = "";
    }
    for (this.i = 0; (this.i < (this.indentations.get(WhileLanguageGenerator.INDENT_IF)).intValue()); this.i++) {
      String _indentIf = this.indentIf;
      this.indentIf = (_indentIf + " ");
    }
    Integer _get_3 = this.indentations.get(WhileLanguageGenerator.INDENT_FOREACH);
    boolean _notEquals_3 = ((_get_3).intValue() != 0);
    if (_notEquals_3) {
      this.indentForeach = "";
    }
    for (this.i = 0; (this.i < (this.indentations.get(WhileLanguageGenerator.INDENT_FOREACH)).intValue()); this.i++) {
      String _indentForeach = this.indentForeach;
      this.indentForeach = (_indentForeach + " ");
    }
    Integer _get_4 = this.indentations.get(WhileLanguageGenerator.INDENT_DO);
    boolean _notEquals_4 = ((_get_4).intValue() != 0);
    if (_notEquals_4) {
      this.indentDo = "";
    }
    for (this.i = 0; (this.i < (this.indentations.get(WhileLanguageGenerator.INDENT_DO)).intValue()); this.i++) {
      String _indentDo = this.indentDo;
      this.indentDo = (_indentDo + " ");
    }
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context, final String output, final List<Integer> indentations) {
    this.indentations = indentations;
    this.calcIndent(this.indentations);
    System.out.println(indentations);
>>>>>>> f5dc28789b83d9b75484de810c0f74677736ed83
  }
}
