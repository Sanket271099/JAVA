package quicksort;

public class quicksort {
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        int si=0;
        int ei=input.length-1;
        quicksort(input,si,ei);
		
	}
    public static void quicksort(int input[],int si,int ei){
        if(si>=ei){
            return;
        }
             int partition=partition(input,si,ei);
        quicksort(input,si,partition-1);
        quicksort(input,partition+1,ei);
    } 
    public static int partition(int input[],int si, int ei){
        int j=input.length-1;
        int start=0;
        int index=0;
        int i=0;
        int count=0;
        int pivote=input[0];
        while(pivote>input[i+1]){
            count++;
            i++;
             }
              
        index=count+si;
          int temp=input[index];
              input[index]=pivote;
              input[0]=temp;
              
              while(start<=j){
                  j=input.length-1;
                  if(input[start]>pivote){
                      while(j>=start){
                          
                        if(input[j]<pivote){
                         temp=input[j];
                            input[j]=input[start];
                            input[start]=temp;
                            
                        }
                          j--;
                      }
                      
                  }
                  start++;
              }
return pivote;
    }
 public static void main(String[] args) {
int input[]= {2,3,4,5,1};
	 quickSort(input);
}
}
