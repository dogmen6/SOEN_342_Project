public class Location_Type {

	private String location;

	// default constructor
	public Location_Type() {
		this.location = null;
	}

	// parameterized constructor
	public Location_Type(String location) {
		this.location = location;
	}

	// Getter method for retrieving the location.
	public String getLocation() {
		return this.location;
	}

	// Setter method for retrieving the location.
	public void setLocation(String location) {
		this.location = location;
	}

	// Overrides the toString method to return the location.
	public String toString() {
		return this.getLocation();
	}

	public boolean equals(Location_Type location) {
		return this.getLocation().equalsIgnoreCase(location.getLocation());
	}

}