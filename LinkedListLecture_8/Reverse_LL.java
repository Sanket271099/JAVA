package LinkedListLecture_8;

public class Reverse_LL {
public static node<Integer> reverse(node<Integer>head){
	if(head==null||head.next==null) {
		return head;
	}
	node<Integer>tail=head.next;
	node<Integer>smallans=reverse(head.next);
	tail.next=head;
	head.next=null;
	return smallans;
}
}
