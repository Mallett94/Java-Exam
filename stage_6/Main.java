import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static ArrayList<Marina> mList = new ArrayList<Marina>(); // creates an ArrayList of type Marina called mList
	static ArrayList<Boat> bList = new ArrayList<Boat>(); // creates an ArrayList of type Boat called bList
	static ArrayList<Person> pList = new ArrayList<Person>(); // creates an ArrayList of type Person called pList
	static String fileName = "Stage_5_input.txt";

	public static void main(String[] args) {
		
		String mainList = (readData(fileName));
		//System.out.println(mainList);
		parseData(mainList);
		//System.out.println(mList);
		//System.out.println(bList);
		//System.out.println(pList);
		assignPeople("Peter", "Jackson", "Boaty McBoatface", "Captain");
		assignPeople("Emma", "Watson", "Boaty McBoatface", "Owner");
		assignPeople("Adele", "Ginger", "Boaty McBoatface", "Crew");
		assignPeople("Avril", "Lavigne", "Boaty McBoatface", "Crew");
		assignPeople("Brian", "Johnson", "Boaty McBoatface", "Crew");
		assignPeople("Peter", "Jackson", "Santa Maria", "Crew");
		assignPeople("Mary", "Jones", "Mary's Dream", "Owner");
		assignPeople("Linus", "Torvalds", "Aquaholic", "Captain");
		assignPeople("Bill", "Knightly", "Aquaholic", "Owner");
		assignPeople("David", "Green", "Aquaholic", "Owner");
		mList.get(0).addBoat(bList.get(3));
		mList.get(1).addBoat(bList.get(1));
		mList.get(1).addBoat(bList.get(2));
		mList.get(0).addBoat(bList.get(0));
		
	}
	
	// function to read data from file
	@SuppressWarnings("resource")
	public static String readData(String filePath) {

		File data = new File(filePath); // sets the file data to be the data in the text file
		BufferedReader br = null; // creates a reference to a buffered reader called 'br' that is not pointing anywhere

		FileReader fr; // creates a reference to a filereader called 'fr'
		try {
			fr = new FileReader(data); // creates a new filereader instance
			br = new BufferedReader(fr); // creates a new bufferedreader
											// instance
			String line; // create a new String called 'line'
			// ArrayList<String> list = new ArrayList<>();
			String totalInput = "$"; // creates a new String called 'totalInput' which is empty

			while ((line = br.readLine()) != null) { // start a while loop that will continue until there is not text left
				totalInput += line + "-"; // updates the totalInput String to include the next line of text read in from the file and then start a new line
			}
			return totalInput; // when the while loop finishes returns the totalInput String
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found: " + data.toString());
		}

		catch (IOException e) {
			System.out.println("Unable to read file: " + data.toString());
		}

		finally {
			
		}
		return null;

	}
	
	public static void parseData(String firstList) {
		
		
		String[] firstSplit = firstList.replace("-", "\n").replace("$Marinas", "").split("Boats");//creates a string array with everything above boats in [0] and everything below boats in [1]
		String[] marinas = firstSplit[0].trim().split("\\|");
		//System.out.println(Arrays.toString(marinas));
		
		for (int i = 0; i < marinas.length; i++) {
			String[] iList = marinas[i].trim().split("\n"); 
			
			int parsedSize = Integer.parseInt(iList[2]);
			
			mList.add(new Marina(iList[0], iList[1], parsedSize));
		}
		/*for (Marina m : mList) {
			System.out.println( m.getName() + m.getAddress() + m.getSize());
		}*/
		
		
		String[] secondSplit = firstSplit[1].split("People");
		String[] boats = secondSplit[0].trim().split("\\|");
		//System.out.println(Arrays.toString(boats));
		
		for (int j = 0; j < boats.length; j++) {
			String[] jList = boats[j].trim().split("\n"); 
			
			double parsedSize = Double.parseDouble(jList[2]);
			
			bList.add(new Boat(jList[0], jList[1], parsedSize));
		}
		/*for (Boat b: bList) {
			System.out.println(b.getName() + b.getOrigin() + b.getSize());
		}*/
		
		
		
		String[] people = secondSplit[1].trim().split("\\|");
		//System.out.println(Arrays.toString(people));
		
		for (int k = 0; k < people.length; k++) {
			String[] kList = people[k].trim().split("\n"); 
			String[] name = kList[0].split(" ");
			String fName = name[0];
			String sName = name[1];
			
			if (kList.length <= 3){
				pList.add(new Person(fName, sName, kList[1], kList[2]));
			}
			
			else {
				pList.add(new NonUK(fName, sName, kList[1], kList[2], kList[3]));
			}
		
		}
						
	}
	public static void assignPeople(String fName, String sName, String boat, String role)
	{
		for (Boat b: bList)
		{
			if (b.getName().equals(boat))
			{
				for (Person p: pList)
				{
					if (p.getFirstName().equals(fName) && p.getSurname().equals(sName))
					{
						b.hasPerson(p, role);
					}
				}
			}
		}
		
	}

}

