import static org.junit.Assert.*;

import org.junit.Test;

public class TestAll {

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
		
		NonUK y = new NonUK("Rajvi","Parikh","19/05/2017","I","I123456"); //creates a test NonUK person
		 
			assertEquals(y.getFirstName(),"Rajvi");//tests the getFirstName method
			y.setFirstName("Yashvi");//is supposed to set the first name to what is in the brackets
			assertEquals(y.getFirstName(), "Yashvi");//tests to see if the setter worked correctly
		 
			assertEquals(y.getSurname(),"Parikh");//tests the getSurname method
			y.setSurname("Mallett");//is supposed to set the surname to what is in the brackets
			assertEquals(y.getSurname(), "Mallett");//tests to see if the setter worked correctly
		 
			assertEquals(y.getDob(),"19/05/2017");//tests the getDob method
			y.setDob("17-04-1995");//is supposed to set the dob to what is in the brackets
			assertEquals(y.getDob(), "17-04-1995");//tests to see if the setter worked correctly
		 
			assertEquals(y.getNation(),"I");//tests the getNation method
			y.setNation("B");//is supposed to set the nationality to what is in the brackets
			assertEquals(y.getNation(), "B");//tests to see if the setter worked correctly
		 
			assertEquals(y.getVisaInfo(),"I123456");//tests the getVisaInfo method
			y.setVisaInfo("I567890");//is supposed to set the visa info to what is in the brackets
			assertEquals(y.getVisaInfo(), "I567890");//tests to see if the setter worked correctly
		 
			assertEquals(y.toString(), "Name: Yashvi Mallett. DOB: 17-04-1995. Nationality: B. Visa code: I567890");//tests that the formatting method works
		 
		Boat b = new Boat("BlackPearl", "Carribean",49);//creates a test Boat
		Boat c = new Boat("BlackPearl", "Carribean",49);
			assertEquals(b.getName(),"BlackPearl");//tests the getter works
			b.setName("Interceptor");//should set a new name
			assertEquals(b.getName(), "Interceptor");//tests the setter function work by getting what was set
			
			assertEquals(b.getOrigin(), "Carribean");//tests the getter works
			b.setOrigin("British");//should set a new origin
			assertEquals(b.getOrigin(), "British");//tests the setter function work by getting what was set
			
			assertEquals(b.getSize(), 49, 0.01);//tests the getter works
			b.setSize(64.0);//should set a new size
			assertEquals(b.getSize(), 64, 0.01);//tests the setter function work by getting what was set
			
			assertEquals(b.toString(), "Name: Interceptor. Country of origin: British. Boat size: 64.0 units.");//test to see if the format function performs correctly. Boat size
																												//has to have a '.0' at the end because it is a double
			assertEquals(b.getSpeed(), 0);//test to see if getter works
			assertEquals(1, b.testIncreaseSpeed());
			assertEquals(0, b.testDecreaseSpeed());
			
		Marina m = new Marina("Liverpool", "Liverpool Dockyard, Waterfront Way", 150);//creates a test Marina
			
			assertEquals(m.getName(), "Liverpool");//tests the getter works
			m.setName("Southampton");//should set a new name
			assertEquals(m.getName(), "Southampton");//tests the setter function work by getting what was set
			
			assertEquals(m.getAddress(), "Liverpool Dockyard, Waterfront Way");//tests the getter works
			m.setAddress("Southampton Shipyard, Ocean Avenue");//should set a new address
			assertEquals(m.getAddress(), "Southampton Shipyard, Ocean Avenue");//tests the setter function work by getting what was set
			
			assertEquals(m.getSize(), 150, 0.05);//tests the getter works
			m.setSize(200);//should set a new name
			assertEquals(m.getSize(), 200, 0.05);//tests the setter function work by getting what was set
			
			assertEquals(m.toString(), "Name: Southampton. Address: Southampton Shipyard, Ocean Avenue. Marina size: 200.0 units.");//test to see if the format function performs correctly. Marina size
																																	//has to have a '.0' at the end because it is a double
			
		//Main
		String testList = "$Marinas--Monaco Yacht Club-Quai Louis II, 98000 Monaco-150-|-Venice Marinas-237 Sports Marina Rd, Venice, LA 70091, USA-300-|--Boats--Santa Maria-Portugal-0.8-|-Marys Dream-USA-2.3-|-Boaty McBoatface-Great Britain-3.8-|-Aquaholic-Panama-1.0-|--People--David Green-14/07/1952-British-|-Mary Jones-8/12/1968-Brtish-|-Mike Wozniak-02/04/1976-Polish-1759346/A-|-Bill Knightley-17/05/1943-Australian-9986342/B-|-Brian Johnson-05/10/1947-British-|-Linus Torvalds-28/12/1969-Finnish-88754438/A-|-Peter Jackson-31/10/1961-New Zealander-76446789/A-|-Adele Adkins-05/05/1988-British-|-Emma Watson-15/04/1990-British-|-Avril Lavigne-27/09/1984-Canadian-35688643/C-|-";
		assertEquals(testList, Main.readData("Stage_5_input.txt"));
		assertNotEquals(testList, Main.readData("nonExistentFile"));
		
		Main.parseData(testList);
		


		Main.assignPeople("Emma", "Watson", "Boaty McBoatface", "Owner");
		Main.assignPeople("Avril", "Lavigne", "Boaty McBoatface", "Crew");
		Main.assignPeople("Avril", "Lavigne", "Boaty McBoatface", "Captain");
		Main.assignPeople("Peter", "Jackson", "Boaty McBoatface", "Captain");
		Main.assignPeople("Linus", "Torvalds", "Boaty McBoatface", "Captain");
		m.addBoat(b);
		
	}


}
