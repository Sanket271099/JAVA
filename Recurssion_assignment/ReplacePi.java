package Recurssion_assignment;
//Replace pi (recursive)
//Send Feedback
//Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
//Sample Input 1 :
//xpix
//Sample Output :
//x3.14x
//Sample Input 2 :
//pipi
//Sample Output :
//3.143.14
//Sample Input 3 :
//pip
//Sample Output :
//3.14p

import Recurrsion.main;

public class ReplacePi {
	public static String replace(String str) {
if(str.length()<=1) {
	return str;
}
		String s=replace(str.substring(1));
		if(str.charAt(0)=='p'&&str.charAt(1)=='i') {
			return s="3.14"+s.substring(1);
			
		}else {
			return s=str.charAt(0)+s;
		}
	}
	
		
	public static void main(String[] args) {
		String s=replace("Sanket pi pi pi");
	System.out.println(s);
	}
}
