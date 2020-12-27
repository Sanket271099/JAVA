package Lecture_5_Time_Complexity;


//Duplicate in array
//Send Feedback
//Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice. You need to find and return that duplicate number present in the array.
//Assume, duplicate number is always present in the array.
//Input format :
//Line 1 : Size of input array
//Line 2 : Array elements (separated by space)
//Output Format :
//Duplicate element
//Constraints :
//1 <= n <= 10^6
//Sample Input:
//9
//0 7 2 5 4 7 1 3 6
//Sample Output:
//7
public class Find_the_Duplicate_one {
	public static int duplicate(int arr[]) {
		int count=0;
		int duplicate=Integer.MIN_VALUE;
		int size=arr.length;
		for(int i=0;i<size;i++) {
			count=0;
			for(int j=0;j<size;j++) {
			    if(arr[i]==arr[j]) {
			    	count++;
			    }
			}
			if(count==2) {
				duplicate=arr[i];
			}
		}
		return duplicate;
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,22,22,6,};
	System.out.println(duplicate(arr));
}
}
