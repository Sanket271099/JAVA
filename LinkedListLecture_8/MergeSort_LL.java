package LinkedListLecture_8;

import java.util.Scanner;

public class MergeSort_LL {
public static node<Integer> mergeSort(node<Integer>head){
	if(head.next==null||head==null) {
		return head;
	} 
node<Integer>mid=midpt(head);
node<Integer>nextMid=mid.next;
mid.next=null;
node<Integer>left=mergeSort(head);
node<Integer>right=mergeSort(nextMid);
node<Integer>ans=SortMerge(left,right);
return ans;

}
private static node<Integer>SortMerge(node<Integer>a,node<Integer>b){
	node<Integer>result=null;
	if(a==null) {
		return b;
	}else if(b==null) {
		return a;
	}
	if(a.data<=b.data) {
		result=a;
		result.next=SortMerge(a.next, b);
	}else {
		result=b;
		result.next=SortMerge(a, b.next);
	}
	return result;
}
public static node<Integer> takeInput(){
	node<Integer> head=null;
	Scanner s=new Scanner(System.in);
	int data=s.nextInt();
	while(data!=-1) {
		node <Integer>newnode=new node<Integer>(data);
		if(head==null) {
			head=newnode;
		}else {
			node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
		data=s.nextInt();
		}
	return head;
}
public static void print(node<Integer>head) {
	node<Integer>temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	
}

private static node<Integer>midpt(node<Integer>head){
	
	if(head==null) {
		return head;
	}
	node<Integer>fast=head;
	node<Integer>slow=head;
	//node<Integer>temp=null;
	while(fast.next!=null&&fast.next.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	
	}
	return slow;
}
public static void main(String[] args) {
	node<Integer>head=takeInput();
	print(head);
	System.out.println();
	node<Integer>ans=mergeSort(head);
   print(ans);
}
}
