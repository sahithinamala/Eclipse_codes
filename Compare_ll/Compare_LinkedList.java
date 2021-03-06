package Compare_ll;

import java.util.*;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
public class Compare_LinkedList {
	Node head = null;
	static Scanner sc = new Scanner(System.in);
	void Add(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
			}
		}
	void Display() {
		if(head == null)
			System.out.println("Invalid");
		else {
			Node List = head;
			System.out.println("Data : ");
			while(List!=null) {
				System.out.println(""+ List.data +"");
				List = List.next;
			}
		}
	}
	static void compare(Compare_LinkedList list1,Compare_LinkedList list2) {
		Node a = list1.head;
		Node b = list2.head;
		while(a!=null && b!=null) {
		if(a.data == b.data) {
			System.out.println("Same");
			a = a.next;
			b = b.next;
		}
		System.out.println("Not same");
		
		}
		
	}
	public static void main(String[]args) {
		Compare_LinkedList list1 = new Compare_LinkedList();
		Compare_LinkedList list2 = new Compare_LinkedList();
		for(int i = 0;i <5 ; i++) {
			System.out.println("Enter data for List 1");
		int data = sc.nextInt();
		list1.Add(data);
		list1.Display();
		
		}
		for(int i = 0;i <5 ; i++) {
			System.out.println("Enter data for List 2");
			int data1 = sc.nextInt();
			list2.Add(data1);
			list2.Display();
		}
		System.out.println("LIST1 : " + list1);
		System.out.println("LIST2 : " + list2);
		compare(list1,list2);
	}

}
