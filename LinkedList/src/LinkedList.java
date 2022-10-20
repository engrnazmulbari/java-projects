class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}
public class LinkedList {

	Node head;
	Node last;
	
	public void add(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			last = newNode;
		}else{
			last.next = newNode;
			last = newNode;
		}
		
	}
	
	public void printLinkedList(){
		Node current = head; 
		while(current!=null){
			System.out.println(": "+current.data);
			current = current.next;
		}
	}
	public static void main(String[] args) {
		LinkedList linklist = new LinkedList();
		linklist.add(10);
		linklist.add(20);
		linklist.add(30);
		linklist.printLinkedList();

	}

}
