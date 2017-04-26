package models;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PersonReader {
	//public static HashMap<String,Person> persons = new HashMap<String,Person>();
	public static ArrayList<Person> persons = new ArrayList<Person>();


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
			String parentF = (personTokens[3]);
			String parentM = (personTokens[4]);


			if (personTokens.length == 5) {//if ther are 5 parameters
				System.out.println("name=" + name + ", gender=" + gender + ", DOB=" + DOB + ", parentF=" + parentF + ", parentM="
						+ parentM);

				Person p = new Person(name,gender,DOB,parentF,parentM);//instead of going to console it goes to the map ratings
				persons.add(p);//adds to the arraylist


			} else {
				inPerson.close();//close scanner
				throw new IOException("Invalid length: " + personTokens.length);
			}
		}
		inPerson.close();//close scanner

	}
}