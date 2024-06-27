public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        while (index < array.length) {
            printStars(array[index]);            
            index++;
            System.out.println("");
        }
    }

    public static void printStars(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
    }
}
