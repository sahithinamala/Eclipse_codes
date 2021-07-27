package ab;
import java.util.*;
class Node{
	int data;
	Node next;
}
public class SingleLInkedList {
	static Node head = null, tail = null;
	static Scanner sc = new Scanner(System.in);
	static void create() {
		System.out.println("Enter number of nodes");
		int n = sc.nextInt();
		for(int i = 0; i<=n;i++) {
			Node temp = new Node();
			System.out.println("Enter data");
			temp.data = sc.nextInt();
			temp.next = null;
			if(head == null) {
				head = tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
		}
	}
	static void Display() {
		if(head == null) {
			System.out.println("Linked list is empty");
		}
		else {
			Node temp = head;
			while(temp!= null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			
		}
	}
	static void Ins_Tail() {
		Node temp = new Node();
		System.out.println("Enter data");
		temp.data = sc.nextInt();
		temp.next = null;
		if(head == null) {
			head = tail = temp;
		}
		else {
			tail.next = temp;
			tail = temp;
		}
	}
	static void Ins_Head() {
		Node temp = new Node();
		System.out.println("Enter data");
		temp.data = sc.nextInt();
		temp.next = null;
		if(head == null) {
			head = tail = temp;
		}
		else {
			temp.next = head;
			head = temp;
		}
		
	}
	static void Ins_Position(int p) {
		Node c = head;
		int count = 1;
		while(c!=null) {
			if(count == p-1)
				break;
			c = c.next;
			count++;
		}
		if(c!=null){
		Node temp=new Node();
		System.out.println("Enter data");
		temp.data=sc.nextInt();
		temp.next=c.next;
		c.next=temp;
		}
		else {
			System.out.println("Invalid Position");
		}
	}
	public static void main(String[]args) {
		
	}

}
