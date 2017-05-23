

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person t = new Person("Test","Class","19-05-17","B"); //creates a test person
		
		assertEquals(t.getFirstName(), "Test"); //tests that the getter for FirstName works
		t.setFirstName("Class"); //is supposed to set the FirstName, i.e. change it
		assertEquals(t.getFirstName(), "Class"); // tests that the set function correctly changed the FirstName
		
		assertEquals(t.getSurname(), "Class"); //tests that the getter for surname has finished
		t.setSurname("Test"); //is supposed to set the Surname
		assertEquals(t.getSurname(), "Test"); //tests that the setter correctly changed the surname
		
		assertEquals(t.getDob(), "19-05-17"); //tests that the getter for Dob works
		t.setDob("22-05-17"); //is supposed to set the Dob to something different
		assertEquals(t.getDob(), "22-05-17"); //tests that the setter worked correctly by getting the new dob
		
		assertEquals(t.getNation(), "B"); //tests the getter for nationality
		t.setNation("I"); //is supposed to change the nationality
		assertEquals(t.getNation(), "I"); //tests to see if the setter performed its required function
		
		assertEquals(t.toString(), "Name: Class Test. DOB: 22-05-17. Nationality: I");//tests that the formatting method works
		
	}

}
