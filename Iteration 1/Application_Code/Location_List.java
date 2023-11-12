import java.util.ArrayList;
import java.util.List;

public class Location_List_List {

	    private List<Location_Type> locationList;

	    public Location_List() {
	        this.setLocationList(new ArrayList<>());
	    }

		public List<Location_Type> getLocationList() {
			return locationList;
		}

		public void setLocationList(List<Location_Type> locationList) {
			this.locationList = locationList;
		}
		
		 public void addLocation(String location) {
		        Location_Type locationType = new Location_Type(location);
		        locationList.add(locationType);
		    }
	
}
