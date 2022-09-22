package home4.View;

import java.util.Scanner;

import static home4.TaskFactory.*;

public class ViewConsole implements View {

    static Scanner scanner;

    public ViewConsole(){
        scanner = new Scanner(System.in);
    }

    public void show(String value) {
        System.out.println(value);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public void printMenu()
    {
        System.out.println("""
                --------------
                1 - Viewing tasks
                2 - Add task
                3 - Delete task
                4 - Update task
                5 - Exit
                ---------------""");
    }

    public void printMenuViewingTasks(){
        System.out.println("""
                1 - View all tasks
                2 - View task by ID""");
        int choice = returnChoice();
        if(choice == 1) {
            printAllTasklist();
        }
        else{
            viewTaskByNumber();
        }
    }
    public void printMenuUpdate(){
        System.out.println("""
                1 - Update status
                2 - Update priority""");
        int choice = returnChoice();
        if(choice == 1) {
            updateStatus();
        }
        else{
            updatePriority();
        }
    }

    /**
     * Возвращает выбор пользователя
     * @return выбор
     */
    public static int returnChoice(){
        //viewTasklist();
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number: ");
        return scanner.nextInt();
    }
}
