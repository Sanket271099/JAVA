package Recusrrion;

public class String_to_Int {
	public static int convert(String str) {
		if(str.length()==1) {
			return  (int)str.charAt(0)-'0';
		}
		int last=convert(str.substring(1));
		int first=(int)(str.charAt(0)-'0');
		int mul=(int)Math.pow(10, str.length()-1);
		int ans=first*mul+last;
		return ans;
		
	}
	public static int typetwo(String str) {
		if(str.length()==1) {
			return (int)str.charAt(0)-'0';
		}
		int ans;
		ans=str.charAt(0)-'0';
		ans=ans*(int)Math.pow(10, str.length()-1);
		int last=typetwo(str.substring(1));
		ans=ans+last;
		return ans;
		}
public static void main(String[] args) {
	System.out.println(typetwo("124434"));
}
}
