package RefTypeVariableAsMethodParam;

public class RefTypeVariableAsMethodParam {
  public static void main(String[] args) {
    Person first = new Person("first");
    System.out.println(first); // 1970
    youthern(first); // 1971

    Person second = first;
    youthern(second);

    System.out.println(first); // 1971
    // Here 1971 is printed becasue this is a reference variable and once the value changes, then it remain the same for the rest of program that's why we say that the primitive variables are immutable (as they provide the copy of them in the method param, while reference are mutable as they provide the reference variables and once they are changes, they're changed)
  }

  // This method is taking a reference type variable as a param
  public static void youthern(Person person) {
    person.setBirthYear(person.getBirthYear() + 1);
  }
}
