package compilation.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FunctionDescriptor {
	private List<String> inputs;
	private int output;
	private List<ThreeAddrCode> instructions;
	private Map<String, String> variables;
	private Stack<List<ThreeAddrCode>> instructionList; 

	public FunctionDescriptor(int out) {
		this.inputs = new ArrayList<String>();
		this.output = out;
		// Les instruction peuvent peut-être etre triée ? (déclaration d'abord...)
		this.instructions = new LinkedList<ThreeAddrCode>();
		this.variables = new HashMap<String, String>();
		this.instructionList= new Stack<List<ThreeAddrCode>>();
	}

	public void addInstruction(ThreeAddrCode instruction) {
		if (instructionList.isEmpty()) {
			this.instructions.add(instruction);
		}
		else {
			this.instructionList.peek().add(instruction);
		}
		if (instruction.getSinon() != null)
			this.instructionList.push(instruction.getSinon());
		if (instruction.getAlors() != null)
			this.instructionList.push(instruction.getAlors());
	}

	public Stack<List<ThreeAddrCode>> getInstructionList() {
		return instructionList;
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
