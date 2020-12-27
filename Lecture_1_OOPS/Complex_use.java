package Lecture_1_OOPS;


public class Complex_use {
public static void main(String[] args) {
	Complex c1=new Complex(3,5);
//	c1.print();
c1.conjucate();
//	c1.print();
	Complex  c2=new Complex(2,5);
	Complex k=Complex.add(c1, c2);
k.print();
			}
}
