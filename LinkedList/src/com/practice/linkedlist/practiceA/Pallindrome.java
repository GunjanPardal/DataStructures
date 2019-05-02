package com.practice.linkedlist.practiceA;

public class Pallindrome {

	NodeString head;
	NodeString p1;
	NodeString p2;

	public static void main(String[] args) {
		Pallindrome ll = new Pallindrome();
		ll.insert("a");
		ll.insert("b");
		ll.insert("b");
		ll.insert("a");
	//	ll.insert("a");
	//	ll.insert("b");
	//	ll.insert("a");
		ll.print();
		boolean val = ll.pallindrome();
		System.out.println("val--->" + val);
	}

	private boolean pallindrome() {
		if (head == null || head.nextNode == null)
			return true;

		// find list center
		NodeString fast = head;
		NodeString slow = head;

		while (fast.nextNode != null && fast.nextNode.nextNode != null) {
			fast = fast.nextNode.nextNode;
			slow = slow.nextNode;
		}

		NodeString secondHead = slow.nextNode;
		slow.nextNode = null;

		// reverse second part of the list
		NodeString p1 = secondHead;
		NodeString p2 = p1.nextNode;

		while (p1 != null && p2 != null) {
			NodeString temp = p2.nextNode;
			p2.nextNode = p1;
			p1 = p2;
			p2 = temp;
		}

		secondHead.nextNode = null;

		// compare two sublists now
		NodeString p = (p2 == null ? p1 : p2);
		NodeString q = head;
		while (p != null) {
			if (p.data != q.data)
				return false;

			p = p.nextNode;
			q = q.nextNode;

		}

		return true;
	}

	private void print() {
		if (this.head == null)
			return;
		NodeString tempNode = this.head;
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.nextNode;
		}
		System.out.println("NULL");
	}

	private void insert(String data) {
		NodeString node = new NodeString();
		node.data = data;
		node.nextNode = null;

		if (this.head == null) {
			head = node;
			return;
		}
		NodeString tempNode = head;
		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		tempNode.nextNode = node;
	}
}
