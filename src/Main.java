import AHP.Goal;
import AHP.Subject;
import AHP.Analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Subject> subjects = new ArrayList<>();
        Goal goal = new Goal();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            // TODO: add name and NPM
            System.out.println("Kelompok 5");
            System.out.println("Rio Arswendo Rachmad 202143500473");
            System.out.println("Juliani Ester Assa 202143500473");
            System.out.println("Welcome to Analytical Hierarchy Process Machine");
            System.out.println("1. Add Distributor");
            System.out.println("2. Add Goal");
            System.out.println("3. Decide");
            System.out.print("What do you want to do: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter Distributor Name: ");
                        String distributorName = scanner.nextLine();
                        System.out.print("Enter Price Rating: ");
                        Float priceRating = Float.parseFloat(scanner.nextLine());
                        System.out.print("Enter Quality Rating: ");
                        Float qualityRating = Float.parseFloat(scanner.nextLine());
                        System.out.print("Enter Service Rating: ");
                        Float serviceRating = Float.parseFloat(scanner.nextLine());
                        System.out.print("Enter Delivery Time Rating: ");
                        Float deliveryTimeRating = Float.parseFloat(scanner.nextLine());

                        Subject newSubject = new Subject(distributorName);
                        newSubject.setPrice(priceRating).setQuality(qualityRating).setService(serviceRating)
                                .setDeliveryTime(deliveryTimeRating);
                        subjects.add(newSubject);
                        break;
                    case 2:
                        System.out.print("Enter Goal Price Weight Percentage in decimal: ");
                        goal.setPrice(Float.parseFloat(scanner.nextLine()));
                        System.out.print("Enter Goal Quality Weight Percentage in decimal: ");
                        goal.setQuality(Float.parseFloat(scanner.nextLine()));
                        System.out.print("Enter Goal Service Weight Percentage in decimal: ");
                        goal.setService(Float.parseFloat(scanner.nextLine()));
                        System.out.print("Enter Goal Delivery Time Weight Percentage in decimal: ");
                        goal.setDeliveryTime(Float.parseFloat(scanner.nextLine()));
                        break;
                    case 3:
                        if (subjects.isEmpty()) {
                            System.out.println("Please add subjects before deciding");
                            break;
                        }
                        Analyzer analyzer = new Analyzer(subjects, goal);
                        analyzer.ahp();

                        Subject bestDistributor = analyzer.bestChoice();
                        System.out.println("Best Distributor is: " + bestDistributor.getSubjectName());
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } catch (NumberFormatException err) {
                System.out.println("Invalid Choice");
            }
            System.out.println();
        }
    }
}