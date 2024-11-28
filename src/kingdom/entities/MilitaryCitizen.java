package kingdom.entities;

public abstract class MilitaryCitizen extends Citizen {
    private String weapon;
    private int strength;

    public MilitaryCitizen(String name, int age, String occupation, int health, String weapon, int strength) {
        super(name, age, occupation, health);
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

    // Methods
    public abstract void train();

    public abstract void fight();

}
