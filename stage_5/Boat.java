import java.util.ArrayList;

public class Boat implements Vehicle { //the boat class implements my vehicle interface. This means that my Boat must follow all of the methods within the Vehicle interface
	
	protected String name;
	protected String origin;
	protected double size;
	protected ArrayList<Person> people = new ArrayList<Person> (); //creates an ArrayList to store people associated with the boat
	protected int speed = 0;
	
	public Boat(String name, String origin, double size) {
		this.name = name;
		this.origin = origin;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public String toString() { //method to format the data
		return "Name: " + this.name + ". Country of origin: " + this.origin + ". Boat size: " + this.size + " units.";
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		speed ++;
		System.out.println("The boat is accelerating!");
	}
	
	public void deccelerate() {
		speed --;
		System.out.println("The boat is deccelerating!");
	}
	
	public int testIncreaseSpeed() {
		System.out.println("Speed is currently: " + getSpeed());
		accelerate();
		System.out.println("Speed is now: " + getSpeed());
		return speed;
	}
	
	public int testDecreaseSpeed() {
		System.out.println("Speed is currently: " + getSpeed());
		deccelerate();
		System.out.println("Speed is now: " + getSpeed());
		return speed;
	}
	
	public void hasPerson(Person role){ //method to add a person to the people ArrayList
		this.people.add(role);
	}
	
	
}
