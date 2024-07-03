package AssignObjectInstanceToAnotherObject;

public class AssignObjectInstanceToAnotherObject {
  public static void main(String[] args) {
    Man joan = new Man("Joan Ball");
    System.out.println(joan); // 0 years
    
    Man ball = joan;
    ball.growOlder();
    ball.growOlder();
    
    System.out.println(joan); // 2 years
    // here it is 2 because the object was passed as a reference to an other object that's why when values were changed in the referenced objects, they are refelcting here as well

    // Now if we create new object with the same variable name then we can see the results
    joan = new Man("Joan B.");
    System.out.println(joan); // 0 years

    // We can also set the object variable to null (then it points to nothing)
    ball = null;
    System.out.println(ball); // null

    // Now if we call an object variable to the object that is null we get the NullPointerException
    // ball.growOlder(); This now returns the NullPointerException
  }
}
