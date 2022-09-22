package home4;

import home4.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> tasks;
    public TaskList(){

        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void add(Task o) {

        tasks.add(o);
    }
}
