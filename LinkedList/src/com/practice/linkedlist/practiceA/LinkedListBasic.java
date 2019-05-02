package com.practice.linkedlist.practiceA;

public class LinkedListBasic {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;

		Node nodeB = new Node();
		nodeB.data = 5;

		Node nodeC = new Node();
		nodeC.data = 6;

		Node nodeD = new Node();
		nodeD.data = 7;

		nodeA.nextNode = nodeB;
		nodeB.nextNode = nodeC;
		nodeC.nextNode = nodeD;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
		System.out.println(listLength(nodeC));
		System.out.println(listLength(nodeD));
	}

	public static int listLength(Node aNode) {
		int length =0;
		Node currentNode= aNode;
		while(currentNode!=null) {
			length++;
			currentNode = currentNode.nextNode;
		}
		return length;
		
	}
}
