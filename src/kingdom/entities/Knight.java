package kingdom.entities;

public class Knight extends Citizen {
    private String weapon;
    private int strength;

    // Constructor
    public Knight(String name, int age, String weapon, int strength) {
        super(name, age, "Knight", 100);
        this.weapon = weapon;
        this.strength = strength;
    }

    // Getters and Setters
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Additional Methods
    public void train() {
        strength += 10;
        System.out.println(getName() + " has trained and increased strength by 10. Current strength: " + strength);
    }

    public void fight() {
        System.out.println(getName() + " is fighting with their " + weapon + "!");
        // Simulate combat logic here (e.g., reduce health, gain experience, etc.)
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is on patrol to defend the kingdom.");
    }
}
