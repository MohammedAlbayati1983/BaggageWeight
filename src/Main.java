import java.util.Scanner;
/*
برنامج يختار فئة تذكرة المسافر درجة اولى ام ثانية ام ثالثة ثم يحسب الوزن للامتعة ويخرج المبلغ الواجب دفعه اذا كان هناك وزن زائد
A program that chooses the traveler's ticket class:
first, second, or third class, then calculates the weight of the luggage and
outputs the amount to be paid if there is excess weight.
* */
public class Main {
    public static void main(String[] args) {

        double result;
        while (true) {
            System.out.println("Enter the traveler category..First Class(f),Business(b) or Economy(e)");
            Scanner scanner = new Scanner(System.in);
            char categoryType = scanner.next().charAt(0);
            System.out.println("Enter the baggage weight");
            double weight = scanner.nextDouble();
            boolean isFirst = false;
            boolean isBusiness = false;
            boolean isEconomy = false;
            switch (categoryType) {
                case 'F':
                case 'f':
                    isFirst = true;
                    break;
                case 'B':
                case 'b':
                    isBusiness = true;
                    break;
                case 'E':
                case 'e':
                    isEconomy = true;
                    break;
            }
            if (isFirst && weight > 30.0) {
                result = (weight - 30.0) * 10;
                System.out.println("You are overweight and have to pay an amount " + result + " $");
            } else if (isBusiness && weight > 25.0) {
                result = (weight - 25.0) * 10;
                System.out.println("You are overweight and have to pay an amount " + result + " $");
            } else if (isEconomy && weight > 20.0) {
                result = (weight - 20.0) * 10;
                System.out.println("You are overweight and have to pay an amount " + result + " $");
            } else {
                System.out.println("Pass,every thing is OK");
            }
        }
    }
}