
public class NonUK extends Person { //created another class that inherits the attributes from the Person class
									//this is done so that I can create a person that also has the attribute of 
									//visa information. This is required because Person's from the UK are not required to have via info
	String visaInfo;

	public NonUK(String firstName, String surname, String dob, String nation, String visaInfo) {
		super(firstName, surname, dob, nation);
		this.visaInfo = visaInfo;
	}

	public String getVisaInfo() {
		return visaInfo;
	}

	public void setVisaInfo(String visaInfo) {
		this.visaInfo = visaInfo;
	}
	
	public String toString() {
		return "Name: " + this.firstName + " " + this.surname + ". DOB: " + this.dob + ". Nationality: " + this.nation + ". Visa code: " + this.visaInfo;
		
	}

}
