public class SplittingString {
  public static void main(String[] args) {
    String text = "first second third fourth";
    String[] pieces = text.split(" ");

    System.out.println(pieces[0]);
    System.out.println(pieces[1]);
    System.out.println(pieces[2]);
    System.out.println(pieces[3]);

    System.out.println();

    for (int i  = 0; i < pieces.length; i++) {
      System.out.println(pieces[i]);
    }
  }
}
