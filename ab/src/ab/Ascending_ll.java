package ab;

import java.util.Scanner;
class Node{
	int data;
	Node next;
	 public Node( int data) {
		
		this.data = data;
	
	}
}
public class Ascending_ll {
	public static Node head = null;  
    public static Node tail = null;  
     static Scanner sc = new Scanner(System.in);
    public void addNode(int data) {  
        Node nNode = new Node(data);   
        if(head == null) {   
            head = nNode;  
            tail = nNode;  
        }  
        else {   
            tail.next = nNode;  
            tail = nNode;  
        }  
    }
    public void Sort() {
    Node current = head, i = null;  
    int temp;  
      
    if(head == null) {  
        return;  
    }  
    else {  
        while(current != null) {  
            i = current.next;  
              
            while(i != null) {  
                
                if(current.data > i.data) {  
                    temp = current.data;  
                    current.data = i.data;  
                    i.data = temp;  
                }
              
                i = i.next;  
            }  
            current = current.next;  
        }      
    }  
    }
    public void removeDuplicates(){
        Node current = head, i = null, temp = null;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                
                temp = current;
                i = current.next;
 
                while (i != null) {
                    
                    if (current.data == i.data) {
 
                        temp.next = i.next;
                    }
                    else {
                        temp = i;
                    }
                    i = i.next;
                }
                current = current.next;
            }
        }
    }
 
    
public void display() {  
   
    Node current = head;  
    if(head == null) {  
        System.out.println("empty");  
        return;  
    }  
    while(current != null) {  
        
        System.out.print(current.data );  
        current = current.next;  
    }  
    System.out.println();  
}

public static void main(String[]args) {
	Ascending_Linkedlist ascl = new Ascending_Linkedlist();
	System.out.println("Enter size");
	int size = sc.nextInt();
	System.out.println("Add num to linked list");
	for(int i =0; i<size;i++) {
	int num = sc.nextInt();
	ascl.addNode(num);
	}
	ascl.Sort();
	ascl.display();
	
	ascl.removeDuplicates();
	ascl.display();
	
	
	
}
}
