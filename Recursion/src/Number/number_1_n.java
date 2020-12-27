package Number;

	
public class number_1_n {
	
		public static void check(int n) {
			if(n==1) {
				System.out.println(n+" ");
				return;
			}
			check(n-1);
			System.out.println(n+" ");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
check(5);
	}


}
