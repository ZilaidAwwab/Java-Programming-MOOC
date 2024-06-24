public class StarSign {

    public static void main(String[] args) {
        
        printStars(3);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {

        // The outer for loop is for rows
        for (int i = 1; i <= size; i++) {

            // Inner for loop is for columns
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
