import java.time.LocalDate;

public class DateInJava {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    int year = now.getYear();
    int month = now.getMonthValue();
    int day = now.getDayOfMonth();

    System.out.println("Today is " + day + "." + month + "." + year);
  }
}
