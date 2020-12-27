package Recurssion_2;
//MergerSorrt done bt bubble sort
//Merge Sort Code
//Send Feedback
//Sort an array A using Merge Sort.
//Change in the input array itself. So no need to return or print anything.
//Input format :
//Line 1 : Integer n i.e. Array size
//Line 2 : Array elements (separated by space)
//Output format :
//Array elements in increasing order (separated by space)
//Constraints :
//1 <= n <= 10^3
//Sample Input 1 :
//6 
//2 6 8 5 4 3
//Sample Output 1 :
//2 3 4 5 6 8
//Sample Input 2 :
//5
//2 1 5 2 3
//Sample Output 2 :
//1 2 2 3 5 
public class MergeSort {
	public static void mergeSort(int arr[],int si,int ei) {
		 if(si>=ei) {
		    	return;
		    }
		int mid=(si+ei)/2;
    mergeSort(arr,si,mid);
		mergeSort(arr,mid+1,ei);
		merge(arr,si,ei);
	}
	private static void merge(int arr[],int si,int ei) {
	int i=si;

	int mid=(si+ei)/2;
	int j=mid+1;
	int k=0;
	int ans[]=new int[ei-si+1];
	while(i<=mid&&j<=ei) {
		if(arr[i]<arr[j]) {
			ans[k]=arr[i];
			k++;
			i++;
		}else {
			ans[k]=arr[j];
			k++;
			j++;
		}
	}
	while(i<=mid) {
		ans[k]=arr[i];
		i++;
		k++;
	}
	while(j<=ei) {
		ans[k]=arr[j];
		k++;
		j++;
	}
	for( i=0;i<ans.length;i++) {
		arr[i+si]=ans[i];
	}
	}
public static void main(String[] args) {
	int arr[]= {1,2,4,5,1,2,3,1,24};
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	}
	mergeSort(arr,0,arr.length-1);
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
}
}
