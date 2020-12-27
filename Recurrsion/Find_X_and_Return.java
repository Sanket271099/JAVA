package Recurrsion;
//First Index of Number
//Send Feedback
//Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
//First index means, the index of first occurrence of x in the input array.
//Do this recursively. Indexing in the array starts from 0.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Line 3 : Integer x
//Output Format :
//first index or -1
//Constraints :
//1 <= N <= 10^3
//Sample Input :
//4
//9 8 10 8
//8
//Sample Output :
//1
public class Find_X_and_Return {
public static int find(int arr[],int x) {
	return find(arr,x,0);
}
private static int find(int arr[],int x,int ad) {
	if(ad==arr.length-1) {
		if(arr[ad]==x) {
			return ad;
		}else {
			return -1;
		}
	}if(arr[ad]==x) {
		return ad;
	}
	
	return find(arr,x,++ad);
	
}public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int x=4;
	System.out.println(find(arr,x));
}
}
