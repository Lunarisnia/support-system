import Distributor.Distributor;

public class Main {
    public static void main(String[] args) {
        Distributor foobar = new Distributor("foobar");
        foobar.setDeliveryTime(10.0f).setPrice(20.0f).setQuality(5.0f);
        // TODO: set up the goal system
        // 1. Goal have all same criteria as distributor
        // 2. But goal will contain a percentage as its criteria symbolizing how much weight a criteria is
        // 3. A Goal have a getter for each criteria

        // TODO: Set up Analytical Hierarchy Process
        // 1. It takes a goal, and distributors
        // 2. It takes each distributor's criteria and then multiply them by goal one another.
        // 3. Since multiplying by goal will result to a percentage of the distributor's criteria add them all up
        // 4. Set the Distributor's total score with the addition result
        // 5. Add a method to return the Distributor with the highest score.

        System.out.println("Hello");
    }
}