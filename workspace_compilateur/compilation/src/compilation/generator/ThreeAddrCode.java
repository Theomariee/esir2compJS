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
		switch(this.op) {
		case "nop" :
			return "nop();";
		case "ret" :
			return "return "+addr1+";";
		case "push":
			return addr1+".push("+addr2+");";
		case "array":
			return "var "+addr1+" = [];";
		case "aff":
			return addr1+" = "+addr2+";";
		case "nil":
			return addr1+" = nil();";
		case "cons":
			return addr1+" = cons("+addr2+", "+addr3+");"; // return concaténation de addr2(gauche) et addr3(droite) 
			// Attention à bien différentier si addr3 est un bintree ou pas. Si oui, merger, sinon, retourner addr2 sans concaténation (ca veut dire que c'est l'init)!
		case "list":
			return addr1+" = list("+addr2+", "+addr3+");"; // return concaténation de addr2(gauche) et addr3(droite)
			// Attention à bien différentier si addr3 est un bintree ou pas. Si oui, merger, sinon, retourner addr2 concaténé avec un nil à gauche (ca veut dire que c'est l'init)!
		case "hd":
			return addr1+" = hd("+addr2+");";
		case "tl":
			return addr1+" = tl("+addr2+");";
		case "!":
			return addr1+" = not("+addr2+");";
		case "and":
			return addr1+" = and("+addr2+","+addr3+");";
		case "or":
			return addr1+" = or("+addr2+","+addr3+");";
		case "=?":
			return addr1+" = eq("+addr2+","+addr3+");";
		case "symb":
			return addr1+" = symb(\'"+addr2+"\');";
		default :
			return "nonImpl();";
		}
	}
	
}
