package Recurssion_2;

public class ReplaceCharacter {
public static String Replace(String str,char c1,char c2) {
	           if(str.length()==0) {
	        	   return str;
	           }String ans="";
	           if(str.charAt(0)==c1) {
	        	   ans=c2+ans;
	           }else {
	        	   ans=str.charAt(0)+ans;
	           }
	         String smallAns= Replace(str.substring(1),c1,c2);
	         ans=ans+smallAns;
	         return ans;
 	}                                                                         
public static void main(String[] args) {
	System.out.println(Replace("Snaket",'n','a'));
}
}
