
public class Map_Items {

	private Sensor_Type sensor_type;
	private Location_Type location_type;

	// default constructor
	public Map_Items() {
		this.sensor_type = null;
		this.location_type = null;
	}

	// parameterized constructor
	public Map_Items(Sensor_Type sensor_type, Location_Type location_type) {
		if (sensor_type.getDeployed() == true) {
			this.sensor_type = sensor_type;
			this.location_type = location_type;
		}
	}

	// getter for Sensor_Type
	public Sensor_Type getSensorType() {
		return this.sensor_type;
	}

	// getter for Location_Type
	public Location_Type getLocationType() {
		return this.location_type;
	}

	// setter for Sensor_Type
	public void setSensorType(Sensor_Type sensor_type) {
		this.sensor_type = sensor_type;
	}

	// setter for Location_Type
	public void setLocationType(Location_Type location_type) {
		this.location_type = location_type;
	}

	// overrides the toString to return the Sensor_Type and Location_Type
	public String toString() {
		return this.getSensorType() + ", " + this.getLocationType();
	}

}
