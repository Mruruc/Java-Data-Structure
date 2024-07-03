package Java_Collections;

import java.time.LocalDate;

public class ToDoListImplementation {
    public static void main(String[] args) {
        ToDoList toDoList=new ToDoList();
        toDoList.addTask("Finish homework", LocalDate.of(2023, 2, 28));
        toDoList.addTask("Buy groceries", LocalDate.of(2023, 2, 15));
        toDoList.addTask("Schedule dentist appointment", LocalDate.of(2023, 2, 16));

        toDoList.listOfTask();
        toDoList.markTaskAsCompleted("Finish homework");
        toDoList.findTask("Finish homework");
        toDoList.removeTask("Finish homework");
        toDoList.listOfTask();

    }
}
