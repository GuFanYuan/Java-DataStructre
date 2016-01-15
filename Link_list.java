package com.Yang;

import com.Yang.Node;

public class Link_list {
	Node head = new Node();
	Node last = head;
	//headNode.nextNode = null;
	public Link_list(){}
	public Link_list(Object item){
		head.data = item;
		head.nextNode = null;
	}
	public void push_back(Object x){	//β�巨
		Node node = new Node(x);
		node.nextNode = null;
		if(head == null){
			head = node;
		}else{
			last.nextNode = node;
		}
		last = last.nextNode;
	}
	
	public void Insert(Object x,int index){
		Node pNode = head;
		int Count = 0;
		if(index==0){
			Node sNode = new Node(x);
			sNode.nextNode = pNode;
			head = sNode;
			return;
		}
		while(pNode.nextNode!=null && Count<index){
			pNode = pNode.nextNode;
			Count++;
		}
		if(Count<index){
			return;
		}else{
			Node sNode = new Node(x);
			sNode.nextNode = pNode.nextNode;
			pNode.nextNode = sNode;
		}
	}
	
	public void show(){
		Node pNode = head;
		while(pNode.nextNode != null){
			System.out.print(pNode.data+"-->");
			pNode = pNode.nextNode;
		}
		System.out.print("Over!");		
	}
		
	
	public static void main(String[] args) {
		Link_list tList = new Link_list(1);
		int[] arr = {2,3,4,5};
		for(int i=0;i<4;i++){
			tList.push_back(arr[i]);
		}
		//tList.show();
		tList.Insert(7, 1);
		tList.show();
	}
}
