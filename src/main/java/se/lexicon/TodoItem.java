package se.lexicon;

import java.time.LocalDate;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private boolean done;
    private Person cretaor;
    private boolean overdue;


    public TodoItem(int id, String title, String taskDescription, LocalDate deadline, boolean done, Person cretaor, boolean overdue) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.done = done;
        this.cretaor = cretaor;
        this.overdue = overdue;
    }

}

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCretaor() {
        return cretaor;
    }

    public void setCretaor(Person cretaor) {
        this.cretaor = cretaor;
    }

    public boolean isOverdue(){
        return overdue();
    }

    private boolean overdue() {
    }

    public void setOverdue(boolean overdue){
        this.overdue = overdue;

    }

    public boolean getSummary() {

        return overdue();

        }
    }


}
