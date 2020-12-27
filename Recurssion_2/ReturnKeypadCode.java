package Recurssion_2;

public class ReturnKeypadCode{
	public static String[] keypad(int n) {
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		int lastNum=n%10;
		String output1[]=helper(lastNum);
		int left=n/10;
		String output2[]= keypad(left);
		String ans[]=new String[output1.length*output2.length];
		int k=0;
		for(int i=0;i<output1.length;i++) {
			for(int j=0;j<output2.length;j++) {
				ans[k]=output2[j]+output1[i];
				k++;
			}
		}
		return ans;
				}
	private static String[] helper(int n) {
		if(n==2) {
			String ans[]= {"a","b","c"};
			return ans;
		}if(n==3) {
			String ans[]= {"d","e","f"};
			return ans;
		}
		if(n==4) {
			String ans[]= {"g","h","i"};
			return ans;
		}
		if(n==5) {
			String ans[]= {"j","k","l"};
			return ans;
		}
		if(n==6) {
			String ans[]= {"m","n","o"};
			return ans;
		}
		if(n==7) {
			String ans[]= {"p","q","r","s"};
			return ans;
		}
		if(n==8) {
			String ans[]= {"t","u","u"};
			return ans;
		}
		else {
			String ans[]= {"w","x","y","z"};
			return ans;
		}

	}
public static void main(String[] args) {
	String ans[]=keypad(354);
for(int i=0;i<ans.length;i++) {
	System.out.println(ans[i]);
}
}
}
