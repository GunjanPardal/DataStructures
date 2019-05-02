package com.practice.linkedlist.practiceA;

public class LinkedList {

	private Node head;

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(30);
		ll.insert(50);
		ll.insert(60);
		ll.insert(70);
		ll.insert(80);
		ll.insert(100);
		ll.print();
		ll.insertNth(33, 5);
		ll.print();
		ll.length();
		ll.delete(70, 3);
		ll.print();
	}

	private void length() {
		Node node = this.head;
		int count = 0;
		while (node != null) {
			node = node.nextNode;
			count++;
		}
		System.out.println("length-->" + count);
	}

	private void delete(int value, int position) {
		int i = 0;
		Node currentNode = this.head;
		Node previousNode = null;
		if (this.head == null) {
			if (position != 0)
				return;
		}

		if (this.head != null && position == 0) {
			this.head = this.head.nextNode;
			return;
		}
		while (i < position) {
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
			if (currentNode == null) {
				break;
			}
			i++;
		}

		previousNode.nextNode = currentNode.nextNode;

	}

	private void insertNth(int data, int position) {
		Node node = new Node();
		node.data = data;
		node.nextNode = null;

		if (this.head == null) {
			if (position != 0)
				return;
			else {
				this.head = node;
			}
		}

		if (this.head != null && position == 0) {
			node.nextNode = this.head;
			this.head = node;
			return;
		}

		Node current = this.head;
		Node previous = null;

		int i = 0;
		while (i < position) {
			previous = current;
			current = current.nextNode;

			if (current == null) {
				break;
			}
			i++;
		}
		node.nextNode = current;
		previous.nextNode = node;
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
