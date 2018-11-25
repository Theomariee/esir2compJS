package compilation.generator;

import java.util.HashMap;
import java.util.Map;

public class FunctionTable {
	
	private static int varCounter = 0;
	
    private String generateNewVariable() {
    	return "var" + varCounter++;
    }
	
    /** Instance unique pré-initialisée */
    private static FunctionTable INSTANCE = new FunctionTable();
    
    /** Repertoire de fonctions representee par une liste de structures FunctionDescriptor */
    private static Map<String, FunctionDescriptor> functionDirectory;
	
	/** Constructeur privé */
    private FunctionTable()
    {
    	this.functionDirectory = new HashMap<String, FunctionDescriptor>();
    }

    /** Point d'accès pour l'instance unique du singleton */
    public static FunctionTable getInstance()
    {   return INSTANCE;
    }
    
    public void addFunction(String functionName, int in, int out) {
    	FunctionDescriptor fd = new FunctionDescriptor(in, out);
    	this.functionDirectory.put(functionName, fd);
    }
    
    public void addThreeAddrInstruction(String functionName, ThreeAddrCode instr) {
    	FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
    	if (currentFd != null) {
    		currentFd.addThreeAddrInstruction(instr);
    	}
    	// TODO gestion des erreurs ?
    }
    
    public void addVariable(String functionName, String whileName) {
    	FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
    	if (currentFd != null) {
    		currentFd.addVariable(whileName, generateNewVariable());
    	}
    	// TODO gestion des erreurs ?
    }
    
    
    public Map<String, FunctionDescriptor> getFunctionDirectory() {
    	return this.functionDirectory;
    }
}
