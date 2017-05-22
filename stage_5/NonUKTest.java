import static org.junit.Assert.*;

import org.junit.Test;

public class NonUKTest {

	@Test
	public void test() {
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
		 
	}

}
