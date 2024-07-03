package ObjectAsMethodParameter;

public class Main {
  public static void main(String[] args) {
    Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", 1, 1, 780);
    Person pascal = new Person("Blaise Pascal", 19, 6, 1623);
    
    if (muhammad.olderThan(pascal)) {  //  same as muhammad.olderThan(pascal)==true
      System.out.println(muhammad.getName() + " is older than " + pascal.getName());
    } else {
      System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
    }
  }
}
