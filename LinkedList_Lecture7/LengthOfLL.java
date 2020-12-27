package LinkedList_Lecture7;
//Length of LL
//Send Feedback
//For a given singly linked list of integers, find and return its length. Do it using an iterative method.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First and the only line of each test case or query contains elements of the singly linked list separated by a single space. 
// Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
//Output format :
//For each test case, print the length of the linked list.
//
//Output for every test case will be printed in a seperate line.
// Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//Time Limit: 1sec
//Sample Input 1 :
//1
//3 4 5 2 6 1 9 -1
//Sample Output 1 :
//7
//Sample Input 2 :
//2
//10 76 39 -3 2 9 -23 9 -1
//-1
//Sample Output 2 :
//8
//0


import java.util.Scanner;
public class LengthOfLL {
	public static node <Integer> input(){
		node head=null,tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			node newnode= new node(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}else {
				tail.next=newnode;
				tail=newnode;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static int length(node <Integer>head){
		node <Integer>temp=head;
		int count=0;
		if(temp.data==-1) {
			return 1;
		}
		while(temp!=null) {
		
			temp=temp.next;
			count++;
		}
		return count;
	}
	
public static void main(String[] args) {
	node head=input();
	System.out.println(length(head));
}
}
