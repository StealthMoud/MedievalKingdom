package kingdom.entities;

public class Knight extends MilitaryCitizen {
    private String armor;
    private String mount;

    public Knight(String name, int age, int health, String armor, String mount, int strength) {
        super(name, age, "knight", health, armor, strength);  // Pass armor as the general weapon
        this.armor = armor;  // Specific to Knight
        this.mount = mount;
    }

    // Getters and Setters
    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
        setWeapon(armor);  // Update general weapon type to armor
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    // Methods
    @Override
    public void train() {
        setStrength(getStrength() + 15);  // Knights gain more strength during training
        System.out.println(getName() + " trained rigorously as a knight. Strength now: " + getStrength());
    }

    @Override
    public void performTask() {
        fight(); // Knights fight as their task
    }

    @Override
    public void fight() {
        if (getStrength() > 0) {
            setStrength(getStrength() - 3);  // Knights lose less strength in fights
            System.out.println(getName() + " fought bravely with " + getArmor() + " armor on their " + getMount() + ". Strength now: " + getStrength());
        } else {
            System.out.println(getName() + " is too weak to fight as a knight!");
        }
    }
}
