import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        removeLast(list);
        removeLast(list);

        System.out.println(list);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }

        int last = strings.size() - 1;
        strings.remove(last);
    }
}
