package LinkedListLecture_8;

import java.util.Scanner;


public class MergeTwoSortLL{
	public static node<Integer> merge(node<Integer> head1, node<Integer> head2) {
              
		      node<Integer>temp1=head1;
		      node<Integer>temp2=head2;
		      node<Integer>head=null;
		      node<Integer>tail=null;
		      if(temp1.data<temp2.data) {
		    	  head=temp1;
		    	  tail=temp1;
		    	//  tail=tail.next;
		    	  temp1=temp1.next;
		      }
		      else {
		    	  head=temp2;
		    	  tail=temp2;
		    	//  tail=tail.next;
		    	  temp2=temp2.next;
		      }
		      while(temp1!=null&&temp2!=null){
		    	  if(temp1.data<temp2.data) {
		    		  tail.next=temp1;
		    		  tail=tail.next;
		    		  temp1=temp1.next;
		    	  }
		    	  else {
		    		  tail.next=temp2;
		    		  tail=tail.next;
		    		  temp2=temp2.next;
		    	  }
		      }
		      if(temp1==null) {
		    	  tail.next=temp2;
		    	//  tail=tail.next;
		      }
		      else {
		    	  tail.next=temp1;
		    	//  tail=tail.next;
		      }
		      return head;
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
		System.out.println(temp.data);
		temp=temp.next;
	}
	}
	public static void main(String[] args) {

node<Integer> head1=takeInput();
node<Integer>head2=takeInput();
node<Integer>head=merge(head1, head2);
	print(head);
	}
}
