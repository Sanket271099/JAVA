package Recurrsion;

public class SortedCheck {
public static boolean check(int arr[]) {
	if(arr.length==1) {
		return true;
	}
	int smallarr[]=new int[arr.length-1];
	for(int i=1;i<arr.length;i++) {
		smallarr[i-1]=arr[i];
	}
	boolean smallAns=check(smallarr);
	if(!smallAns) {
		return false;
	}
	if(arr[0]<arr[1]) {
		return true;
	}else {
		return false;
	}
	
}
public static boolean check1v(int arr[]) {
	if(arr.length==1) {
		return true;
	}
	if(arr[0]>arr[1]) {
		return false;
	}
	int smallarr[]=new int[arr.length-1];
	for(int i=1;i<arr.length;i++) {
		smallarr[i-1]=arr[i];
	}
	boolean smallAns=check(smallarr);
	return smallAns;
}
public static boolean checkBetter(int arr[],int startIndex) {
	if(startIndex==arr.length-1) {
		return true;
	} 
	if(arr[startIndex]>arr[startIndex+1]) {
		return false;
	}
	return checkBetter(arr, startIndex+1);
}
public static boolean checkSortedBetter(int arr[]) {
	
	return checkSortedBetter(arr,0);
}
private static boolean checkSortedBetter(int arr[],int x) {
	if(x==arr.length-1) {
		return true;
	} if(arr[x]>arr[x+1]) {
		return false;
	}
	return checkSortedBetter(arr, ++x);
}
public static void main(String[] args) {
	int arr[]= {1,2,5,6,7,9};
	System.out.println(checkSortedBetter(arr));
}
}
