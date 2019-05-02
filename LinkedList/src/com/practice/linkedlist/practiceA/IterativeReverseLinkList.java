package com.practice.linkedlist.practiceA;

public class IterativeReverseLinkList {

	Node head;

	public static void main(String[] args) {
		IterativeReverseLinkList rll = new IterativeReverseLinkList();
		rll.insert(4);
		rll.insert(5);
		rll.insert(6);
		rll.insert(7);
		rll.insert(8);
		rll.print();
		rll.iterativeReverseList();
		rll.printReverseList();
	}

	private void printReverseList() {
		if (this.head == null)
			return;
		Node tempNode = this.head;
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.nextNode;
		}
		System.out.println("NULL");
	}

	private void iterativeReverseList() {
		Node current = this.head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = next;
		}
		head = prev;
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
