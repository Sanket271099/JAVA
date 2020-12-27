package Recurrsion;

public class CalculatePower {
public int power(int n,int pow) {
	if(pow==1) {
		return n;
	}
	return power(n,--pow)*n;
}
}
