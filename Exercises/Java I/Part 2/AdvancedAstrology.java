public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
        // System.out.println("");
    }

    /* 
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {

            for (int k = 1; k <= size - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height + 2; i++) {
            
            int numOfCols = i <= height ? 2 * i - 1 : 3;
            int numOfSpaces = i <= height ? height - i : height - 2;

            for(int k = 1; k <= numOfSpaces; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= numOfCols; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    */

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }

    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;
        while (i <= height * 2 && j >= 0) {
            printSpaces(j);
            printStars(i);
            i = i + 2;
            j--;
            if (j == -1) {
                printSpaces(height - 2);
                System.out.println("***");
                printSpaces(height - 2);
                System.out.println("***");
            }
        }

    }

    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
