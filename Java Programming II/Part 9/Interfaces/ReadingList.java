import java.util.ArrayList;

public class ReadingList implements Readable {
    private ArrayList<Readable> readables;

    public ReadingList() {
        this.readables = new ArrayList<>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public String read() {
        String read = "";
        for (Readable readable: this.readables) {
            read += readable.read() + "\n";
        }

        // once the list has been read, we empty it
        this.readables.clear();
        return read;
    }
    
    public int toRead() {
        return this.readables.size();
    }

    public static void main(String[] args) {
        ReadingList joinList = new ReadingList();
        joinList.add(new TextMessage("arto", "have you written the tests yet?"));
        joinList.add(new TextMessage("arto", "have you checked the submissions yet?"));

        System.out.println("Joni's to-read " + joinList.toRead()); // 2
    }
}
