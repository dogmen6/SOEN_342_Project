import java.util.*; // import ArrayList

public class Map {

	// create an ArrayList of type Map_Items (pair of Sensor_Type and Location_Type)
	private ArrayList<Map_Items> map_list;

	// default constructor
	public Map() {
		this.map_list = new ArrayList<Map_Items>();
	}

	// parameterized constructor
	public Map(ArrayList<Map_Items> map_list) {
		this.map_list = map_list;
	}

	// returns the ArrayList of Map_Items elements
	public ArrayList<Map_Items> getMap_List() {
		return this.map_list;
	}

	// initializes the ArrayList of type Map_Items to a new ArrayList
	// of type Map_Items
	public void setMap_List(ArrayList<Map_Items> map_list) {
		this.map_list = map_list;
	}

	// creates a new Map_Item object
	public Map_Items createMapItems(Sensor_Type sensor, Location_Type location) {
		Map_Items newMItem = new Map_Items(sensor, location);
		return newMItem;
	}

	// adds a new Map_Items in the ArrayList of Map_Items
	public void addMap_Items(Map_Items map_items) {
		this.map_list.add(map_items);
	}

	// get Sensor_Type with Location_Type as a parameter
	public Sensor_Type getSensorTypeFromList(Location_Type location) {
		for (int i = 0; i < map_list.size(); i++) {
			if (this.map_list.get(i).getLocationType().equals(location)) {
				return map_list.get(i).getSensorType();
			}
		}
		return null;
	}

	// get Location_Type with Sensor_Type as a parameter
	public Location_Type getLocationTypeFromList(Sensor_Type sensor) {
		for (int i = 0; i < map_list.size(); i++) {
			if (this.map_list.get(i).getSensorType().equals(sensor)) {
				return this.map_list.get(i).getLocationType();
			}
		}
		return null;
	}

	// return boolean if the Sensor_Type exist in the ArrayList
	public boolean existsSensor(Sensor_Type sensor) {
		for (int i = 0; i < this.map_list.size(); i++) {
			if (this.map_list.get(i).getSensorType().equals(sensor)) {
				return true;
			}
		}
		return false;
	}

	// return boolean if the Location_Type exist in the ArrayList
	public boolean existsLocation(Location_Type location) {
		for (int i = 0; i < this.map_list.size(); i++) {
			if (this.map_list.get(i).getLocationType().equals(location)) {
				return true;
			}
		}
		return false;
	}

	// return a Map_Items element from the ArrayList
	public Map_Items getMap_Items(int x) {
		return this.map_list.get(x);
	}
	
	// override the toString
	public String toString() {
		return this.getMap_List() + "";
	}
	
	public int mapSize() {
		return this.map_list.size();
	}
}
