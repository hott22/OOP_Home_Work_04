package home4;
import home4.model.Task;

import java.io.FileWriter;
import java.io.IOException;


public class File {
    public static String path = "data.csv";
    static Task task = new Task("run", 1,"low", "22", "wrer", "33");
    static Task task2 = new Task("run", 1,"low", "22", "wrer", "33");

    public static void saveTask(TaskList taskList){

        {try (FileWriter writer = new FileWriter(path, false)) {
                for (int i = 0; i < taskList.tasks.size(); i++) {
                    writer.append(task.getInfo());
                }
                writer.flush();
                writer.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
