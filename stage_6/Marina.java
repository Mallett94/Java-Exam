import java.util.ArrayList;

public class Marina {

	protected String name;
	protected String address;
	protected double size;

	public Marina(String name, String address, double size) {
		this.name = name;
		this.address = address;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String toString() { // method to format the data
		return "Name: " + this.name + ". Address: " + this.address + ". Marina size: " + this.size + " units.";

	}

	ArrayList<Boat> roster = new ArrayList<Boat>(); // creates an ArrayList of
													// type Boat to store
													// vehicles that enter the
													// harbour
	//double spaceFree = this.size; // creates a number that changes to reflect
									// how much space is available in the Marina

	public void addBoat(Boat b) {
		System.out.println("Current space available in " + this.name + " is: " + this.size);
		if ((b.getCrew()!=null) | (b.getOwner()!=null) | (b.getCaptain() != null)) { // if statement to check if the boat has any people associated with it by checking the Boats people array
			if (this.size - b.getSize() >= 0) { // if statement to make sure there is enough space in the Marina
				roster.add(b);
				this.size = this.size - Math.ceil(b.size);
				System.out.println(b.name + " added to " + this.name);
				System.out.println("Current space remaining is: " + this.size);
			} 
			else {
				System.out.println("There is not enough space in the Marina, you cannot enter.");
			}
			
		}
		else {
			System.out.println(b.name + " has no-one associated with it, you cannot enter.");
		}
	}

}
