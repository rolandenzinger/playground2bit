package vaccination;


import java.util.Scanner;

public class Location {
	private int LocationID = 0;
	public String Name;
	public String Street;
	public int ZIP;
	public String City;
	public String Country;
	public String[][] locations = new String[9999][6];
	
	private void addLocationData() {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter your Name:");
			Name = sc.nextLine();
			
			System.out.println("Enter your Street:");
			Street = sc.nextLine();
			
			System.out.println("Enter your ZIP:");
			ZIP = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter your City:");
			City = sc.nextLine();
			
			System.out.println("Enter your Country:");
			Country = sc.nextLine();
			
		} catch(Exception ex) {
			System.out.println("Unbekannter Fehler aufgetreten!");
		}
	}
	
	public String[][] addLocation() {
		addLocationData();
		
		locations[LocationID][0] = Integer.toString(LocationID + 1);
		locations[LocationID][1] = Name;
		locations[LocationID][2] = Street;
		locations[LocationID][3] = Integer.toString(ZIP);
		locations[LocationID][4] = City;
		locations[LocationID][5] = Country;
		LocationID++;
		return locations;
	}

	public String[][] deleteLocation(int TLocationID) {
		locations[TLocationID][0] = "";
		locations[TLocationID][1] = "";
		locations[TLocationID][2] = "";
		locations[TLocationID][3] = "";
		locations[TLocationID][4] = "";
		locations[TLocationID][5] = "";
		return locations;
	}
	public void listAllLocations() {
		for(int i = 0; i < locations.length; i++) {
			for(int o = 0; o < locations[0].length; o++) {
				System.out.println(locations[i][o] + ", ");
			}
			System.out.println("");
		}

	}
}
