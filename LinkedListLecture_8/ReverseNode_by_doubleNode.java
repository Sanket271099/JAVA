package LinkedListLecture_8;

public class ReverseNode_by_doubleNode {
	public static doubleNode reverse(node<Integer>head){
		if(head==null||head.next==null) {
		doubleNode ans=new doubleNode();
		ans.head=head;
		ans.tail=head;
		return ans;
		}
		doubleNode smallans=reverse(head.next);
		smallans.tail.next=head;
		head.next=null;
		doubleNode ans=new doubleNode();
		ans.head=smallans.head;
		ans.tail=head;
		return ans;
	}
public static void main(String[] args) {

}
}
