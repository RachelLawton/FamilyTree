package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import models.Person;
import models.PersonReader;
//import models.PersonReader;

public class PersonReaderTest {
	
	
	@Before
	public void setUp() throws IOException {
		
	}

	@Test
	public void testreader() throws IOException
	{
		assertEquals(0, PersonReader.persons.size());
		PersonReader.PersonReader();
		assert(PersonReader.persons.size() > 0);//tests reading in the data
		
	}
	
	@Test 
	public void testGetFirstName()//get first name
	{
		/*assertEquals("Oliver",Person.getName());
		assertEquals ("Colby",Person.getName());
		//assertEquals(1,PersonReader.getName());
*/	}


}