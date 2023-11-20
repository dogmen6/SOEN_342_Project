import java.util.*;

public class Driver {

	public static void main(String[] args) {

		Sensor_Type s1 = new Sensor_Type(true, "Geophone");
		Sensor_Type s2 = new Sensor_Type(false, "Hydrophone");
		Sensor_Type s3 = new Sensor_Type(false, "Microphone");
		Sensor_Type s4 = new Sensor_Type(true, "Seismometer");
		Sensor_Type s5 = new Sensor_Type(true, "Gravimeter");
		Sensor_Type s6 = new Sensor_Type(true, "Accelerometer");
		Sensor_Type s7 = new Sensor_Type(true, "Inclinometer");
		Sensor_Type s8 = new Sensor_Type(false, "Odometer");
		Sensor_Type s9 = new Sensor_Type(true, "Tachometer");
		Sensor_Type s10 = new Sensor_Type(true, "Photodiode");

		Sensor_List sensorList = new Sensor_List();

		sensorList.addSensor_Type(s1);
		sensorList.addSensor_Type(s2);
		sensorList.addSensor_Type(s3);
		sensorList.addSensor_Type(s4);
		sensorList.addSensor_Type(s5);
		sensorList.addSensor_Type(s6);
		sensorList.addSensor_Type(s7);
		sensorList.addSensor_Type(s8);
		sensorList.addSensor_Type(s9);
		sensorList.addSensor_Type(s10);

		// there is an exact number of location for the number of deployed sensors
		Location_Type l1 = new Location_Type("Saint-Jerome");
		Location_Type l2 = new Location_Type("Sarnia");
		Location_Type l3 = new Location_Type("Mont-Royal");
		Location_Type l4 = new Location_Type("Deseronto");
		Location_Type l5 = new Location_Type("Hantsport");
		Location_Type l6 = new Location_Type("Langley");
		Location_Type l7 = new Location_Type("Laval");

		Location_List locationList = new Location_List();

		locationList.addLocation_Type(l1);
		locationList.addLocation_Type(l2);
		locationList.addLocation_Type(l3);
		locationList.addLocation_Type(l4);
		locationList.addLocation_Type(l5);
		locationList.addLocation_Type(l6);
		locationList.addLocation_Type(l7);

		// there is a minimum number of temperature for the number of deployed sensors
		Temperature_Type t1 = new Temperature_Type("100.4");
		Temperature_Type t2 = new Temperature_Type("-110.1");
		Temperature_Type t3 = new Temperature_Type("177.0");
		Temperature_Type t4 = new Temperature_Type("29.2");
		Temperature_Type t5 = new Temperature_Type("-174.4");
		Temperature_Type t6 = new Temperature_Type("31.5");
		Temperature_Type t7 = new Temperature_Type("-120.7");
		Temperature_Type t8 = new Temperature_Type("-48.4");
		Temperature_Type t9 = new Temperature_Type("-30.1");
		Temperature_Type t10 = new Temperature_Type("6.3");
		Temperature_Type t11 = new Temperature_Type("20.5");
		Temperature_Type t12 = new Temperature_Type("97.4");
		Temperature_Type t13 = new Temperature_Type("154.6");
		Temperature_Type t14 = new Temperature_Type("190.9");

		Temperature_List temperatureList = new Temperature_List();

		temperatureList.addTemperature_Type(t1);
		temperatureList.addTemperature_Type(t2);
		temperatureList.addTemperature_Type(t3);
		temperatureList.addTemperature_Type(t4);
		temperatureList.addTemperature_Type(t5);
		temperatureList.addTemperature_Type(t6);
		temperatureList.addTemperature_Type(t7);
		temperatureList.addTemperature_Type(t8);
		temperatureList.addTemperature_Type(t9);
		temperatureList.addTemperature_Type(t10);
		temperatureList.addTemperature_Type(t11);
		temperatureList.addTemperature_Type(t12);
		temperatureList.addTemperature_Type(t13);
		temperatureList.addTemperature_Type(t14);

//		System.out.println(sensorList + "\n" + locationList + "\n" + temperatureList);

		// only sensors that are deployed have a location and a temperature
		Map_Items slpair1 = new Map_Items(s1, l1);
		Map_Items slpair2 = new Map_Items(s4, l2);
		Map_Items slpair3 = new Map_Items(s5, l3);
		Map_Items slpair4 = new Map_Items(s6, l4);
		Map_Items slpair5 = new Map_Items(s7, l5);
		Map_Items slpair6 = new Map_Items(s9, l6);
		Map_Items slpair7 = new Map_Items(s10, l7);

		Map map = new Map();

		map.addMap_Items(slpair1);
		map.addMap_Items(slpair2);
		map.addMap_Items(slpair3);
		map.addMap_Items(slpair4);
		map.addMap_Items(slpair5);
		map.addMap_Items(slpair6);
		map.addMap_Items(slpair7);

		Read_Items stpair1 = new Read_Items(s1, t1);
		Read_Items stpair2 = new Read_Items(s4, t2);
		Read_Items stpair3 = new Read_Items(s5, t3);
		Read_Items stpair4 = new Read_Items(s6, t4);
		Read_Items stpair5 = new Read_Items(s7, t5);
		Read_Items stpair6 = new Read_Items(s9, t6);
		Read_Items stpair7 = new Read_Items(s10, t7);

		Read read = new Read();

		read.addRead_Items(stpair1);
		read.addRead_Items(stpair2);
		read.addRead_Items(stpair3);
		read.addRead_Items(stpair4);
		read.addRead_Items(stpair5);
		read.addRead_Items(stpair6);
		read.addRead_Items(stpair7);

		TempMonitor tempM = new TempMonitor(map, read, locationList, sensorList, temperatureList);

//		System.out.println(map + "\n" + read);


		Scanner scan = new Scanner(System.in);
		boolean menu = true;
		int answer;
		String sensor;
		String newSensor;
		String location;
		String temperature;

		System.out.println(
				"Welcome to the Space4Fun Center!\nPlease refer to the menu below for the different options we offer!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		do {
			System.out.println(
					"Pick a number from below:\n1. Deploy a new sensor\n2. Find the temperature for a specific sensor given its location"
							+ "\n3. Find out if the sensor of your choice has already been deployed\n4. Find out if the location of your choice has a sensor"
							+ "\n5. View the list of sensors and locations\n6. View the list of sensors and temperatures"
							+ "\n7. View the list of all sensors\n8. View the list of all locations\n9. View the list of all temperatures"
							+ "\n10. View the list of sensor locations and sensor temperatures\n11. Replace a sensor with another sensor\n12. Close menu");

			answer = scan.nextInt();

			if (answer == 1) {
				System.out.println("\nPlease write the sensor of your choice: ");
				Sensor_Type userSensor = new Sensor_Type(true, sensor = scan.next());

				System.out.println("\nPlease write the location of your choice: ");
				Location_Type userLoc = new Location_Type(location = scan.next());

				System.out.println("\nPlease write the temperature of your choice: ");
				Temperature_Type userTemp = new Temperature_Type(temperature = scan.next());

				System.out.println(tempM.deploySensorOK(userSensor, userLoc, userTemp, map, read, sensorList,
						temperatureList, locationList) + "\n\n");

			}
			if (answer == 2) {
				System.out.println("\nPlease write the location of your choice: ");
				Location_Type userLoc = new Location_Type(location = scan.next());

				System.out.println(tempM.readTemperatureOK(userLoc, map, read));
			}
			if (answer == 3) {
				System.out.println("\nPlease write the sensor of your choice: ");
				Sensor_Type userSensor = new Sensor_Type(true, sensor = scan.next());

				System.out.println(tempM.SensorAlreadyDeployed(userSensor, sensorList));
			}
			if (answer == 4) {

				System.out.println("\nPlease write the location of your choice: ");
				Location_Type userLoc = new Location_Type(location = scan.next());

				System.out.println(tempM.LocationCovered(userLoc, locationList));
			}

			if (answer == 5) {
				System.out.println("\n" + map + "\n");
			}

			if (answer == 6) {
				System.out.println("\n" + read + "\n");
			}

			if (answer == 7) {
				System.out.println("\n" + sensorList + "\n");
			}

			if (answer == 8) {
				System.out.println("\n" + locationList + "\n");
			}

			if (answer == 9) {
				System.out.println("\n" + temperatureList + "\n");
			}
			
			if (answer==10) {
				System.out.println("\n" + tempM.ReadCollectionOK(map, read) + "\n");
			}
			
			if (answer==11) {
				
				System.out.println("\nPlease write the name of sensor you want to replace: ");
				Sensor_Type sensor1 = new Sensor_Type(true, sensor = scan.next());
				
				System.out.println("\nPlease write the new name of the sensor: ");
				Sensor_Type newSensor1 = new Sensor_Type(true, newSensor = scan.next());
				
				System.out.println("\n" + tempM.ReplaceSensorOK(sensor1, newSensor1, map, read, sensorList) + "\n");
			}

			if (answer == 12) {
				System.out.println("\nThat was so fun! Come back next time!");
				menu = false;
			}

		} while (menu == true);

		scan.close();
	}

}
