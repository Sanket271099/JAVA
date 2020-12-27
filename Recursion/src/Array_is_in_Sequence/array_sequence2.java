package Array_is_in_Sequence;

public class array_sequence2 {
public static boolean checkSorted(int input[]){
		
		if(input.length <= 1){
			return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		
		boolean smallAns = checkSorted(smallInput);
		if(!smallAns){
			return false;
		}
		if(input[0] <= input[1]){
			return true;
		}else{
			return false;
		}
		
	}
public static void main(String[] args) {
int n[]= {2,3,4,5};
	System.out.println(checkSorted(n));
}
}
