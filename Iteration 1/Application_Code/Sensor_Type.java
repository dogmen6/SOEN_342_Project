
public class Sensor_Type {

	private boolean deployed;
	private String sensor;

	// default constructor
	public Sensor_Type() {
		this.deployed = false;
		this.sensor = null;
	}

	// parameterized constructor
	public Sensor_Type(boolean deployed, String sensor) {
		this.deployed = deployed;
		this.sensor = sensor;
	}

	// getter for deployed
	public boolean getDeployed() {
		return this.deployed;
	}

	// getter for sensor
	public String getSensor() {
		return this.sensor;
	}

	// setter for deployed
	public void setDeployed(boolean deployed) {
		this.deployed = deployed;
	}

	// setter for sensor
	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	// overriden toString to return the deployed and sensor instead of
	// an object type and hashcode in the arraylist
	public String toString() {
		return this.getDeployed() + ", " + this.getSensor();
	}

	public boolean equals(Sensor_Type sensor) {
		if (this.sensor.equalsIgnoreCase(sensor.getSensor()) && this.deployed == sensor.getDeployed()) {
			return true;
		}
		return false;
	}
}
