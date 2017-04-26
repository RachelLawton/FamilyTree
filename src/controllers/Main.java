package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import models.FamilyTree;
import models.Person;
import models.PersonReader;

public class Main {

	private Scanner input;
	ArrayList<PersonReader> persons = new ArrayList<PersonReader> ();
	//public static Person parentF;
	//public static Person parentM;
	public static String parentFa;
	public static String parentMo;
	public String name;
	public boolean gender;
	public int DOB;

	public static void main(String[] args) throws IOException //
	{
		new Main();
	}



	public Main() throws IOException
	{
		input = new Scanner(System.in);
		new  ArrayList<PersonReader>();
		runMenu();
	}

	private int mainMenu() 
	{

		//creates main menu
		System.out.println("---------");   
		System.out.println("Family Tree");   
		System.out.println("---------");   
		System.out.println("Enter number");      
		System.out.println("1) Add Member"); 
		System.out.println("2) see family tree");
		System.out.print("==>> ");
		int option = input.nextInt();
		return option;

	}

	private void runMenu() throws IOException
	{
		int option = 0;
		do //prevents it from duplicating itself many times
		{
			option = mainMenu();//starts the main menu

			switch (option)
			{

			case 1:    
			addMember();
			break;	           	             
			case 2:   
			seeDetails();
			break;       
			default:    System.out.println("Invalid number Inserted: " + option);
			break;
			}
		}while
			(option != 0);
	}


	private void addMember(){
		System.out.println("Whats their first name?");
		System.out.print("==>> ");
		String name = input.nextLine();
		name = input.nextLine();
		System.out.println("Whats their gender");
		System.out.print("==>> ");
		String gender = input.nextLine();
		//gender = input.nextBoolean();
		System.out.println("Whats their DOB Year only");
		System.out.print("==>> ");
		int DOB = input.nextInt();
		//DOB = input.nextInt();
		System.out.println("Whats their Father name?");
		System.out.print("==>> ");
		String parentFa = input.nextLine();
		parentFa = input.nextLine();
		System.out.println("Whats their mother name?");
		System.out.print("==>> ");
		String parentMo = input.nextLine();
		parentMo = input.nextLine();
		System.out.println("thank you");
		Person p = new Person(name,gender,DOB,parentFa,parentMo);
		persons.add(p);
		System.out.println("The Member Has Been Added Succesfully.");
		System.out.println(persons);
	}
	
	public void seeDetails(){
		System.out.println("Here is the family tree");
		System.out.println(persons);
		System.out.println("thank you");
	}
}






