import java.util.Scanner;

public class TempMonitor {

	private Map map;
	private Read read;
	private Location_List locationList;
	private Sensor_List sensorList;
	private Temperature_List temperatureList;

	// default constructor
	public TempMonitor() {
		this.map = null;
		this.read = null;
		this.locationList = null;
		this.sensorList = null;
		this.temperatureList = null;
	}

	// parameterized constructor
	public TempMonitor(Map map, Read read, Location_List locationList, Sensor_List sensorList,
			Temperature_List temperatureList) {
		this.map = map;
		this.read = read;
		this.locationList = locationList;
		this.sensorList = sensorList;
		this.temperatureList = temperatureList;
	}

	// setter of Map
	public Map setMap() {
		return this.map;
	}

	// setter of Read
	public Read setRead() {
		return this.read;
	}

	// setter of Location_List
	public Location_List setLocationList() {
		return this.locationList;
	}

	// setter of Sensor_List
	public Sensor_List setSensorList() {
		return this.sensorList;
	}

	// setter of Temperature_List
	public Temperature_List setTemperatureList() {
		return this.temperatureList;
	}

	// getter of Map
	public void getMap(Map map) {
		this.map = map;
	}

	// getter of Read
	public void getRead(Read read) {
		this.read = read;
	}

	// getter of Location_List
	public void getLocationList(Location_List locationList) {
		this.locationList = locationList;
	}

	// getter of Sensor_List
	public void getSensorList(Sensor_List sensorList) {
		this.sensorList = sensorList;
	}

	// getter of Temperature_List
	public void getTemperatureList(Temperature_List temperatureList) {
		this.temperatureList = temperatureList;
	}

	// adds a new sensor, temperature and location and returns a failure or success
	// message
	public String deploySensorOK(Sensor_Type sensor, Location_Type location, Temperature_Type temperature, Map map,
			Read read, Sensor_List sensorList, Temperature_List tempList, Location_List locList) {
		// if the Sensor_Type and Location_Type does not exist in the ArrayList add a
		// new Map_Items and a new Read_Items
		if (this.existsSensorOrLocation(sensor, location, map) == null) {
			map.addMap_Items(map.createMapItems(sensor, location));
			read.addRead_Items(read.createReadItem(sensor, temperature));
			sensorList.addSensor_Type(sensor);
			tempList.addTemperature_Type(temperature);
			locList.addLocation_Type(location);
			// return a success message
			return "Successful!\nHere is your new list of Sensor and Location pairs:\n" + map.getMap_List() + "\n\n"
					+ "Here is your new list of Sensor and Temperature pairs:\n" + read.getRead_List();
		} else
			// return a failure message
			return this.existsSensorOrLocation(sensor, location, map);
	}

	// checks if either the Sensor_Type and Location_Type exists and return a
	// message
	public String existsSensorOrLocation(Sensor_Type sensor, Location_Type location, Map map) {

		if (map.existsSensor(sensor) || map.existsLocation(location)) {
			if (map.existsSensor(sensor) == true && map.existsLocation(location) == true)
				return "Error! Both Sensor and Location already exist!\n";
			if (map.existsSensor(sensor) == true)
				return "Error! Sensor already exists!\n";
			if (map.existsLocation(location) == true)
				return "Error! Location already exists!\n";
		} else {
			return null;
		}
		return null;
	}

	// if the Location_Type exist in the Map then get the Sensor_Type from Map with
	// Location_Type and then get the Temperature_Type from Read with Sensor_Type
	public String readTemperatureOK(Location_Type location, Map map, Read read) {

		if (map.existsLocation(location) == true) {
			return read.getTempTypeFromList(map.getSensorTypeFromList(location)) + "\n";
		} else {
			return "The Sensor and Location does not exist in our system.\n";
		}
	}

	// returns a success message
	public String Success() {
		return "ok\n";
	}

	// checks if the sensor exists in the Sensor_List and checks if it is deployed
	// returns a success or failure message
	public String SensorAlreadyDeployed(Sensor_Type sensor, Sensor_List sensorList) {
		for (int i = 0; i < sensorList.SensorList_Size(); i++) {
			if (sensorList.getSensorFromList(i).equalsIgnoreCase(sensor.getSensor())) {
				if (sensorList.getDeployedFromList(i) == true) {
					return "Sensor deployed!\n";
				} else
					return "Sensor exists, but it is not deployed!\n";
			}
		}
		return "Sensor does not exist!\n";
	}

	// checks if the Location_Type exists in the Location_List
	public String LocationCovered(Location_Type location, Location_List locationList) {
		if (locationList.locationExist(location) == true) {
			return "Location already covered!\n";
		}
		return "Location not covered!\n";
	}

}
