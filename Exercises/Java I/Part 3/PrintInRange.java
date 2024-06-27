import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(2);
        number.add(6);
        number.add(-1);
        number.add(5);
        number.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(number, 0, 5);
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(number, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
