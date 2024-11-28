package kingdom.entities;

public class Archer extends MilitaryCitizen {
    private String bowType;
    private int range;

    public Archer(String name, int age, int health, String bowType, int range, int strength) {
        super(name, age, "Archer", health, bowType, strength);  // Pass bowType as the general weapon
        this.bowType = bowType;
        this.range = range;
    }

    // Getters and Setters
    public String getBowType() {
        return bowType;
    }

    public void setBowType(String bowType) {
        this.bowType = bowType;
        setWeapon(bowType);  // Update general weapon type to bowType
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    // Methods
    @Override
    public void train() {
        setStrength(getStrength() + 12);  // Archers gain a moderate amount of strength during training
        range += 5;  // Training improves range
        System.out.println(getName() + " practiced archery. Strength: " + getStrength() + ", Range: " + range);
    }

    @Override
    public void performTask() {
        shootArrow(); // Archers shoot arrows as their task
    }

    public void shootArrow() {
        if (getStrength() > 0) {
            setStrength(getStrength() - 2);  // Shooting reduces strength slightly
            System.out.println(getName() + " shot an arrow with their " + bowType + ". Strength now: " + getStrength());
        } else {
            System.out.println(getName() + " is too weak to shoot arrows!");
        }
    }

    @Override
    public void fight() {
        System.out.println(getName() + " engaged in ranged combat using their " + bowType + " at a range of " + range + " meters.");
    }
}
