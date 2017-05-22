import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	ArrayList<Person> pList = new ArrayList<Person>(); // creates an ArrayList of type Person called pList
	static String fileName = "Stage_5_input.txt";

	public static void main(String[] args) {
		
		String mainList = (readData(fileName));
		//System.out.println(mainList);
		parseData(mainList);
		

	}

	public void addPerson() {
		for (Person p : pList) {
			pList.add(p);
		}
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
			String totalInput = ""; // creates a new String called 'totalInput' which is empty

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
		
		String[] firstSplit = firstList.replace("-", "\n").replaceAll("Marinas", "").trim().split("Boats");//creates a string array with everything above boats in [0] and everything below boats in [1]
		String[] marinas = firstSplit[0].trim().split("\\|");
		String[] secondSplit = firstSplit[1].split("People");
		String[] boats = secondSplit[0].split("\\|");
		String[] people = secondSplit[1].split("\\|");
		
		//my aim here is to parse the master string into 3 sections. Marinas boats and people. By replacing characters i dont need and splitting i should be able to create 3 arrays containing the information i need with which
		//to use complex for loops to create objects. one array would be used to create marina objects, another would be used to create boat objects and the final one would be used to create person/non uk person objects
		//once this was completed I would be able to write a methoid to add people to boats and also assing roles, which would enable me to implement the constraints from stage 4
		
		System.out.println(Arrays.toString(marinas));
		//System.out.println(marinas[0]);
		
		//System.out.println(Arrays.toString(marinas));
		//System.out.println(Arrays.toString(boats));
		//System.out.println(Arrays.toString(people));
		}
						
}



