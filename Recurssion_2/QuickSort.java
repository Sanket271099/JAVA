package Recurssion_2;

public class QuickSort {
	public static void quickSort(int arr[], int si,int ei) {
		if(si>=ei) {
			return ;
			}
	int pivote=partition(arr,si,ei);
	quickSort(arr,si,pivote-1);
	quickSort(arr,pivote+1,ei);
	}
	
	public static int partition(int arr[],int si,int ei) {
	int index;
	int count=0;
	int pivote=arr[si];
	int k=si+1;
	while(k<=ei) {
		if(arr[k]<=pivote) {
			count++;
		}
		k++;
	}
	System.out.println(count);
	index=count+si;
	System.out.println(index+"index");
	//swap
	arr[si]=arr[index];
	arr[index]=pivote;
	int i=0;
	int j=ei;
	while(i<index&&j>index) {
		if(arr[i]<=arr[index]) {
			i++;
		}
		else if(arr[j]>arr[index]) {
			j--;
		}
		else  {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j++;
		}
		
	}
	return index;
	}
public static void main(String[] args) {
	int arr[]= {1,2,5,5,3,6,9,7,8,9,8,6,5,3,6,9,9};
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	quickSort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
