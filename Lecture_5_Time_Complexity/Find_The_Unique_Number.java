package Lecture_5_Time_Complexity;
//Find the Unique Element
//Send Feedback
//Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
//You need to find and return that number which is unique in the array.
//Note : Given array will always contain odd number of elements.
//Input format :
//Line 1 : Array size i.e. 2N+1
//Line 2 : Array elements (separated by space)
//Output Format :
//Unique element present in the array
//Constraints :
//1 <= N <= 10^6
//Sample Input :
//7
//2 3 1 6 3 6 2
//Sample Output :
//1
public class Find_The_Unique_Number {
public static int Unique(int arr[]) {
	int count=0;
	int unique=Integer.MIN_VALUE;
	int size=arr.length;
	for(int i=0;i<size;i++) {
		count=0;
		for(int j=0;j<size;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count==1) {
			unique=arr[i];
		}
	}
	return unique;
}
	public static void main(String[] args) {
		int arr[]= {1,1,44,5,3,5,3,66,6,6,66};
System.out.println(Unique(arr));

	}

}
