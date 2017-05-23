
public class Person {
	
	//attributes
	
	protected String firstName;
	protected String surname;
	protected String dob;
	protected String nation;
	
	//constructors
	
	public Person(String firstName, String surname, String dob, String nation) {
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.nation = nation;
	}
	
	//getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String toString() { //method to format the data
		return "Name: " + this.firstName + " " + this.surname + ". DOB: " + this.dob + ". Nationality: " + this.nation;
		
	}

}
