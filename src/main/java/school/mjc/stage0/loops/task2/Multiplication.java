package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int multiplication;

        if(multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                multiplication = counter * multiplyByAndToInclusive;
                System.out.println(multiplication);
                counter++;
            }
        }
        if(multiplyByAndToInclusive < 0) {
            while (counter <= multiplyByAndToInclusive * (-1)) {
                multiplication = counter * multiplyByAndToInclusive;
                System.out.println(multiplication);
                counter++;
            }
        }
    }
}
