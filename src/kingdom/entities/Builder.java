package kingdom.entities;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Builder extends WorkerCitizen {
    private Map<String, Integer> materials; // Materials required for building tasks
    private String buildingType; // Type of building being constructed

    public Builder(String name, int age, String occupation, int health, List<String> tools, int stamina,
                   Map<String, Integer> materials, String buildingType) {
        super(name, age, occupation, health, Collections.singletonList(String.valueOf(tools)), stamina);
        this.materials = materials;
        this.buildingType = buildingType;
    }

    // Getters and Setters
    public Map<String, Integer> getMaterials() {
        return materials;
    }

    public void setMaterials(Map<String, Integer> materials) {
        this.materials = materials;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    // Override work() to simulate construction work
    @Override
    public void work() {
        if (getStamina() > 0) {
            System.out.println(getName() + " is working on constructing a " + buildingType + ".");
            // Simulate a building task using materials
            System.out.println("Using materials: " + materials);
        } else {
            System.out.println(getName() + " is too tired to build. They need rest.");
        }
    }

    public void build() {
        System.out.println(getName() + " has started building a " + buildingType + " with materials " + materials);
    }

    public void repair() {
        System.out.println(getName() + " is repairing a " + buildingType + " using materials " + materials);
    }
}
