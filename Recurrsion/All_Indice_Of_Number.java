package Recurrsion;
//All Indices of Number
//Send Feedback
//Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
//Do this recursively. Indexing in the array starts from 0.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Line 3 : Integer x
//Output Format :
//indexes where x is present in the array (separated by space)
//Constraints :
//1 <= N <= 10^3
//Sample Input :
//5
//9 8 10 8 8
//8
//Sample Output :
//1 3 4
public class All_Indice_Of_Number {
	 public static int[] helper(int input[],int x,int i){
	  
	if(input.length==i) {
		int output[]=new int[0];
		return  output;
	}
	int output[]=helper(input, x, i+1);
	if(input[i]==x) {
		int ans[]=new int[output.length+1];
		ans[0]=i;
		for(int j=0;j<output.length;j++) {
			ans[j+1]=output[j];
		}
		return ans;
	}
	return output;
	 }	    
			public static int[] allIndexes(int input[], int x) {
			int[] output=helper(input,x,0);
		        return output;
		}

	
public static void main(String[] args){
int arr[]= {1,2,3,4,5,6,65,6,6,6,6};
int x=6;

int arr1[]=allIndexes(arr, x);
for(int i=0;i<arr1.length;i++) {
	System.out.print(arr1[i]+" ");
}
}
}
