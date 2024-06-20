public class TypesPersistance {
  public static void main(String[] args) {
    /*	Types are constant, meaning that a variable defined on a variable type can be reassigned a different value of same variable type and not a different one. */
    
    boolean truthValue = true;
    // truthValue = 42; (Won't work)

    int value = 10;
    // truthValue = value; (Won't work)


    /* Although exceptions exist in case of assigning a double type value to an int type variable. */

    double floatingPoint = 0.42;
    floatingPoint = 1; // Works

    int num = 12;
    floatingPoint = num; // Works


    /* A floating-point value cannot be assigned to an integer variable. */

    // int value = 4.2; (Don't work)

    double floating = 0.75;
    // value = floating; (Don't work)
  }
}
