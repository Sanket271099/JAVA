package power;

public class power {
public static int power1(int coeff,int degree) {
	if(degree==0) {
		return 1;
	}
	return power1(coeff,degree-1)*coeff;
}
public static void main(String[] args) {
	int truepower =power1(2,10);
	System.out.println(truepower);
}
}
