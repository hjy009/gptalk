package gptalk;

public class Grammar {

	String[] gs ;
	String[] result;
	String[] expt;
	
	public void init() {
		gs = new String[4];
		gs[0] = "*+e=*";
		gs[1] = "e+*=*";
		gs[2] = "(1+1)*=11*";
		gs[3] = "(*1+*1)*=((*+1)+*)1*";
		
		expt = new String[1];
		expt[0] = "**";
	}

	public void simple() {
		result = expt.clone();		
	}
	
	public boolean isExpect() {
		//result[0] = "*";
		System.out.println(expt[0]);;
		System.out.println(result[0]);;
		
		if (expt.length != result.length) { 
			return false;
		}
		for (int i=0;i<expt.length;i++) {
			if (! expt[i].contentEquals(result[i]))
				return false;
		}
		return true;
	}
	
}
