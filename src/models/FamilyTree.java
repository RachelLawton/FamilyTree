/*package models;

public class FamilyTree {
	
	public Person root;
	public Person currentNode;

	*//**
	 * HuffTree Constructor
	 *//*
	public FamilyTree(){
		root = null;
		currentNode = null;
	}

	
	public Person add(Person n1){
		if(isEmpty()){
			// Only ever do this when the HuffTree is empty
			root = n1;
			root.parent = null;
			currentNode = root;
		}
		else{
			if(n1 != root){
				currentNode = new Node();
				currentNode.parent = null;
				currentNode.c = n1.c + root.c;
				currentNode.freq = n1.freq + root.freq;
				currentNode.left = n1;
				currentNode.right = root;

				root = currentNode;
			}
		}
		return currentNode;
	}
	
	public boolean isEmpty(){
		return root == null;
	}

}*/