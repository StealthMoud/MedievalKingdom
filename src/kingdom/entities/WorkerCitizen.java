package kingdom.entities;

import java.util.List;

public abstract class WorkerCitizen extends Citizen {
    private List<String> tools; // List of tools used by the worker
    private int stamina; // Amount of stamina for work tasks

    public WorkerCitizen(String name, int age, String occupation, int health, List<String> tools, int stamina) {
        super(name, age, occupation, health);
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

    // Methods
    @Override
    public void performTask() {
        if (stamina > 0) {
            work();
            stamina -= 10; // Decrease stamina after performing a task
            System.out.println(getName() + " worked hard and now has " + stamina + " stamina left.");
        } else {
            System.out.println(getName() + " is too tired to work. They need rest.");
        }
    }

    // Abstract method for work tasks
    public abstract void work();

    // Rest method to recover stamina
    public void rest() {
        stamina += 20;
        System.out.println(getName() + " is resting and has regained stamina. Current stamina: " + stamina);
    }

    @Override
    public void eat(int restoreAmount) {
        super.eat(restoreAmount); // Recover some health while eating
        stamina += 5; // Increase stamina slightly when eating
    }
}
