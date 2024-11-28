package kingdom.entities;

import java.util.Map;

public class Merchant extends Citizen {
    private Map<String, Integer> inventory;  // Item name and quantity
    private int wealth;

    // Constructor
    public Merchant(String name, int age, Map<String, Integer> inventory, int wealth) {
        super(name, age, "Merchant", 100);
        this.inventory = inventory;
        this.wealth = wealth;
    }

    // Getters and Setters
    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    // Additional Methods
    public void trade(String item, int quantity, int price) {
        // Simulate trade: decrease item quantity, increase wealth
        if (inventory.containsKey(item) && inventory.get(item) >= quantity) {
            inventory.put(item, inventory.get(item) - quantity);
            wealth += price * quantity;
            System.out.println(getName() + " traded " + quantity + " " + item + "(s) for " + (price * quantity) + " gold.");
        } else {
            System.out.println(getName() + " doesn't have enough " + item + " to trade.");
        }
    }

    public void calculateWealth() {
        // Optionally, we could add logic to calculate wealth based on remaining inventory
        System.out.println(getName() + "'s current wealth: " + wealth);
    }

    // Implement the abstract method from Citizen class
    @Override
    public void performTask() {
        System.out.println(getName() + " is trading goods in the market.");
    }
}
