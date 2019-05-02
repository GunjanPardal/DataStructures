package com.practice.linkedlist.practiceA;


// timecomplexity of 2 pointer approach?

public class MiddleElement {
	private Node head;

	public static void main(String[] args) {
		MiddleElement ll = new MiddleElement();
		ll.insert(30);
		ll.insert(50);
		ll.insert(60);
		ll.insert(70);
		ll.insert(80);
		ll.insert(100);
		ll.print();
		ll.middleElement();
	}

	private void middleElement() {
		Node slowPtr = this.head;
		Node fastPtr = this.head.nextNode.nextNode;
		if (head != null) {
			while (slowPtr != null && fastPtr.nextNode != null) {
				slowPtr = slowPtr.nextNode;
				fastPtr = fastPtr.nextNode;
			}
			System.out.println("middle-->" + slowPtr.data);
		}
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

	private void insert(int data) {
		Node node = new Node();
		node.data = data;
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
