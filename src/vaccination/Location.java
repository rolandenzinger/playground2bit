package vaccination;

public class Location {
	public int LocationID;
	public String Name;
	public String Street;
	public int ZIP;
	public String City;
	public String Country;
	public String[][] locations = new String[1][6];

	public String[][] addLocation(int TLocationID, String TName, String TStreet, int TZIP, String TCity, String TCOuntry) {
		locations[0][0] = Integer.toString(TLocationID);
		locations[0][1] = TName;
		locations[0][2] = TStreet;
		locations[0][3] = Integer.toString(TZIP);
		locations[0][4] = TCity;
		locations[0][5] = TCOuntry;
		return locations;
	}

	public String[][] deleteLocation() {
		locations[0][0] = "";
		locations[0][1] = "";
		locations[0][2] = "";
		locations[0][3] = "";
		locations[0][4] = "";
		locations[0][5] = "";
		return locations;
	}
	public void listAllLocations() {
		System.out.println(locations);
	}
}
