package all_sort;

//import org.graalvm.compiler.phases.graph.MergeableState;

public class bubble_sort_merge {
	public static int [] merge_sort_array(int arr1[],int arr2[]) {
		int ans[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&& j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				ans[k]=arr2[j];
				j++;
				k++;
				//System.out.println(arr2[j]+"j");
			}
			else {
				ans[k]=arr1[i];
				//System.out.println(arr1[i]+"i");
				k++;
				i++;
			}
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		System.out.println("merge_sort_arrya_simple and easy way");
		return ans;
	}
	public static int [] merge_array(int arr1[],int arr2[]) {
		int size=arr1.length+arr2.length;
		int ans[]=new int[size];
		int j=0;
		int k=0;
		int a=0;
		for(int i=1;i<=2;i++) {
			while(j<arr1.length) {
				ans[a]=arr1[j];
				j++;
				a++;
			}
			while(k<arr2.length) {
				ans[a]=arr2[k];
				k++;
				a++;
			}
			
			
		}
		return ans;
		
	}
	public static void print(int arr[]) {
		int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
	}
	public static void bubble_sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Bubble_sort");
	}
	public static void Selection_sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int ad_min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					ad_min=j;
				}
			}if(ad_min!=i) {
			//	System.out.println("arr[ad_min]  "+arr[ad_min]);
			arr[ad_min]=arr[i];
			arr[i]=min;
		//	System.out.println(arr[i]+"  arr[i]");
		      }
			
		 }
		System.out.println("Selection_sort");
	}
	public static void Insertion_sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0&& arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("Insertion_sory");
	}
public static void main(String[] args) {
	int arr1[]= {2,3,5,7,9,10};
	int arr2[]= {1,4,6,8,10};
 //int ans[]=merge_array(arr1, arr2);
   //print(ans); 
   // bubble_sort(ans);
  //  Selection_sort(ans);
   // Insertion_sort(ans);
  System.out.println("arr1:-");
   print(arr1);
   System.out.println("arr2:-");
   print(arr2);
     int []ans=merge_sort_array(arr1, arr2);
    print(ans);
    
}
}
