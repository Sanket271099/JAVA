package Lecture_1_OOPS;

public class Polynomial {
	 private int t=1;
private int product=1;
int coeff;
int degree;
int arr[];
int x;
private int sum=0;

public Polynomial() {
	arr=new int[5];
	degree=arr.length;
	}
public void setCoeff(int degree,int coeff) {
	//this.degree=degree;
	this.coeff=coeff;
	if(this.degree>degree) {
	arr[degree]=this.coeff;
	}

	
	else if(degree>this.degree){
	more();
	arr[degree]=this.coeff;
	
	}
	degree++;
}
private int[] more() {
	int temp[]=arr;
	arr=new int[arr.length*2];
	for(int i=0;i<temp.length;i++) {
		arr[i]=temp[i];
	}
	return arr;
}
public void print() {

	if(x<1) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			if(t>1) {
				System.out.print(arr[i]+"x^"+t+"+");
				break;
			}
		System.out.print(arr[i]+"x^"+i+"+");
		}
	}
	}
	else { 
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=0)
			for(int j=0;j<=i;j++) {
				product=x*product;
			}
					sum=product+arr[i];
		}
			System.out.println(sum);	
	
	}
	}
public void add(Polynomial p) {
	for(int i=0;i<arr.length;i++) {
		if(p.arr[i]!=0) {
			this.arr[i]=this.arr[i]+p.arr[i];
		}
	}
}
public void multiplication(Polynomial p) {

	for(int i=0;i<arr.length;i++) {
		
		if(p.arr[i]!=0) {
			this.arr[i]=this.arr[i]*p.arr[i];
			
		}
	}
}
}

