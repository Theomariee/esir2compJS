package compilation.generator;

public class ThreeAddrCode {
	String op;
	String addr1;
	String addr2;
	String addr3;
	
	public ThreeAddrCode(String op, String addr1, String addr2, String addr3) {
		super();
		this.op = op;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
	}

	@Override
	public String toString() {
		return "<" + op + ", " + addr1 + ", " + addr2 + ", " + addr3+ ">";
	}
	public String compile() {
		switch(op) {
		case "nop" :
			return "WhLib.nop();";
		default :
			return "WhLib.nonImpl();";
		}
	}
	
}
