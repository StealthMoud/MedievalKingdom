package kingdom.entities;

public abstract class Citizen {
    private static int idCounter = 1;  // Counter to assign unique ID to each citizen
    private final int citizenId;
    private String name;
    private int age;
    private String occupation;
    private int health;

    public Citizen(String name, int age, String occupation, int health) {
        this.citizenId = idCounter++;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.health = health;
    }

    // Getters and Setters
    public int getCitizenId() {
        return citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Methods
    public void introduce() {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old and I work as a " + occupation + ".");
    }

    // Abstract method that will be implemented by subclasses
    public abstract void performTask();

    public void eat(int restoreAmount) {
        this.health += restoreAmount;
        System.out.println(name + " has eaten and restored " + restoreAmount + " health points.");
    }

    public void speak(String message) {
        System.out.println(name + " says: " + message);
    }
}
