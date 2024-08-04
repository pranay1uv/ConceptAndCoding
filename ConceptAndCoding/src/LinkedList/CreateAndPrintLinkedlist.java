package LinkedList;

public class CreateAndPrintLinkedlist {
	
	public static class Node{
		int value;
		Node next = null;
		public Node(int value) {
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		
		// Creation of nodes and connecting the nodes
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		PrintLinkedList(n1);
	}
	
	private static void PrintLinkedList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
	}
}
