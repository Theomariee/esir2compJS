package compilation.generator;

public class ThreeAddrCode {
	String op;
	String res;
	String a;
	String b;
	public ThreeAddrCode(String op, String res, String a, String b) {
		super();
		this.op = op;
		this.res = res;
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "<" + op + ", " + res + ", " + a + ", " + b+ ">";
	}
	
}
