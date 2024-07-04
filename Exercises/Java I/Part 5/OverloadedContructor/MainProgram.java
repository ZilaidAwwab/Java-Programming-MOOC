public class MainProgram {

    public static void main(String[] args) {
        Counter count = new Counter(900);
        count.decrease(-55);
        System.out.println(count.getValue());
    }
}
