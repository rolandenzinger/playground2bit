package vaccination;

public class Location {
	public int LocationID;
	public String Name;
	public String Street;
	public String ZIP;
	public String City;
	public String Country;

	public int addLocation(String TName, String TStreet, String TZIP, String TCity, String TCOuntry) {

		return 1;
	}

	public Boolean deleteLocation(String TName, String TStreet, String TZIP, String TCity, String TCOuntry) {
		return true;
	}
	public void listAllLocations() {
		System.out.println("Baumax Leoben");
	}
}
