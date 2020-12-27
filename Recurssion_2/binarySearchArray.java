package Recurssion_2;
//Binary Search (Recursive)
//Send Feedback
//Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
//Return -1 if x is not present in the given array.
//Note : If given array size is even, take first mid.
//Input format :
//
//Line 1 : Array size
//
//Line 2 : Array elements (separated by space)
//
//Line 3 : x (element to be searched)
//
//Sample Input :
//6
//2 3 4 5 6 8 
//5 
//Sample Output:
//3 
public class binarySearchArray {
	public static int searchArraybinary(int arr[],int x) {
		int si=0;
		int ei=arr.length-1;
	return SearchBinary(si,ei,arr,x);
	}
	public static int SearchBinary(int si,int ei,int arr[],int x) {
			int mid=(si+ei)/2;
			if(mid>ei||mid<si) {
				return -1;
			}

		if(x==arr[mid]) {
		return mid;
		}else if(x<arr[mid]) {
			return SearchBinary(si, mid-1, arr, x);
		}
			return SearchBinary(mid+1, ei, arr, x);
		
		
		
	}
public static void main(String[] args) {
	int arr[]= {0,2,4,5,10,11,18,29,223,2333,3333,111223};
	int x=2333;
	System.out.println(searchArraybinary(arr, x));
}
}
