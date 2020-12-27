import java.util.Scanner;
public class Selection_sort {
public static void Selection_Sort(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
	int min=arr[i];
	int minindex=i;
	for(int j=i+1;j<arr.length;j++) {
		if(min>arr[j]) {
			min=arr[j];
			minindex=j;
		}
	}
	if(minindex!=i) {
	arr[minindex]=arr[i];
	arr[i]=min;
	}
}
	
}
public static void print(int arr[]) {
	int i=0;
	while(i<arr.length) {
		System.out.print(arr[i]+" ");
		i++;
	}
}
	
public static void main(String[] args) {
	
	for(int n=10;n<1000000000;n=n*10) {
	    int input[]=new int[n];
	for(int i=0;i<input.length;i++) {
		input[i]=input.length-1;
	}
	long startTime=System.currentTimeMillis();
	Selection_Sort(input);
	long endTime=System.currentTimeMillis();
	System.out.println("time by merge sort for"+n+"is   "+(endTime-startTime));
}
}
}
