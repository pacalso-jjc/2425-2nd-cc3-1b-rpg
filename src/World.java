import java.util.ArrayList;
import java.util.List;

// Represents a World with locations, name, and description
public class World {

    // Attributes
    private List<Location> locations;
    private String worldName;
    private String description;

    // Constructor
    public World(String name, String description) {
        this.worldName = name;
        this.description = description;
        this.locations = new ArrayList<>();
    }

    // Adds a location to the world
    public void addLocation(String location) {
        locations.add(location);
    }

    // Removes a location from the world
    public void removeLocation(String location) {
        locations.remove(location);
    }

    // Returns the list of locations
    public List<String> getLocations() {
        return locations;
    }

    // Sets the world name
    public void setWorldName(String name) {
        this.worldName = name;
    }

    // Returns the worldname
    public String getWorldName() {
        return worldName;
    }

    // Displays world information
    public void displayWorldInfo() {
        System.out.println("World Name: " + worldName);
        System.out.println("Description: " + description);
        System.out.println("Locations: " + locations);
    }
}
