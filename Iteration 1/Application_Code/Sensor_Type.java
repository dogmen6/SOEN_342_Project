
public class Sensor_Type {

	private boolean deployed;
	private String sensor;

	public Sensor_Type() {
		this.deployed = false;
		this.sensor = null;
	}

	public Sensor_Type(boolean deployed, String sensor) {
		this.deployed = deployed;
		this.sensor = sensor;
	}

	public boolean getDeployed() {
		return this.deployed;
	}

	public String getSensor() {
		return this.sensor;
	}

	public void setDeployed(boolean deployed) {
		this.deployed = deployed;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	// without this, when printing an arraylist of Sensor_Type, it will
	// use the default toString and will print the Type and its Hashcode
	// i.e.: Sensor_Type@6732e
	// by adding this, it allows to override it with the string representation
	// of our choice i.e.: false, Sensor1
	public String toString() {
		return this.getDeployed() + ", " + this.getSensor();
	}
}
