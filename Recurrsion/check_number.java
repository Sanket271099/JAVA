package Recurrsion;

public class check_number {
public static boolean check(int arr[],int x) {
if(arr.length==1) {
	if(arr[0]==x) {
		return true;
	}
	return false;
}
int arr1[]=new int[arr.length-1];
for(int i=0;i<arr.length-1;i++) {
	arr1[i]=arr[i];
}
if(arr[arr.length-1]==x) {
	return true;
}
return check(arr1,x);

}
public static void main(String[] args) {
	int arr[]= {1,2,456,56,6,5,7,8};
	System.out.println(check(arr, 5));
}
}
