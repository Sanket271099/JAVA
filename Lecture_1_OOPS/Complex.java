package Lecture_1_OOPS;

public class Complex {
	int real;
	int img;
public Complex(int real,int img) {
	this.real=real;
	this.img=img;
}public void add(Complex c) {
	real=this.real+c.real;
	img=this.img+c.img;
}
public void multiply(Complex c) {
	this.real=this.real*real;
	this.img=this.img*img;
}
public static Complex add(Complex c1,Complex c2) {
	int real1=c1.real+c2.real;
	int img=c1.img+c2.img;
	Complex c3=new Complex(real1,img);
	return c3;
}
public void conjucate() {
	this.img =-img;
}
public void print() {
	if(img>0) {
	System.out.println(real+"+"+"i"+img);
	}else {
		
		System.out.println(real+""+img+"i");
	}
}
}
