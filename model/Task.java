package home4.model;

public class Task {
    private String name;
    private int id;
    private String priority;
    private String date;
    private String owner;
    private String deadline;
    private boolean status;


    public Task(String name, int id, String priority, String date, String owner, String deadline){
        this.name = name;
        this.id = id;
        this.priority = priority;
        this.date = date;
        this.owner = owner;
        this.deadline = deadline;
        this.status = true;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(boolean status) {this.status = status; }

    public boolean getStatus(){
        return status;
    }
    public String getInfo(){
        return String.format("name : %s, id : %d, priority : %s, date : %s, owner : %s, " +
                "deadline : %s, status : %b", name, id, priority, date, owner, deadline, status);
    }

    public String getName() {
        return name;
    }
}
