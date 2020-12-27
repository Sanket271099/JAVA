package Lecture_1_OOPS;


public class Fraction {
int numerator;
int dinominator;
public Fraction(int num,int dino) {
	this.numerator=num;
	this.dinominator=dino;
	simplify();
}
public void setDinominator(int dino){
	if(dino==0) {
		//error out
		return;
	}
	this.dinominator=dino;
	simplify();
}

	public void setNumerator(int num) {
		this.numerator=num;
		simplify();
		}
private void simplify() {
	int gcd=1;
	int smaller=Math.min(numerator,dinominator);
	for(int i=2;i<=smaller;i++) {
		if(this.numerator %i==0&& this.dinominator%i==0) {
			gcd=i;
		}
	}
	numerator=numerator/gcd;
    dinominator=dinominator/gcd;
}
public void add(Fraction f1) {
	this.numerator=this.numerator*f1.dinominator+this.dinominator*f1.numerator;
	this.dinominator=this.dinominator*this.dinominator;
	simplify();
}public void multiplicatuion(Fraction f1) {
	this.numerator=this.numerator*f1.numerator;
	this.dinominator=this.dinominator*f1.dinominator;
	simplify();
}
public static Fraction add(Fraction f1,Fraction f2) {
	int neww=f1.numerator*f2.dinominator+f1.dinominator*f2.numerator;
	int dinn=f1.dinominator*f2.dinominator;
Fraction f3=new Fraction (neww,dinn);
	return f3;
}
public int getDino() {
	return this.dinominator;
}
public int getNum() {
	return this.numerator;
}
public void print() {
	if(dinominator==1) {
		System.out.println(this.numerator);
	}
	System.out.println(this.numerator+"/"+this.dinominator);
}
}

