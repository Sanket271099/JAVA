package Recusrrion;

public class index {
	public static int[] index(int []arr,int x) {
		int count=0;
return index(arr,x,count);
	} 
	private static int[] index(int arr[],int x,int count){
	if(arr.length==count) {
	
		int ans[]=new int[0];
		return ans;
	}
	int ans[]=index(arr,x,count+1);
	if(arr[count]==x){
		
		int ans1[]=new int[ans.length+1];
		
		ans1[0]=count;
		for(int i=0;i<ans.length;i++) {
			ans1[i+1]=ans[i];
		}
		return ans1;
	}
	return ans;	
	 }
public static void main(String[] args) {
	int arr[]={1,4,5,4,3,3,2,5,5,5,3,3,3,3,3};
	int x=3;
	int ans[]=index(arr,x);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
}
}
