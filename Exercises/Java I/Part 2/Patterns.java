public class Patterns {
  public static void main(String[] args) {

    System.out.println("Stars");
    printStars(3);
    System.out.println("---");
    
    System.out.println("Square");
    printSquare(4);
    System.out.println("---");
    
    System.out.println("Rectangle");
    printRectangle(10, 7);
    System.out.println("---");
    
    System.out.println("Triangle");
    printTriangle(5);
    System.out.println("---");
    
    System.out.println("Reverse Triangle");
    printReverseTriangle(6);
    System.out.println("---");

    System.out.println("Counting");
    printCounting(5);
    System.out.println("---");

    System.out.println("Reverse Counting");
    printReverseCounting(7);
    System.out.println("---");
    
    System.out.println("Ordered Counting");
    printOrderedCounting(5);
    System.out.println("---");
    
    System.out.println("Decreasing Columns");
    printDecresingColumns(5);
    System.out.println("---");

    System.out.println("Spaced Triangle");
    printSpacedTriangle(5);
    System.out.println("---");

    System.out.println("Mirror Triangle");
    printMirrorTriangles(5);
    System.out.println("---");

    System.out.println("Christmas Tree");
    christmasTree(5);
    System.out.println("---");
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

  public static void printReverseTriangle(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = size; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void printCounting(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println("");
    }
  }
  
  public static void printReverseCounting(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = size; j >= i; j--) {
        System.out.print(j);
      }
      System.out.println("");
    }
  }

  public static void printOrderedCounting(int size) {
    for (int i = 1; i <= size; i++) {
      for (int j = i; j >= 1; j--) {
        // If we want continous numbers
        // System.out.print(i);

        // If we want increasing down the row and decresing down the column
        System.out.print(j);
      }
      System.out.println("");
    }
  }

  public static void printDecresingColumns(int size) {
    for (int i = 1; i < 2 * size; i++) {
      for (int j = 1; j <= (i > size ? 2 * size - i : i); j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void printSpacedTriangle(int size) {
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
  
  public static void printMirrorTriangles(int size) {
    for (int i = 1; i < 2 * size; i++) {

      int numOfCols = i > size ? 2 * size - i : i;

      for(int k = 1; k <= size - numOfCols; k++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= numOfCols; j++) {
        System.out.print("*");
      }
      System.out.println("");
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
}
