package Recusrrion;

public class removex {
	public static String RemoveX(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans="";
		if(str.charAt(0)!='x'&&str.charAt(0)!='X') {
			ans=str.charAt(0)+ans;
		}
		String smallAns=RemoveX(str.substring(1));
		return ans+smallAns;
	}
public static void main(String[] args) {
System.out.println(RemoveX("Sanketxx"));
	//System.out.println(Ans);
}
}
