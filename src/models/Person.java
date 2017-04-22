package models;

public class Person {

	public String name;
	public boolean gender;
	public int DOB;
	public static Person parentF;
	public static Person parentM;

	public Person(String name, boolean gender,int DOB,Person parentF,Person parentM){
		this.name = name;
		this.gender = gender;
		this.DOB = DOB;
		this.parentF = parentF;
		this.parentM = parentM;
	}
	public Person (String name, boolean gender, int DOB){
		this.name = name;
		this.gender = gender;
		this.DOB = DOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		if (gender) 
			return "F";
		else
			return "M";
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(String OB) {
		this.DOB= DOB;
	}

	public Person getParentF() {
		return parentF;
	}

	public void setParentF(Person parentF) {
		this.parentF = parentF;
	}

	public Person getParentM() {
		return parentM;
	}

	public void setParentM(Person parentM) {
		this.parentM = parentM;
	}

	public String toString(){
		String mom = "Not known";
		if (parentM != null) 
			mom = parentM.name;
		String dad = "Not known";
		if (parentF != null) 
			dad = parentF.name;      
		return name + "["+ getGender()+"]" + DOB + "\n Mother = "  + mom + "\n Father = " + dad;
	}
	public boolean sibling(Person not){
		if (parentF != null && parentM != null && not.parentM != null && not.parentF != null)
			return (parentM.equals(not.parentM) && parentF.equals(not.parentF) && !this.equals(not));
		return false;
	}


}