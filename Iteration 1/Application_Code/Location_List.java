import java.util.*; // import ArrayList

public class Location_List {

	// Create an ArrayList of type Location Type
	private ArrayList<Location_Type> location_list;

	// default constructor
	public Location_List() {
		this.location_list = new ArrayList<Location_Type>();
	}

	// parameterized constructor
	public Location_List(ArrayList<Location_Type> location_list) {
		this.location_list = location_list;
	}

	// returns the ArrayList of Location_Type elements
	public ArrayList<Location_Type> getLocation_List() {
		return this.location_list;
	}

	// initializes the ArrayList of type Location_Type to a new ArrayList
	// of type Location_Type
	public void setLocation_List(ArrayList<Location_Type> location_list) {
		this.location_list = location_list;
	}

	// adds a new Location_Type in the ArrayList of Location_Type
	public void addLocation_Type(Location_Type location) {
		this.location_list.add(location);
	}

	// return the location from the ArrayList
	public Location_Type getLocationFromList(int x) {
		return this.location_list.get(x);
	}

	// return boolean if the location is in the list (true if it is and
	// false if it is not)
	public boolean locationExist(Location_Type location) {
		for (int i = 0; i < this.location_list.size(); i++) {
			if (this.location_list.get(i).equals(location))
				return true;
		}
		return false;

	}

	// override the toString
	public String toString() {
		return this.getLocation_List() + "";
	}
}