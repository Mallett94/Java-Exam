import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {

	@Test
	public void test() {
		Boat b = new Boat("BlackPearl", "Carribean",49);//creates a test Boat
		
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
		
		
	}

}
