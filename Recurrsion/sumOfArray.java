package Recurrsion;
//Sum of Array
//Send Feedback
//Given an array of length N, you need to find and return the sum of all elements of the array.
//Do this recursively.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Output Format :
//Sum
//Constraints :
//1 <= N <= 10^3
//Sample Input 1 :
//3
//9 8 9
//Sample Output 1 :
//26
//Sample Input 2 :
//3
//4 2 1
//Sample Output 2 :
//7    
public class sumOfArray {
public static int sum(int arr[]) {
	//   int sum=0;
	   if(arr.length==1) {
		   return arr[0];
	   }
	   int arr1[]=new int[arr.length-1];
	   for(int i=1;i<arr.length;i++) {
		   arr1[i-1]=arr[i];
	   }
	   
        return arr[0]+sum(arr1);                                  
	
}
public static void main(String[] args) {
	int arr[] ={1,2,4,23};
System.out.println(sum(arr));
}
}
