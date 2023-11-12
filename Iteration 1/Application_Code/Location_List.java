import java.util.ArrayList;
import java.util.List;

public class Location_List {

    private List<Location_Type> locationList;

    // Constructor initializes the Location_List with an empty list of Location_Type.
    public Location_List() {
        this.setLocationList(new ArrayList<>());
    }

    // Getter method for retrieving the list of Location_Type.
    public List<Location_Type> getLocationList() {
        return locationList;
    }

    // Setter method for setting the list of Location_Type.
    public void setLocationList(List<Location_Type> locationList) {
        this.locationList = locationList;
    }

    // Adds a new location to the list.
    public void addLocation(String location) {
        Location_Type locationType = new Location_Type(location);
        locationList.add(locationType);
    }
}
