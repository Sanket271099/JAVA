package Recurssion_assignment;
//String to Integer
//Send Feedback
//Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
//Input format :
//Numeric string S (string, Eg. "1234")
//Output format :
//Corresponding integer N (int, Eg. 1234)
//Constraints :
//0 <= |S| <= 9
//where |S| represents length of string S.
//Sample Input 1 :
//1231
//Sample Output 1 :
//1231
//Sample Input 2 :
//12567
//Sample Output 2 :
//12567
public class String_To_Integer {
	public static int convertStringToInt(String input){
		// int ans=0;
		//         int count=0;
		//             int arr[]=new int[input.length()-1];
		//    return helper(input,ans,arr,count);
		    // int ans = 0;
		    // for(int i=0;i<input.length();i++){
		    // ans = ans*10 + (int)(input.charAt(i)-'0');
		    // }
		    // return ans;
        	if(input.length()==1){
                return (int)(input.charAt(0)-'0');
            }
        
        	int rec = convertStringToInt(input.substring(1));
        	System.out.println(rec+" this one is rec ");
        	int mul = (int)Math.pow(10,input.length()-1);
        	System.out.println(" this one is charAt "+((int)(input.charAt(0)-'0'))+rec);
        	int ans = rec+ ( ((int)(input.charAt(0)-'0')) * mul );
        	System.out.println(" this oen is asn "+ans);
        	return ans;
		}
public static void main(String[] args) {
	int t=convertStringToInt(" 123456 ");
		System.out.println(t);
}
}
//dudk till dawn
//