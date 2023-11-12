public class Location_Type {

    private String location;

    // Constructor initializes the Location_Type with a specified location.
    public Location_Type(String location) {
        this.location = location;
    }

    // Getter method for retrieving the location.
    public String getLocation() {
        return location;
    }

    // Adds the location to a Location_List instance.
    public void addLocation(Location_List_List locationList) {
        locationList.addLocation(this.location);
    }

    // Overrides the toString method to return the location.
    public String toString() {
        return this.getLocation();
    }
}
