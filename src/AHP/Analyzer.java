package AHP;

import java.util.List;

public class Analyzer {
    List<Subject> subjects;
    Goal goal;

    public Analyzer(List<Subject> subjects, Goal goal) {
        this.subjects = subjects;
        this.goal = goal;
    }

    public Analyzer ahp() {
        subjects.forEach(subject -> {
            Float priceResult = (subject.getPrice() * goal.getPrice()) / 100;
            Float qualityResult = (subject.getQuality() * goal.getQuality()) / 100;
            Float serviceResult = (subject.getService() * goal.getService()) / 100;
            Float deliveryTimeResult = (subject.getDeliveryTime() * goal.getDeliveryTime()) / 100;

            Float totalScore = priceResult + qualityResult + serviceResult + deliveryTimeResult;
            subject.setTotalScore(totalScore);
        });

        return this;
    }

    public Subject bestChoice() {
        Subject bestSubject = new Subject("zero");

        int firstPointer = 0;
        int secondPointer = subjects.size() - 1;
        do {
            if (subjects.get(firstPointer).getTotalScore() > bestSubject.getTotalScore()) {
                bestSubject = subjects.get(firstPointer);
            }
            if (subjects.get(secondPointer).getTotalScore() > bestSubject.getTotalScore()) {
                bestSubject = subjects.get(secondPointer);
            }

            firstPointer++;
            secondPointer--;
        } while(firstPointer <= secondPointer);

        return bestSubject;
    }
}
