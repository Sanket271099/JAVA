package Lecture_1_OOPS;



public class Dynamic_Array_Use {
public static void main(String[] args) {
	Dynamic_Array d=new Dynamic_Array();
	for(int i=0;i<100;i++) {
		d.add(i+10);
	}
	d.add(11);
	d.add(22);
	d.add(1231);
//	for(int i=0;i<100;i++) {
//		System.out.println(d.get(i));
//		
//	}System.out.println("size"+d.size());
	while(!d.isEmpty()) {
		System.out.println("last value of removed dynamic arrya   "+d.RemoveLast());
		System.out.println(" size of dynamic array "+d.size());
	}
//	System.out.println("remove last element");
//	System.out.println(d.RemoveLast());
//	System.out.println(d.isEmpty());
////	int i=100;
//	while(i>0) {
//		System.out.println(d.get(i));
//	//	System.out.println(d.RemoveLast());
//		//System.out.println(d.isEmpty());
//		i--;
//	}
//	System.out.println(d.RemoveLast());//
}
}
