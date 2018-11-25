package compilation.generator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FunctionDescriptor {
	private int input;
	private int output;
	private LinkedList<ThreeAddrCode> threeAddrInstructions;
	private Map<String, String> variables;
	
	public FunctionDescriptor(int in, int out) {
		this.input = in;
		this.output = out;
		this.threeAddrInstructions = new LinkedList<ThreeAddrCode>();
		this.variables = new HashMap<String, String>();
	}
	
	public void addThreeAddrInstruction(ThreeAddrCode p) {
		this.threeAddrInstructions.add(p);
	}
	
	public void addVariable(String whileName, String jsName) {
		this.variables.put(whileName, jsName);
	}

	public int getInput() {
		return input;
	}

	public int getOutput() {
		return output;
	}

	public LinkedList<ThreeAddrCode> getThreeAddrInstructions() {
		return threeAddrInstructions;
	}

	public Map<String, String> getVariables() {
		return variables;
	}
}
