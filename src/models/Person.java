package models;

import java.util.ArrayList;

public class Person extends PersonReader{

	public String name;
	public String gender;
	public int DOB;
	//public static Person parentF;
	//public static Person parentM;
	public static  String parentFa;
	public static  String parentMo;

	/*public Person(String name, boolean gender,int DOB,Person parentF,Person parentM){
		this.name = name;
		this.gender = gender;
		this.DOB = DOB;
		this.parentF = parentF;
		this.parentM = parentM;

	}*/

	public Person(String name, String gender,int DOB,String parentFa,String parentMo){
		this.name = name;
		this.gender = gender;
		this.DOB = DOB;
		Person.parentFa = parentFa;
		Person.parentMo = parentMo;
	}

	public Person (String name, String gender, int DOB){
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

	/*public Person getParentF() {
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
	}*/

	public static String getParentFa() {
		return parentFa;
	}

	public static void setParentFa(String parentFa) {
		Person.parentFa = parentFa;
	}

	public static String getParentMo() {
		return parentMo;
	}

	public static void setParentMo(String parentMo) {
		Person.parentMo = parentMo;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public String toString() {
		return "Family [name=" + name 
				+ ", gender=" + gender 
				+ ", DOB=" + DOB 
				+ ", Father=" + parentFa 
				+ ", Mother="+ parentMo;
	}


	

}