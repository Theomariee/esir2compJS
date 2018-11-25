package compilation.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FunctionDescriptor {
	private List<String> inputs;
	private int output;
	private List<ThreeAddrCode> instructions;
	private Map<String, String> variables;
	
	public FunctionDescriptor(int out) {
		this.inputs = new ArrayList<String>();
		this.output = out;
		this.instructions = new LinkedList<ThreeAddrCode>();
		this.variables = new HashMap<String, String>();
	}
	
	public void addInstruction(ThreeAddrCode instruction) {
		this.instructions.add(instruction);
	}
	
	public void addVariable(String whileName, String jsName) {
		this.variables.put(whileName, jsName);
	}
	public void addInput(String whileName) {
		this.inputs.add(whileName);
	}

	public List<String> getInput() {
		return inputs;
	}

	public int getOutput() {
		return output;
	}

	public List<ThreeAddrCode> getInstructions() {
		return instructions;
	}

	public Map<String, String> getVariables() {
		return variables;
	}
}
