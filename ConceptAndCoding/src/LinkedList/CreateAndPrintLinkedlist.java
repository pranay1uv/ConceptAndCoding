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
		Node headNode = insertAtHead(n1,60);
		Node insertAtLast = insertAtLast(headNode, 70);
		Node insertAfterK = insertAfterK(headNode, 80, 3);
		PrintLinkedList(headNode);
	}
	
	// I have to make this node as head i.e n0
	static Node insertAtHead(Node head, int val) {
		Node n0 = new Node(val);
		n0.next = head; 
		return n0;
	}
	
	// you only know head and dont know how many nodes are there after head
	static Node insertAtLast(Node head, int val) {
		Node n6 = new Node(val);
		Node tempo = head;
		while(tempo.next != null) {
			tempo = tempo.next;
		}
		tempo.next = n6; // connection has been made at last
		return n6;
	}
	
	// you dont know the adrress of k Node
	static Node insertAfterK(Node head ,int value, int k){
		Node nnew = new Node(value);
		Node tempr = head;
		int count = 1;
		while(count<k) {
			tempr = tempr.next;
			count++;
		}
		Node tempr1 = tempr.next;
		nnew.next = tempr1;
		tempr.next = nnew;
		return tempr;
	}
	
	private static void PrintLinkedList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
	}
	
	
	
}
