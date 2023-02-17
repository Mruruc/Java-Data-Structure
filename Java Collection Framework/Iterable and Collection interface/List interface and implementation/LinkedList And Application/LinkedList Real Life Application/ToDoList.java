package Java_Collections;
/*
Implementing a To-Do List: You can use a linked list to represent a list of tasks that a user needs to complete.
 Each node in the linked list can represent a task, and the data part of the node can be the description of the task,
 the due date, and the status (e.g., pending, in progress, completed).
  The next pointer of each node can point to the next task in the list.
This way, you can easily add or remove tasks, mark tasks as completed, and perform other operations on the list.
*/

import java.time.LocalDate;
import java.util.LinkedList;

public class ToDoList {
    private LinkedList<Task> list;

    public ToDoList() {
        this.list = new LinkedList<>();
    }
    public void addTask(String description,LocalDate dueDate){
        list.add(new Task(description,dueDate));
    }
    public Task searchTask(String description){
        for(Task task: list){
            if(task.getDescription().equals(description)){
                return task;
            }
        }
        return null;
    }
    public void findTask(String description){
        Task task=searchTask(description);
        if(task!=null){
            System.out.println(task.getDescription() +"\n"+task.getDueDate()+"\n"+task.getStatus());
        }
        else{
            System.out.println("No such task !");
        }
    }

    public void listOfTask(){
        for(Task task: list){
            System.out.println(task.getDescription() +" "+task.dueDate +" "+ task.getStatus());
            System.out.println("========================================");
        }
    }

    public void markTaskAsCompleted(String description){
        Task task=searchTask(description);
        task.setStatus("Done");
    }

    public void removeTask(String description){

        Task task=searchTask(description);
        System.out.println(task.getDescription() +" is removed !");
        list.remove(searchTask(description));
    }

    class Task {
        private String description;
        private LocalDate dueDate;
        private String status;

        public Task(String description, LocalDate dueDate) {
            this.description = description;
            this.dueDate = dueDate;
            this.status = "pending";
        }

        public String getDescription() {
            return description;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
