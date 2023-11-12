import java.util.ArrayList; // import ArrayList Class

public class Sensor_List {

	// create an ArrayList of type Sensor_Type
	private ArrayList<Sensor_Type> sensor_type;

	// default constructor
	public Sensor_List() {
		this.sensor_type = new ArrayList<Sensor_Type>();
	}

	// parameter constructor
	public Sensor_List(ArrayList<Sensor_Type> sensor_type) {
		this.sensor_type = sensor_type;
	}

	// returns the ArrayList of Sensor_Type elements
	public ArrayList<Sensor_Type> getSensor_List() {
		return sensor_type;
	}

	// initializes the ArrayList of type Sensor_Type to a new ArrayList
	// of type Sensor_Type
	public void setSensor_List(ArrayList<Sensor_Type> sensor_type) {
		this.sensor_type = sensor_type;
	}

	// adds a new Sensor_Type in the ArrayList of Sensor_Type
	public void addSensor_Type(Sensor_Type sensor) {
		this.sensor_type.add(sensor);
	}

	// adds a new Sensor_Type in the ArrayList of Sensor_Type in a specific index
	public void addSensor_Type(int x, Sensor_Type sensor) {
		this.sensor_type.add(x, sensor);
	}

	// return the sensor name from the list
	public String getSensorFromList(int x) {
		return this.sensor_type.get(x).getSensor();
	}

	// return the sensor is deployment from the list
	public boolean getDeployedFromList(int x) {
		return this.sensor_type.get(x).getDeployed();

	}

	// return the sensor deployment and name from the list
	public Sensor_Type getSensor_Type(int x) {
		return this.sensor_type.get(x);
	}
	
	// NOTE: might include methods such as remove(), clear(), size(), and set()

	// method that checks if the sensor exists in the Arraylist and if it is
	// deployed
	public boolean existsSensor(Sensor_Type sensor) {

		boolean existAndDeployed = false; // assumes it does not exist
		for (int i = 0; i < this.sensor_type.size(); i++) { // for loop goes through the given arraylist
			// if the sensor name is the same as the sensor name in the arraylist then
			// existAndDeployed will be equal to the deployed boolean (true means it is
			// deployed, false means it is not deployed)
			if (sensor.getSensor().equalsIgnoreCase(this.sensor_type.get(i).getSensor())) {
				existAndDeployed = this.sensor_type.get(i).getDeployed();
				if (existAndDeployed == true) {
					System.out.println("The sensor exists and it is deployed.");
				} else {
					System.out.println("The sensor exists, but it is not deployed.");
				}
				return existAndDeployed;
			}
		}
		System.out.println("The sensor does not exist!");
		return existAndDeployed; // if the name is not found, it does not exist and returns false
	}
}
