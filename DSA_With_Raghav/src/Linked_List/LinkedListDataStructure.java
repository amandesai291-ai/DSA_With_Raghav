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
		size++;
	}
	
	void addAtTail(int val)
	{
		Node temp = new Node(val);
		if(tail == null) head = tail = temp;
 		else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}
	
	void deleteAtHead()
	{
		if(head == null)
		{
			System.out.println("List is Empty...");
			return;
		}
		head = head.next;
		if(head == null) tail = null;
		size--;
	}

	int get(int idx)
	{
		if(idx > size) 
		{
			System.err.println("Invalid Index..");
			return -1;
		}
		Node temp = head;
		for(int i = 1; i<=idx; i++)  
		{
			temp = temp.next;
					
		}
		return temp.val;
	}
	
	void insert(int val , int idx)
	{
		if(idx < 0 || idx > size) System.err.println("Invalid Index..");
		else if(idx == 0)  addAtHead(val);
		else if(idx > size)  addAtTail(val);
		else
		{
			Node temp = head;
			
			for(int i = 1; i<=idx -1; i++)  
			{
				temp = temp.next;
						
			}
			Node t = new Node(val);
			t.next = temp.next;
			temp.next = t;
		}
		size++;
		
	}
	
	void delete(int idx)
	{
		if(idx<0 || idx>=size) {
			System.err.println("Invalid Index..");
			return;
		}
		if(idx == 0)
		{
			deleteAtHead();
			return;
		}
		Node temp = head;
		for(int i = 1; i<=idx-1;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		if(idx == size-1) tail = temp;
		size--;
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
	
	void getMiddle()
	{	
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Ele:"+slow.val);
	}
	
	void delMiddle()
	{	      
		// 60 50 10 20 30 40 
		Node slow = head;
		Node fast = head;
		
		if(size % 2 == 0)
		{
			while(fast != null && fast.next.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;

			}
			slow.next = slow.next.next;	
			size--;
		}else
		{     		
			while(fast != null && fast.next != null)
			{
				fast = fast.next.next;
				if(fast.next != null)
				{
					slow = slow.next;
				}

			}
			slow.next = slow.next.next;	
			size--;
		}
			
			
			
	}
	
	
}

public class LinkedListDataStructure {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		 
		ll.deleteAtHead();
		ll.addAtTail(10);
		ll.addAtTail(20);
		ll.addAtTail(30);
		ll.addAtTail(40);
		ll.addAtHead(50);
		ll.addAtHead(60);
		ll.addAtHead(70);
		ll.display();
		ll.deleteAtHead();
//		ll.deleteAtHead();
//		ll.deleteAtHead();
		ll.display();
//		System.out.println(ll.size);ll.display();
//		System.out.println(ll.get(2));
//		ll.insert(45 , 2);
//		ll.display();
		ll.getMiddle();
//		System.out.println(ll.size);ll.display();
		ll.display();
		ll.delMiddle();
		System.out.println(ll.size);ll.display();
		
	}
}
