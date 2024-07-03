public class PrimitiveAndReferenceVariables {
  public static void main(String[] args) {
    
    // a primitive variable's information is stored as the value of that variable, whereas a reference variable holds a reference to information related to that variable. reference variables are practically always objects in Java

    // This is a primitive variable that stores the value directly in the variable
    int value = 10;
    System.out.println(value); // 10


    // This is the reference variable that stores the reference to the variable that holds the variable value
    /*
    Here we are assuming that we have a class in a separate file
    public class Person {
      private String name;
      
      public Person(String name) {
        this.name = name
      }
    }
    
    Now we are creating an instance in the regular file

    Person<String> luke = new Person("Luke");
    
    // Here this luke point to the object and acts as a reference variable as we saw above in the definition
    System.out.println(luke); // Person@9894395

    // When we attempt to print the value of a reference variable, the output contains the type of the variable and an identifier created for it by Java: the string Person@9894395 tells us that the given variable is of type Person and its identifier is 9894395.

    // Now if we define the toString method, then the result will be different
    */
  }
}
