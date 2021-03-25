package vaccination;

public class Location {
	public int LocationID = 0;
	public String Name;
	public String Street;
	public int ZIP;
	public String City;
	public String Country;
	public String[][] locations = new String[9999][6];

	public String[][] addLocation(String TName, String TStreet, int TZIP, String TCity, String TCOuntry) {
		locations[LocationID][0] = Integer.toString(LocationID + 1);
		locations[LocationID][1] = TName;
		locations[LocationID][2] = TStreet;
		locations[LocationID][3] = Integer.toString(TZIP);
		locations[LocationID][4] = TCity;
		locations[LocationID][5] = TCOuntry;
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
				System.out.print(locations[i][o] + ", ");
			}
			System.out.println("");
		}
	}
}
