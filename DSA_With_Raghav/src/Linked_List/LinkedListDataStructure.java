package Linked_List;

class LinkedList
{
	Node head;
	Node tail;
	int size;
	
	void addAtHead(int val)
	{
		Node temp = new Node(val);
		if(head == null) head = tail = temp;
		temp.next = head;
		head = temp;
	}
	
	void addAtTail(int val)
	{
		Node temp = new Node(val);
		if(tail == null) head = tail = temp;
		else {
			tail.next = temp;
			temp.val = val;
		}
	}
	
	void deleteAtHead()
	{
		head = head.next;
	}
	
	void deleteAtTail()
	{
		
	}
	void display()
	{
		if(head == null) return;
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("");
	}
}

public class LinkedListDataStructure {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		 
		ll.addAtTail(10);
		ll.addAtTail(20);
		ll.addAtTail(30);
		ll.addAtTail(40);
		ll.addAtHead(50);
		ll.addAtHead(60);
		ll.addAtHead(70);
		ll.display();
		ll.deleteAtHead();
		ll.deleteAtTail();
		ll.display();
	}
}
