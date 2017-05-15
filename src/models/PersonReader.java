package models;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class PersonReader {
	private Scanner input;

	public static HashMap<String,Person> persons = new HashMap<String,Person>();
	//public static ArrayList<Person> persons = new ArrayList<Person>();


	public static void PersonReader() throws IOException
	{

		File personFile = new File("large-database.txt");//creates the file given
		Scanner inPerson = new Scanner(personFile);//constructs a new scanner
		//each field is separated(delimited) by a 'space'
		String delims = " ";
		while (inPerson.hasNextLine()) {
			String personDetails = inPerson.nextLine();
			String[] personTokens = personDetails.split(delims);
			//reads in the name gender and dob
			String name = (personTokens[0]);
			String gender = (personTokens[1]);
			int DOB = 	Integer.parseInt(personTokens[2]);
//adds it the hashmap persons
			Person p = new Person(name,gender,DOB);//instead of going to console it goes to the map persons
			persons.put(name,p);//adds to the hashmap
		}

//reads in the file agian to get parents
		Scanner inPersons = new Scanner(personFile);
		String delim = " ";
		while (inPerson.hasNextLine()) {
			String personDetail = inPersons.nextLine();
			String[] personToken = personDetail.split(delims);
			String mother = personToken[3];
			String father = personToken[4];

			if(Person.mother.equals("?"))//if mother  = ? mother is not onown
			{
				Person.mother = null;
			}
			if(!persons.containsKey(mother))//if the hashmap dosent have the key "mother" a new person is made
			{
				//new person made and added to hashmap
				Person mom = new Person(mother,"F", 0, null, null);
				persons.put(mother,mom);
			}
			else
			{//if she does exist in person just get her
				Person mom = persons.get(mother);
			}

			if(Person.father.equals("?"))//if father  = ? father is not known

			{
				Person.father = null;
			}
			if(!persons.containsKey(father))//if the hashmap dosent have the key "father" a new person is made
			
				//new person made and added to hashmap
			{
				Person dad = new Person(father,"M", 0, null, null);
				persons.put(father,dad);
			}
			else
			{//if she does exist in person just get her
				Person dad = persons.get(father);
			}

			inPerson.close();//closes scanner
		}
	}



}







