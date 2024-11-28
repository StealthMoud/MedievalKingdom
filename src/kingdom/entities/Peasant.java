package kingdom.entities;

import java.util.List;

public class Peasant extends Citizen {
    private List<String> tools;  // List of tools used by the peasant
    private int stamina;

    // Constructor
    public Peasant(String name, int age, List<String> tools, int stamina) {
        super(name, age, "Peasant", 100);
        this.tools = tools;
        this.stamina = stamina;
    }

    // Getters and Setters
    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    // Additional Methods
    public void farm() {
        if (stamina > 10) {
            stamina -= 10;
            System.out.println(getName() + " is farming. Stamina reduced by 10. Current stamina: " + stamina);
        } else {
            System.out.println(getName() + " is too tired to farm. Rest is needed.");
        }
    }

    public void harvest() {
        if (stamina > 5) {
            stamina -= 5;
            System.out.println(getName() + " harvested crops. Stamina reduced by 5. Current stamina: " + stamina);
        } else {
            System.out.println(getName() + " doesn't have enough stamina to harvest.");
        }
    }

    public void rest() {
        stamina = 100;  // Restores stamina fully
        System.out.println(getName() + " is resting and restored to full stamina.");
    }

    // Implement the abstract method from Citizen class
    @Override
    public void performTask() {
        System.out.println(getName() + " is working on the farm.");
    }
}
