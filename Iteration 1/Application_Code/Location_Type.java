public class Location_Type {

	    private String location;

	    public Location_Type(String location) {
	        this.location = location;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void addLocation(Location_List locationList) {
	        locationList.addLocation(this.location);
	    }

        public String toString() {
		return this.getLocation();
	}

}
