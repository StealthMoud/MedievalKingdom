package kingdom.entities;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Merchant extends WorkerCitizen {
    private Map<String, Integer> inventory; // Items available for trade and their quantities
    private int wealth; // Amount of wealth (gold) possessed by the merchant

    public Merchant(String name, int age, String occupation, int health, List<String> tools, int stamina,
                    Map<String, Integer> inventory, int wealth) {
        super(name, age, occupation, health, Collections.singletonList(String.valueOf(tools)), stamina);
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

    // Override work() to simulate trading activity
    @Override
    public void work() {
        if (getStamina() > 0) {
            System.out.println(getName() + " is trading goods and managing inventory.");
            System.out.println("Current inventory: " + inventory);
        } else {
            System.out.println(getName() + " is too tired to trade. They need rest.");
        }
    }

    public void trade(String item, int quantity) {
        if (inventory.containsKey(item) && inventory.get(item) >= quantity) {
            inventory.put(item, inventory.get(item) - quantity);
            wealth += quantity * 10; // Each item sold earns the merchant 10 gold
            System.out.println(getName() + " traded " + quantity + " " + item + "(s) and earned gold. Wealth: " + wealth);
        } else {
            System.out.println(getName() + " doesn't have enough " + item + " to trade.");
        }
    }

    public void calculateWealth() {
        System.out.println(getName() + "'s current wealth: " + wealth + " gold.");
    }
}
