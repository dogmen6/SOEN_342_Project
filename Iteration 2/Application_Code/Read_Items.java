
public class Read_Items {

	private Sensor_Type sensor;
	private Temperature_Type temperature;

	// default constructor
	public Read_Items() {
		this.sensor = null;
		this.temperature = null;
	}

	// parameterized constructor
	public Read_Items(Sensor_Type sensor, Temperature_Type temperature) {
		this.sensor = sensor;
		this.temperature = temperature;
	}

	// getter for Sensor_Type
	public Sensor_Type getSensorType() {
		return this.sensor;
	}

	// getter for Temperature_Type
	public Temperature_Type getTemperatureType() {
		return this.temperature;
	}

	// setter for Sensor_Type
	public void setSensorType(Sensor_Type sensor) {
		this.sensor = sensor;
	}

	// setter for Temperature_Type
	public void setTemperatureType(Temperature_Type temperature) {
		this.temperature = temperature;
	}

	// overrides the toString to return the Sensor_Type and Temperature_Type
	public String toString() {
		return this.getSensorType() + ", " + this.getTemperatureType();
	}
}