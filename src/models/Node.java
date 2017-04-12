package models;

public class Node {
	
	private int DOB;
	private Node right;
	private Node left;
	private Node root;
	private Node parentNode;
	private Node currentNode;
	private String data;

	public Node(String data){
		this.data = data;
	}
	public Node(String name, String gender,int DOB,String parentF,String parentM){
		this.data = data;
		
	}

	public void addMember(String name, String gender,int DOB,String parentF,String parentM){
		Node newNode = new Node(name,gender,DOB,parentF,parentM);
		
		if (root == null) {
			root = newNode;
		}else{
			Node currentNode = root;
		}
		while(true){
			
			
			parentNode = currentNode;
			
			if(DOB < currentNode.DOB){
				currentNode = currentNode.left;
				
				if(currentNode == null)
				parentNode.left = newNode;
				return;
				
			}else{
				currentNode =currentNode.right;
				if(currentNode == null){
					parentNode.right = newNode;
					return;
				}
				
			}
		}

	}
	
	public void inOrder(Node currentNode){
		if(currentNode != null){
			inOrder(currentNode.left);
			System.out.println(currentNode);
			inOrder(currentNode.right);
		}
	}
	
	public Node findNode(int DOB){
		Node currentNode = root;
		
		while(currentNode.DOB != DOB){
			if(DOB < currentNode.DOB){
				currentNode = currentNode.left;
			}else{
				currentNode = currentNode.right;
			}
			if(currentNode == null){
				return null;
			}
		}
		return currentNode;
		
		
	}
}
