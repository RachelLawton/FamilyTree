package models;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class FamilyTree {

	public static String name;
	public String gender;
	public int DOB;
	public static Person dad;
	public static Person mom;
	public static String mother;
	public static String father;
	private static Scanner input;
	static HashMap<String,Person> persons = new HashMap<String,Person>();


//add method works until mother and father i cant get it to add them, it just comes up null
	public static void addMember(){
		Person mom = null;
		Person dad = null;
		if(!persons.containsKey(name))
		{
			System.out.println("Whats their first name?");
			String name  = input.nextLine();
			name =input.nextLine();
			System.out.println("whats there gender M or F");
			String gender = input.nextLine();
			System.out.println("whats there DOB");
			int DOB = input.nextInt();
			System.out.println("whats ther mothers name");
			String mother = input.nextLine();
			if(persons.containsKey(mother))
			{
				mom = persons.get(mother);
			}
			mother = input.nextLine();
			System.out.println("whats ther Fathers name");
			String father = input.nextLine();
			if(persons.containsKey(father))
			{
				dad = persons.get(father);
			}
			Person NewPerson = new Person(name, gender, DOB, mom, dad);
			persons.put(name, NewPerson);
			System.out.println(persons);
			try{//writes them to a file 
				PrintWriter writer = new PrintWriter("family.txt", "UTF-8");
				writer.println(NewPerson);
				writer.close();//closes writer
			} catch (IOException e) 
			{

			}
		}
		else{
			System.out.println("Person already exists");
		}

	}
	public void seeDetails(){//see details in persons once a entry is made
		System.out.println("Here is the family tree");
		System.out.println(persons);
		System.out.println("thank you");
	}
}