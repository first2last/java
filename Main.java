import java.util.*;

class Food {

    String fastFood;
    String healthy;
    int money;

    // Constructor to initialize the money attribute
    Food(int money) {
        this.money = money;
    }

    public String getFastFoodMessage() {
        System.out.println("Fast food is injurious");
        return "yes";
    }

    public void getHealthyMessage() {
        System.out.println("Healthy food makes us strong");
    }

    public int calculateBudget(int n) {
        int budget = n * money;
        return budget;
    }
}

public class Main {
    public static void main(String[] args) {

        // Initialize the food object with a money value
        Food obj = new Food(100);

        // Call methods on the food object
        String ans1 = obj.getFastFoodMessage();
        obj.getHealthyMessage();

        // Optional: Calculate budget and print it
        int budget = obj.calculateBudget(5);
        System.out.println("Budget: " + budget);
    }
}
