import java.util.ArrayList;

public class TodoList {
  private ArrayList<String> todoList;


  public TodoList() {
    this.todoList = new ArrayList<>();
  }


  public void add(String task) {
    this.todoList.add(task);
  }


  public void print() {
    for (String list: todoList) {
      System.out.println(todoList.indexOf(list) + 1 + ": " + list);
    }
  }


  public void remove(int number) {
    todoList.remove(number - 1);
  }
}
