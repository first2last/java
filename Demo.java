 class MyFood {

    String fastFood;
    String healthy;
    int money;

    // Constructor to initialize the money attribute
    MyFood(int money) {
        this.money = money;
    }

    // Method to print and return a fast food warning message
    public String getFastFoodMessage() {
        System.out.println("Fast food is injurious");
        return "yes";
    }

    // Method to print a healthy food message
    public void getHealthyMessage() {
        System.out.println("Healthy food makes us strong");
    }

    // Method to calculate the budget based on quantity
    public int calculateBudget(int n) {
        return n * money;
    }
}

public class Demo {
    public static void main(String[] args) {

        // Initialize the Food object with a money value of 100
        MyFood obj = new MyFood();

        // Call methods on the Food object
        obj.getFastFoodMessage();
        obj.getHealthyMessage();

        // Calculate budget for 5 items and print it
        int budget = obj.calculateBudget(5);
        System.out.println("Budget: " + budget);
    }
}
