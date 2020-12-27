package Recusrrion;



public class Subsequence {
             
	public static String[] SubSequnece(String str) {
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String smallans[]=SubSequnece(str.substring(1));
		String ans[]=new String[smallans.length*2];
                     for(int i=0;i<smallans.length;i++) {
                    	 ans[i]=smallans[i];
                     }
                     for(int i=0;i<smallans.length;i++) {
                    	 ans[i+smallans.length]=str.charAt(0)+smallans[i];
                     }
                     return ans;
	}  
	public static void main(String[] args) {
			String ans[]=SubSequnece("XYZ");
			for(int i=0;i<ans.length;i++) {
				System.out.println(ans[i]);
			}
	}

}
