package LinkListInput;
public class Reverse extends LinkList_INPUT{
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
public static void print1(node<Integer>head) {
	node<Integer>temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
public static void main(String[] args) {
	node<Integer>head=takaInput();
	head=reverse(head);
	print(head);
}
}
