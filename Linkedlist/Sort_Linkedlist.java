package Linkedlist;

import java.util.*;

class Node{
	int data;
	Node next;
}

public class Sort_Linkedlist {
	static Node head = null;
	static Scanner sc = new Scanner(System.in);
	
	void Add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			head  = newNode;
		}
		else {
			Node prev = null;
			Node List = head;
			while((List!=null) && (List.data<newNode.data)) {
					prev = List;
					List = List.next;	
			}
			if(List == null) {
				prev.next = newNode;
				
			}
			else if(prev == null) {
				head = newNode;
				newNode.next = List;
			}
			else {
				prev.next = newNode;
				newNode.next = List;
				
			}
			
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
	boolean isExist(int data) {
		if(head == null)
			return false;
		else {
			Node List = head;
			while(List!=null) {
				if(List.data == data)
					return true;
				List = List.next;
			}
		}
		return false;
		
	}

	void Delete(int data) {
		Node prev = null;
		Node List = head;
		while(List!=null && data!=List.data) {
				prev= List;
				List = List.next;	
		}
		if(data == List.data) {
			if(prev == null) {
				head = List.next;
			}
			else {
			prev.next = List.next;
			}
			
		}
		
		System.out.println(" Data not found ");
		
	}
	public static void main(String[]args) {
		Sort_Linkedlist sl = new Sort_Linkedlist();
		
		for(int i = 0;i <10; i++) {
			System.out.println("Enter data");
			int data = sc.nextInt();
			if(sl.isExist(data) == false) {
				sl.Add(data);
				sl.Display();
				
			}
			else {
				System.out.println(data + " already exist.");
			}
		}
		for(int i = 0;i<10;i++) {
			System.out.println("Data to be deleted");
			int data = sc.nextInt();
			sl.Delete(data);
			sl.Display();
		}
		
	}

}
