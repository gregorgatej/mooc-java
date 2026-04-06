import java.lang.reflect.Array;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<String>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index > tasks.size() - 1) {
            System.out.println("Nothing exists at specified index.");
            return;
        }

        tasks.remove(index);
    }
}