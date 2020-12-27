package Recurrsion;

public class Fibonacci_Number {
public int fibo(int n) {
	if(n==1||n==0) {
		return n;
	}
	return fibo(n-1)+fibo(n-2);
}
}
