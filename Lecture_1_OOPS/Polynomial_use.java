package Lecture_1_OOPS;



public class Polynomial_use {
public static void main(String[] args) {
	Polynomial p=new Polynomial();
//    p.setCoeff(1, 2);
 p.setCoeff(2, 23);
//    p.setCoeff(3, 43);
//    p.setCoeff(5, 897);
//    p.setCoeff(6, 23);
//    p.setCoeff(7, 10);
//    p.setCoeff(11, 11);
 //   System.out.println();
    Polynomial p2=new Polynomial();
    p2.setCoeff(2, 11);

    p2.setCoeff(4, 123);
p.multiplication(p2);
p.print();

//    p.add(p2);
//    p.print();
   // p.setCoeff(24, 32);
  //  p.setCoeff(523, 2);
  
}
}
