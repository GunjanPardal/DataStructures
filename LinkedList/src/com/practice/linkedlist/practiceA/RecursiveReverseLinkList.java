package com.practice.linkedlist.practiceA;

public class RecursiveReverseLinkList {
	 Node head;

	public static void main(String[] args) {
		RecursiveReverseLinkList rrll = new RecursiveReverseLinkList();
		rrll.insert(1);
		rrll.insert(2);
		rrll.insert(3);
		rrll.insert(4);
		rrll.insert(5);
		rrll.print();
		Node n = rrll.recursiveReverse();
		rrll.print(n);
	}

	private void print(Node top) {
		while(top != null){
            System.out.print(top.data+"->");
            top = top.nextNode;
        }
		System.out.println("NULL");
	}

	private Node recursiveReverse() {
		
		Node reverse = this.head;
		Node n = recursiveReverse(reverse);
		return n;
	}

	private Node recursiveReverse(Node head) {
		 if(head==null || head.nextNode == null)
	            return head;
	        Node temp = recursiveReverse(head.nextNode);
	        head.nextNode.nextNode = head;//n+1 th node pointing nth node
	        head.nextNode = null; 
	        return temp;
	}

	private void print() {
		if (this.head == null)
			return;
		Node tempNode = this.head;
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.nextNode;
		}
		System.out.println("NULL");
	}

	private void insert(int value) {
		Node node = new Node();
		node.data = value;
		node.nextNode = null;

		if (this.head == null) {
			head = node;
			return;
		}
		Node tempNode = head;
		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		tempNode.nextNode = node;
	}

}
