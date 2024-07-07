import java.util.ArrayList;

public class Stack {
  private ArrayList<String> list;

  public Stack() {
    this.list = new ArrayList<>();
  }

  public boolean isEmpty() {
     if (this.list.size() == 0) {
      return true;
     }
     return false;
  }

  public void add(String value) {
    this.list.add(value);
  }

  public ArrayList<String> values() {
    return this.list;
  }

  public String take() {
    return this.list.remove(this.list.size() - 1);
  }
}
