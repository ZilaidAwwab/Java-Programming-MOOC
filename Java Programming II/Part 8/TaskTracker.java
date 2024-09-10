import java.util.HashMap;
import java.util.ArrayList;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // check if the user already exist in the list, if not, then add
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        // let's first retrieve the list containing the exercises completed by the user and add to it
        ArrayList<Integer> completed = this.completedExercises.get(user);
        completed.add(exercise);

        // this could also be written as
        // this.completedExercises.get(user).add(exercise);
    }

    public void print() {
        for (String name: completedExercises.keySet()) {
            System.out.println(name + ": " +completedExercises.get(name));
        }
    }

    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        tracker.add("Ada", 3);
        tracker.add("Ada", 5);
        tracker.add("Ada", 7);
        tracker.add("Ada", 1);

        tracker.add("Pekka", 6);
        tracker.add("Pekka", 9);

        tracker.add("Matt", 3);
        tracker.add("Matt", 7);

        tracker.print();
    }
}
