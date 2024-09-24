import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positiveNums = numbers.stream().filter(s -> s > 0).collect(Collectors.toCollection(ArrayList::new));
        return positiveNums;
    }
}
