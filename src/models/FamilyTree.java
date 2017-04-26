package models;

public class FamilyTree {//All the add methods i tried

	/*public void addNode(String name,int DOB) {
			Node newNode = new Node(name, DOB){
			if (root == null) {// If root = null value becomes root
				root = newNode;
			} else {
				Node currentNode = root;// Makes the root the Node we use when i traverse the tree
				Node parent;// Future parent for our new Node
				while (true) {
					parent = currentNode;// root is the only parent so start there
					if (DOB < currentNode.DOB) {// Check if the new node goes on the left of the parent
						currentNode = currentNode.left;// Switch focus to the left child
						if (currentNode == null) {// If the left child has no children
							parent.left = newNode;// then put new node on the left of it
							return;
						}

					} else { 
						currentNode = currentNode.right;//currentnod is the on the right
						if (currentNode == null) {// If the right child has no children
							parent.right = newNode;// put the new node on the right of it
							return; 
						}
					}
				}
			}

		}*/


	/*public void postOrderTraverseTree(Node currentNode) {

		if (currentNode != null) {

			postOrderTraverseTree(currentNode.left);
			postOrderTraverseTree(currentNode.right);

			System.out.println(currentNode);

		}*/

}

/*public Node findNode(int DOB) {
		Node currentNode = root;//top of tree
		while (currentNode.DOB != DOB) {//while node isnt found keeo searching
			if (DOB < currentNode.DOB) {//search to left
				currentNode = currentNode.left;//Node = left child
			} else {
				currentNode = currentNode.right;//Node = right child
			}
			if (currentNode == null)
				return null;//node null
		}
		return currentNode;
	}
 */
/*public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();

		theTree.addNode("Granny", 1956);

		theTree.addNode("Grandad", 1956);

		theTree.addNode("Nicola", 1966);

		theTree.addNode("John", 1977);

		theTree.addNode("Rachel", 1996);

		theTree.addNode("Daniel", 1999);
 */



/*public void addMember(String name, String gender,int DOB,String parentF,String parentM){
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


}*/
/*public class Node
	{
		private Node right;
		private Node left;
		private Node root;
		private Node parent;
		private String name;


		public Node(String name){
			this.name= name;
		}


/*
public String getGrandad(){
if (parentFa == null || parentFa == null) 
	return null;
return parentFa;
}*/







