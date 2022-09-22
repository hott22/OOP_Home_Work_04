package home4;

import home4.model.Task;

import java.util.Scanner;

import static home4.View.ViewConsole.returnChoice;


public class TaskFactory {
    private static int id;
    private static TaskList taskList;
    private static String priority;
    static {
        TaskFactory.id = 0;
        TaskFactory.taskList = new TaskList();
        TaskFactory.priority = "";
    }

    /**
     * Добавляет задачу
     */
    public static void addTask(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Enter priority: ");
        System.out.println("1 - low priority");
        System.out.println("2 - medium priority");
        System.out.println("3 - high priority");
        int choicePriority = scanner.nextInt();
        if(choicePriority == 1){
            priority = "low";
        }
        if (choicePriority == 2){
            priority = "medium";
        }
        if (choicePriority == 3){
            priority = "high";
        }
        System.out.println("Enter date: ");
        String date = scanner.nextLine();  // ?????????????? почему не видит ??
        String date1 = scanner.nextLine();

        System.out.println("Enter owner: ");
        String owner = scanner.nextLine();
        System.out.println("Enter deadline: ");
        String deadline = scanner.nextLine();
        Task nameTask = new Task(name, TaskFactory.id, priority, date1, owner, deadline);
        TaskFactory.id++;
        TaskFactory.taskList.add(nameTask);
        //getTasks()
        //printAllTasklist();
    }

    /**
     * Показывает имена списка дел и его номер в списке
     */
    public static void viewTasklist(){
        System.out.println("Task list: ");
        for (Task task :
                TaskFactory.taskList.tasks) {
            System.out.print(task.getName() + " : " + (TaskFactory.taskList.tasks.indexOf(task) + 1));
            System.out.println();
        }
    }

    /**
     * Показывает информацию по всем делам списка
     */
    public static void printAllTasklist(){
        if (!TaskFactory.taskList.tasks.isEmpty()) {
            System.out.println("Task list: ");
            for (Task task :
                    TaskFactory.taskList.tasks) {
                System.out.println(task.getInfo());
            }
        }
        else {
            System.out.println("List is empty");
        }
    }

    /**
     * Удаляет задачу
     */
    public static void delTask(){
        viewTasklist();
        int choice = returnChoice();
        TaskFactory.taskList.tasks.remove(choice - 1);
        //printAllTasklist();
    }


    /**
     * Изменение статуса
     */
    public static void updateStatus(){
        System.out.println("Enter number of task you want to update: ");
        viewTasklist();
        int choice = returnChoice();
        TaskFactory.taskList.tasks.get(choice - 1).setStatus(!TaskFactory.taskList.tasks.get(choice - 1).getStatus());
        //printAllTasklist();
    }

    /**
     * Изменение приоритета
     */
    public static void updatePriority(){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task you want to update: ");
        viewTasklist();
        int choice = returnChoice();
        System.out.println("Enter priority: ");
        System.out.println("1 - low priority");
        System.out.println("2 - medium priority");
        System.out.println("3 - high priority");
        int choicePriority = returnChoice();
        if(choicePriority == 1){
            priority = "low";
        }
        if (choicePriority == 2){
            priority = "medium";
        }
        if (choicePriority == 3){
            priority = "high";
        }
        TaskFactory.taskList.tasks.get(choice - 1).setPriority(priority);
        //printAllTasklist();
    }

    /**
     * Показывает информацию о задаче по ID
     */
    public static void viewTaskByNumber(){
        viewTasklist();
        int choice  = returnChoice();
        System.out.println(TaskFactory.taskList.tasks.get(choice - 1).getInfo());
    }
}
