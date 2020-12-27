package Lecture_1_OOPS;

 
public class Fraction_use {
public static void main(String[] args) {
	Fraction f1=new Fraction(3,5);
	Fraction f2=new Fraction(2,25);
	f1.add(f2);
	f1.print();
	System.out.println("bottom one is f2");
	f2.print();
Fraction.add(f1, f2);
f1.print();

}
}
