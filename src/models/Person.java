package models;

import java.util.ArrayList;

public class Person {

	public static String name;
	public String gender;
	public int DOB;
	public Person dad;
	public Person mom;
	public static String mother;
	public static String father;

	public Person(String name, String gender,int DOB,Person dad,Person mom){
		this.name = name;
		this.gender = gender;
		this.DOB = DOB;
		this.dad = dad;
		this.mom = mom;
	}
	public Person(Person dad,Person mom){
		
	}
	
	/*public int compareTo(Person p) {
		// If the frequency of the current node is greater than the frequency of object o, return 1
		if(this.name.toString() > ((Person)p).name.toString()){
			return 1;
		}
		// If the frequency of the current node is less than the frequency of object o, return -1
		if(this.name.toString() > ((Person)p).name.toString()){
			return -1;
		}
		// Else return 0 because the frequency must be the same
		return 0;
	}*/

	public Person(String name, String gender, int DOB) {
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

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public Person getDad() {
		return dad;
	}

	public void setDad(Person dad) {
		this.dad = dad;
	}

	public Person getMom() {
		return mom;
	}

	public void setMom(Person mom) {
		this.mom = mom;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", DOB=" + DOB + ", dad=" + dad + ", mom=" + mom + "]";
	}
	

}