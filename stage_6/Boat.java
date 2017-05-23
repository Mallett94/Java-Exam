import java.util.ArrayList;

public class Boat implements Vehicle { //the boat class implements my vehicle interface. This means that my Boat must follow all of the methods within the Vehicle interface
	
	protected String name;
	protected String origin;
	protected double size;
	protected ArrayList<Person> crew = new ArrayList<Person> ();
	protected ArrayList<Person> owner = new ArrayList<Person> ();//creates an ArrayList to store people associated with the boat
	protected int speed = 0;
	protected Person captain;
	
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
	
	public void hasPerson(Person p, String role){ //method to add a person to the people ArrayList
		if (role.equals("Crew"))
		{
			this.crew.add(p);
			System.out.println(p.getFirstName() + " added to the crew of " + this.name);
		}
		else if (role.equals("Owner"))
		{
			this.owner.add(p);
			System.out.println(p.getFirstName() + " is the owner of " +this.name);
		}
		else
		{
			if (this.captain == null && isCrew(p) == false )
				{
					this.captain = p;
					System.out.println(p.getFirstName() + " is the captain of " + this.name);
				}
			else
			{
				System.out.println("Boat already has a Captain!");
			}
		}
		
	}
	
	public ArrayList<Person> getCrew() {
		return crew;
	}
//	public void setCrew(ArrayList<Person> crew) {
//		this.crew = crew;
//	}
	public ArrayList<Person> getOwner() {
		return owner;
	}
//	public void setOwner(ArrayList<Person> owner) {
//		this.owner = owner;
//	}
	public Person getCaptain() {
		return captain;
	}
//	public void setCaptain(Person captain) {
//		this.captain = captain;
//	}
	public boolean isCrew(Person p)
	{
		for (Person q: crew)
		{
			if (p.getFirstName().equals(q.firstName) && p.getSurname().equals(q.getSurname()))
			{
				return true;
			}
		}
		return false;
	}
	
	
}
