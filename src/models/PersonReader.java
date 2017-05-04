package models;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PersonReader {
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

			String name = (personTokens[0]);
			String gender = (personTokens[1]);
			int DOB = 	Integer.parseInt(personTokens[2]);

			if (personTokens.length == 5) {//if ther are 5 parameters
				System.out.println("name=" + name + ", gender=" + gender + ", DOB=" + DOB);

				Person p = new Person(name,gender,DOB);//instead of going to console it goes to the map persons
				persons.put(name,p);//adds to the hashmap
			}


				Scanner inPersons = new Scanner(personFile);
				String delim = " ";
				while (inPerson.hasNextLine()) {
					String personDetail = inPersons.nextLine();
					String[] personToken = personDetail.split(delims);
					String mother = personToken[3];
					String father = personToken[4];

					if(Person.mother.equals("?")){
						Person.mother = null;
					}
					if(persons.get(Person.mother)!=null){
						Person mom = persons.get(Person.mother);
						persons.get(Person.name).setMom(mom);	
					}

					if(Person.father.equals("?")){
						Person.father = null;
					}
					if(persons.get(Person.father)!= null){
						Person dad = persons.get(Person.father);
						persons.get(Person.name).setDad(dad);

					} else {
						inPerson.close();//close scanner
						throw new IOException("Invalid length: " + personToken.length);
					}
					inPerson.close();
				}
			}
		}
	}






