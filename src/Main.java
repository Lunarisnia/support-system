import AHP.Goal;
import AHP.Subject;

public class Main {
    public static void main(String[] args) {
        Subject foobar = new Subject("foobar");
        foobar.setDeliveryTime(10.0f).setPrice(20.0f).setQuality(5.0f);

        Goal goal = new Goal();
        goal.setService(0.25f).setPrice(0.25f).setQuality(0.25f).setDeliveryTime(0.25f);

        // TODO: Set up Analytical Hierarchy Process
        // 1. It takes a goal, and distributors
        // 2. It takes each distributor's criteria and then multiply them by goal one another.
        // 3. Since multiplying by goal will result to a percentage of the distributor's criteria add them all up
        // 4. Set the Distributor's total score with the addition result
        // 5. Add a method to return the Distributor with the highest score.

        System.out.println("Hello");
    }
}