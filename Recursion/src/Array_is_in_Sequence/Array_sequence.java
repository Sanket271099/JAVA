package Array_is_in_Sequence;

public class Array_sequence {
	public static boolean checkSequence(int n[]) {
		if(n.length<=1) {
			return true;
		}
    int smallarray[]= new int[n.length-1];
    for(int i=1;i<n.length;i++) {
    	smallarray[i-1]=n[i];
    }
		
		boolean smallAns=checkSequence(smallarray);
		if(!smallAns) {
			return false;
		}
		if(n[0]<n[1]) {
			return true;
		}
		else {
			return false;
		}
		
	} 
public static void main(String[] args) {
	int n[]= {2,3,4,2};
	System.out.println(checkSequence(n));
}
}
