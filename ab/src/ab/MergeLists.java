package ab;

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
    	this.data = d;
        this.next = null;
        }
}
     
class MergeLists
{
Node head;
public void add(Node node)
{
    if (head == null)
    {
        head = node;
    }
    else
    {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }
}
 
void display()
{
    Node temp = head;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
 
 
public static void main(String args[])
{
    MergeLists llist1 = new MergeLists();
    MergeLists llist2 = new MergeLists();
     System.out.println("Enter list1 elements");
   for(int i = 0;i < 5;i++) {
	   Scanner sc = new Scanner(System.in);
	   int data = sc.nextInt();
    llist1.add(new Node(data));
 
   }
     
   System.out.println("Enter list2 elements");
   for(int i = 0;i < 5;i++) {
	   Scanner sc = new Scanner(System.in);
	   int data = sc.nextInt();
    llist2.add(new Node(data));
   }
     
    llist1.head = new Sort().sortedMerge(llist1.head,
                                        llist2.head);
    llist1.display();    
     

}
}
class Sort
{

Node sortedMerge(Node temp, Node temp1)
{
     
    Node newNode = new Node(0);
    Node tail = newNode;
    while(true)
    {
        if(temp1 == null)
        {
            tail.next = temp;
            break;
        }
        if(temp == null)
        {
            tail.next = temp1;
            break;
        }
         
        
        if(temp.data <= temp1.data)
        {
            tail.next = temp;
            temp = temp.next;
        }
        else
        {
            tail.next = temp1;
            temp1 = temp1.next;
        }
         
        tail = tail.next;
    }
    return newNode.next;
}
}