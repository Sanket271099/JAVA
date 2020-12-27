package selection_sort;

public class selection_sort {
	public static void selection_sort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int min_Ad=i;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					min_Ad=j;
				}
			}
			if(i!=min_Ad) {
				arr[min_Ad]=arr[i];
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
	int arr[]= {1,2,3,66,2,7,8,23,42,32,9,4,5,3,2,5,55,6,2,3};
	selection_sort(arr);
	print(arr);
}
}
