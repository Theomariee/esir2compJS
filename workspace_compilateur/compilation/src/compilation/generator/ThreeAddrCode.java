package compilation.generator;

import java.util.LinkedList;
import java.util.List;

public class ThreeAddrCode {
	String op;
	String addr1;
	String addr2;
	String addr3;
	
	List<ThreeAddrCode> alors, sinon;
	
	public ThreeAddrCode(String op, String addr1, String addr2, String addr3) {
		super();
		this.op = op;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
		
		this.alors = null;
		this.sinon = null;
		
		switch(this.op) {
		case "while" : 
		case "foreach" :
		case "for" :
			alors = new LinkedList<ThreeAddrCode>();
			break;
		case "if":
			alors = new LinkedList<ThreeAddrCode>();
			sinon = new LinkedList<ThreeAddrCode>();
			break;
		default :
			break;
		}
	}

	@Override
	public String toString() {
		//return "<" + op + ", " + addr1 + ", " + addr2 + ", " + addr3+ ">";
		return "<" + op + ", " + addr1 + ", " + ((alors==null)?addr2:alors.toString()) + ", " + ((sinon==null)?addr3:sinon.toString())+ ">";
	}
	public String compile() {
		switch(this.op) {
		case "nop" :
			return "whlib.nop();";
		case "ret" :
			return "return "+addr1+";";
		case "push":
			return addr1+".push("+addr2+");";
		case "array":
			return "var "+addr1+" = [];";
		case "aff":
			return addr1+" = "+addr2+";";
		case "nil":
			return addr1+" = whlib.nil();";
		case "cons":
			return addr1+" = whlib.cons("+addr2+", "+addr3+");"; // return concaténation de addr2(gauche) et addr3(droite) 
			// Attention à bien différentier si addr3 est un bintree ou pas. Si oui, merger, sinon, retourner addr2 sans concaténation (ca veut dire que c'est l'init)!
		case "hd":
			return addr1+" = whlib.hd("+addr2+");";
		case "tl":
			return addr1+" = whlib.tl("+addr2+");";
		case "not":
			return addr1+" = whlib.not("+addr2+");";
		case "and":
			return addr1+" = whlib.and("+addr2+","+addr3+");";
		case "or":
			return addr1+" = whlib.or("+addr2+","+addr3+");";
		case "=?":
			return addr1+" = whlib.eq("+addr2+","+addr3+");";
		case "symb":
			return addr1+" = whlib.symb(\'"+addr2+"\');";
		case "while":
			String res = "";
			for(ThreeAddrCode threeAddrCode : alors)
				res += threeAddrCode.compile()+"\n";
			return "while(whlib.isTrue("+addr1+")){\n"+res+"}";
		//case "foreach":
		//case "for":
		//case "if":
		default :
			return "whlib.nonImpl();";
		}
	}

	public List<ThreeAddrCode> getAlors() {
		return alors;
	}

	public List<ThreeAddrCode> getSinon() {
		return sinon;
	}

	
}
