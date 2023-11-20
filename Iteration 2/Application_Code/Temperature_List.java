import java.util.*; //import ArrayList

public class Temperature_List {

	// Create an ArrayList of type Temperature_Type
	private ArrayList<Temperature_Type> temperature_list;

	// default constructor
	public Temperature_List() {
		this.temperature_list = new ArrayList<Temperature_Type>();
	}

	// parameterized constructor
	public Temperature_List(ArrayList<Temperature_Type> temperature_list) {
		this.temperature_list = temperature_list;
	}

	// returns the ArrayList of Temperature_Type elements
	public ArrayList<Temperature_Type> getTemperature_List() {
		return this.temperature_list;
	}

	// initializes the ArrayList of type Temperature_Type to a new ArrayList
	// of type Temperature_Type
	public void setTemperatureList(ArrayList<Temperature_Type> temperature_list) {
		this.temperature_list = temperature_list;
	}

	// adds a new Temperature_Type in the ArrayList of Temperature_Type
	public void addTemperature_Type(Temperature_Type temperature) {
		this.temperature_list.add(temperature);
	}

	// return the temperature from the ArrayList
	public Temperature_Type getTemperatureFromList(int x) {
		return this.temperature_list.get(x);
	}
	
	// override the toString
	public String toString() {
		return this.getTemperature_List()+ "";
	}
}