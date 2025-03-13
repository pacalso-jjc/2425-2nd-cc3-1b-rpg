import java.util.ArrayList;
import java.util.List;

// Represents a World with locations, name, age, and description
public class World {

    // Attributes
    private List<String> locations;
    private String worldName;
    private int worldAge;
    private String description;

    // Constructor
    public World(String name, int age, String description) {
        this.worldName = name;
        this.worldAge = age;
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

    // Returns the world name
    public String getWorldName() {
        return worldName;
    }

    // Sets the world age
    public void setWorldAge(int age) {
        this.worldAge = age;
    }

    // Returns the world age
    public int getWorldAge() {
        return worldAge;
    }

    // Displays world information
    public void displayWorldInfo() {
        System.out.println("World Name: " + worldName);
        System.out.println("World Age: " + worldAge);
        System.out.println("Description: " + description);
        System.out.println("Locations: " + locations);
    }

    // Simulates world progression by increasing the age
    public void simulateWorldProgression() {
        worldAge++;
    }

    // Resets the world to its initial state
    public void resetWorld() {
        worldAge = 0;
        locations.clear();
    }
}
