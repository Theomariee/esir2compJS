package compilation.generator;

import java.util.LinkedList;

public class RegisterList {
	LinkedList<String> registres = new LinkedList<String>();
	private int counter = 0;
	private String prefixe;
	public RegisterList(String prefixe) {
		this.prefixe = prefixe;
	}
	
	public String push() {
		registres.add(prefixe+counter);
		return prefixe+(counter++);
	}
	
	public String pop() {
		return registres.pop();
	}
	public String getNextReg() {
		return prefixe+counter;
	}
	
	
}
