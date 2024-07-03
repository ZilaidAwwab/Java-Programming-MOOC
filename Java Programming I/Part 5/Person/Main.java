// import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Person ada = new Person("Ada");
    Person antti = new Person("Antti", 24);

    System.out.println(ada);
    System.out.println(antti);

    ada.growOlder();
    System.out.println(ada);
    
    ada.growOlder(10);
    System.out.println(ada);
  }
}
