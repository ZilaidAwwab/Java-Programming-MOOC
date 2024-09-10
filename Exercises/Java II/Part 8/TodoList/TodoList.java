import java.util.ArrayList;

public class TodoList {
  private ArrayList<String> list;

  public TodoList() {
    this.list = new ArrayList<>();
  }

  public void add(String task) {
    this.list.add(task);
  }

  public void remove(int taskNumber) {
    this.list.remove(taskNumber - 1);
  } 

  public void print() {
    for (String item: list) {
      System.out.println(list.indexOf(item) + 1 + ": " + item);
    }
  }
}
