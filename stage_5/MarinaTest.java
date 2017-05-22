import static org.junit.Assert.*;

import org.junit.Test;

public class MarinaTest {

	@Test
	public void test() {
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
		
		
	}

}
