package compilation.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class FunctionTable {

	


	/** Instance unique pré-initialisée */
	private static FunctionTable INSTANCE = new FunctionTable();

	/**
	 * Repertoire de fonctions representee par une liste de structures
	 * FunctionDescriptor
	 */
	private Map<String, FunctionDescriptor> functionDirectory;	

	/** Constructeur privé */
	private FunctionTable() {
		this.functionDirectory = new HashMap<String, FunctionDescriptor>();
	}

	/** Point d'accès pour l'instance unique du singleton */
	public static FunctionTable getInstance() {
		return INSTANCE;
	}

	public void addFunction(String functionName, int out) {
		FunctionDescriptor fd = new FunctionDescriptor(out);
		this.functionDirectory.put(functionName, fd);
	}

	public void addThreeAddrInstruction(String functionName, ThreeAddrCode instr) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			currentFd.addInstruction(instr);
		}
		// TODO gestion des erreurs ?
	}

	public void addVariable(String functionName, String whileName) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			currentFd.addVariable(whileName, "whileVar['"+whileName+"']");
		}
		// TODO gestion des erreurs ?
	}

	public void addInput(String functionName, String whileName) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			currentFd.addInput(whileName);
			currentFd.addVariable(whileName, "param"+whileName+"");
		}
		// TODO gestion des erreurs ?
	}

	private Map<String, FunctionDescriptor> getFunctionDirectory() {
		return this.functionDirectory;
	}

	public List<String> getInput(String functionName) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			return currentFd.getInput();
		}
		return null;
		// TODO gestion des erreurs ?
	}

	public int getOutput(String functionName) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			return currentFd.getOutput();
		}
		return -1;
		// TODO gestion des erreurs ?
	}

	public List<ThreeAddrCode> getInstructions(String functionName) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			return currentFd.getInstructions();
		}
		return null;
		// TODO gestion des erreurs ?
	}

	public Set<String> getFunctions() {
		return this.getFunctionDirectory().keySet();
	}

	public String getVariable(String functionName, String variable) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			return currentFd.getVariables().get(variable);
		}
		return null;
		// TODO gestion des erreurs ?
	}
	public boolean varExists(String functionName, String variable) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			return currentFd.getVariables().containsKey(variable);
		}
		return false;
	}

	public void popFromInstructionList(String functionName) {
		FunctionDescriptor currentFd = this.functionDirectory.get(functionName);
		if (currentFd != null) {
			currentFd.getInstructionList().pop();
		}
	}
}
