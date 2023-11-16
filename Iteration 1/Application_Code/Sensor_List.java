import java.util.*; // import ArrayList 

public class Sensor_List {

	// create an ArrayList of type Sensor_Type
	private ArrayList<Sensor_Type> sensor_list;

	// default constructor
	public Sensor_List() {
		this.sensor_list = new ArrayList<Sensor_Type>();
	}

	// parameter constructor
	public Sensor_List(ArrayList<Sensor_Type> sensor_list) {
		this.sensor_list = sensor_list;
	}

	// returns the ArrayList of Sensor_Type elements
	public ArrayList<Sensor_Type> getSensor_List() {
		return this.sensor_list;
	}

	// initializes the ArrayList of type Sensor_Type to a new ArrayList
	// of type Sensor_Type
	public void setSensor_List(ArrayList<Sensor_Type> sensor_list) {
		this.sensor_list = sensor_list;
	}

	// returns the number of elements in a Sensor_Type ArrayList
	public int SensorList_Size() {
		return this.sensor_list.size();
	}

	// adds a new Sensor_Type in the ArrayList of Sensor_Type
	public void addSensor_Type(Sensor_Type sensor) {
		this.sensor_list.add(sensor);
	}

	// return the sensor, deployment and name, from the ArrayList
	public Sensor_Type getSensor_Type(int x) {
		return this.sensor_list.get(x);
	}

	// return the sensor name from the ArrayList
	public String getSensorFromList(int x) {
		return this.sensor_list.get(x).getSensor();
	}

	// return the sensor deployment from the ArrayList
	public boolean getDeployedFromList(int x) {
		return this.sensor_list.get(x).getDeployed();
	}

	// override the toString
	public String toString() {
		return this.getSensor_List() + "";
	}

}
