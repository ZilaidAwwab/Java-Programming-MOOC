import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Member implements Comparable<Member> {
    private String name;
    private int height;
    
    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }
    
    @Override
    public int compareTo(Member member) {
        if(this.height == member.getHeight()) return 0;
        else if (this.height > member.getHeight()) return -1;
        else return 1;
    }

    /* This compareTo can be implemented as this as well

    @Override
    public int compareTo(Member member) {
        return this.height - member.getHeight();
    }
    
    */

    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikeal", 182));
        member.add(new Member("matti", 187));
        member.add(new Member("ada", 184));

        member.stream().forEach(m -> System.out.println(m));
        System.out.println();

        // sorting the stream that is to be printed using the sorted method
        member.stream().sorted().forEach(m -> System.out.println(m));

        /* In this stream sort only the elements came out of the stream sorted and are not sorted forever as in the below statement we can see that the members are again printed unsorted */

        member.stream().forEach(m -> System.out.println(m));

        // sorting the list with the sort method of the collections class
        Collections.sort(member);
        /* While here the members are sorted permanenetly */
        member.stream().forEach(m -> System.out.println(m));
    }
}
