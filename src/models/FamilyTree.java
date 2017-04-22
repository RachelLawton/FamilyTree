package models;

public class FamilyTree {
	
	
	 /*public boolean sibling(Person not){
	        if (Person.parentF != null && Person.parentM != null && not.parentM != null && not.parentF != null)
	            return (Person.parentM.equals(not.parentM) && Person.parentF.equals(not.parentF) && !this.equals(not));
	        return false;
	    }*/
	 
	 public Person getGrandad(){
	        if (Person.parentF == null || Person.parentF.parentF == null) 
	            return null;
	        return Person.parentF.parentF;
	 }
	 
	 public boolean isCousinOf(Person not){
	        //two people are first cousins if either pair of their parents are isbilings
	        if (Person.parentF != null && not.parentF != null && Person.parentF.sibling(not.parentF))
	            return true;
	        if (Person.parentF != null && not.parentM != null && Person.parentF.sibling(not.parentM))
	            return true;
	        if (Person.parentM != null && not.parentF != null && Person.parentM.sibling(not.parentF))
	            return true;
	        if (Person.parentM != null && not.parentM != null && Person.parentM.sibling(not.parentM))
	            return true;
	        return false;
	    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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


		public boolean root(String x)
		{
			if (root == null){  
				root =  new Node(x);
				return true;}
			else
				return false;
		}*/

	
	
	 
	 
	
	
	
