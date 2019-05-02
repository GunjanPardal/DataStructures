package com.practice.linkedlist.practiceA;

public class PallindromPrac {
	NodeString head;
	static boolean flag = false;
	public static void main(String[] args) {
		PallindromPrac pallindrome = new PallindromPrac();
		pallindrome.insert("R");
		pallindrome.insert("A");
		pallindrome.insert("D");
		pallindrome.insert("A");
		pallindrome.insert("R");
		pallindrome.print();
		flag = pallindrome.checkPallindrome();
		System.out.println(flag);
	}

	private void print() {
		NodeString tempNode = this.head;
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.nextNode;
		}
		System.out.println("NULL");
	}

	private boolean checkPallindrome() {
		boolean flag = true;
		
		if (head == null || head.nextNode == null)
			return flag;
		NodeString slowNode = head;
		NodeString fastNode = head;

		while (fastNode.nextNode != null && fastNode.nextNode.nextNode != null) {
			slowNode = slowNode.nextNode;
			fastNode = fastNode.nextNode.nextNode;
		}

		NodeString secondHead = slowNode.nextNode;
		slowNode.nextNode = null;
		NodeString ReversedList = ReverseList(secondHead);
		flag = compareLists(ReversedList,head);
		return flag;
	}

	private boolean compareLists(NodeString reversedList, NodeString head) {
		NodeString p1 = reversedList;
		NodeString p2 = head;
		while(p1!= null) {
			if(p1.data == p2.data) {
				p1 = p1.nextNode;
				p2 = p2.nextNode;
				flag = true;
			}else {
				flag = false;
			}
		}
		return flag;
	}

	private NodeString ReverseList(NodeString secondHead) {
		if (secondHead == null || secondHead.nextNode == null)
			return secondHead;
		NodeString temp = ReverseList(secondHead.nextNode);
		secondHead.nextNode.nextNode = secondHead;// n+1 th node pointing nth node
		secondHead.nextNode = null;
		return temp;
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
