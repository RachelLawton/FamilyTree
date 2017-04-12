package models;

public class Person {

	private static String name;
	private String gender;
	private int DOB;
	private String parentF;
	private String parentM;
	
	public Person(String name, String gender,int DOB,String parentF,String parentM){
		this.name = name;
		this.gender = gender;
		this.DOB = DOB;
		this.parentF = parentF;
		this.parentM = parentM;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(String OB) {
		this.DOB= DOB;
	}

	public String getParentF() {
		return parentF;
	}

	public void setParentF(String parentF) {
		this.parentF = parentF;
	}

	public String getParentM() {
		return parentM;
	}

	public void setParentM(String parentM) {
		this.parentM = parentM;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", DOB=" + DOB + ", parentF=" + parentF + ", parentM="
				+ parentM + "]";
	}
}
