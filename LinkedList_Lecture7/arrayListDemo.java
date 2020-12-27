package LinkedList_Lecture7;
import java.util.ArrayList;

public class arrayListDemo {
	public static void main(String[] args) {
		
ArrayList <Integer> list1=new ArrayList();
	list1.add(12);
	list1.add(123);
	//System.out.println(list1.size());
	System.out.println(list1.get(1));
	list1.add(19);
	list1.add(2772);
	for(int elem: list1) {
		System.out.print(elem+" ");
	}
	}
}
