package home4;

import home4.View.ViewConsole;

import static home4.TaskFactory.addTask;
import static home4.TaskFactory.delTask;
import static home4.View.ViewConsole.returnChoice;

public class Controller {

    public static void ButtonClick(){
        ViewConsole view = new ViewConsole();
        boolean flag = true;
        while (flag) {
            view.printMenu();
            int choice = returnChoice();
            switch (choice) {
                case 1 -> view.printMenuViewingTasks();
                case 2 -> addTask();
                case 3 -> delTask();
                case 4 -> view.printMenuUpdate();
                case 5 -> flag = false;
            }

        }
    }
}
