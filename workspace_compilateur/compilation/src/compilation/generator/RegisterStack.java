package compilation.generator;

import java.util.Stack;
/*
 * Une liste FIFO qui permet de générer des variables selon un préfixe donnée
 */
public class RegisterStack {
	Stack<String> registres = new Stack<String>();
	private int counter = 0;
	private String prefixe;
	public RegisterStack(String prefixe) {
		this.prefixe = prefixe;
	}
	
	public String push() {
		registres.add(prefixe+"["+counter+"]");
		return prefixe+"["+(counter++)+"]";
	}
	
	public String pop() {
		return registres.pop();
	}
	public String getNextReg() {
		return prefixe+"["+counter+"]";
	}
	public String getPrefixe() {
		return prefixe;
	}
	public boolean isEmpty() {
		return this.registres.isEmpty();
	}
}
