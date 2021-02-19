package com.ualr.simpletasklist.model;

import java.util.HashMap;
import java.util.Map;
import com.ualr.simpletasklist.model.Task;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.
    private HashMap<Integer, Task> taskHashMap;

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // TODO 04. Define the class constructor and the corresponding getters and setters.
    public TaskList() {
        this.taskHashMap = new HashMap <String, Task>();
    }

    public HashMap<Integer, Task> getTaskHashMap() {
        return taskHashMap;
    }

    public void setTaskHashMap(HashMap<Integer, Task> taskHashMap) {
        this.taskHashMap = taskHashMap;
    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    public void add(String description){
        this.TaskList.put(new Task(description, "Incomplete"));
    }

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line
    public String toString(){
        String temp = "";
        for (int i = 0; i < this.getTaskHashMap().size() - 1; i++){
            temp = temp + i + "-" + this.getTaskHashMap().get(i).getDescription();
            if (this.getTaskHashMap().get(i).getCompleted().toLowerCase().equals("done")){
                temp += " Done";
            }
            temp += "\r\n";
        }
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void delete(String id){
        this.getTaskHashMap().get(id).setDescription("");
        this.getTaskHashMap().get(id).setCompleted("");
        this.getTaskHashMap().remove(id);
    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(String id){
        this.getTaskHashMap().get(id).setCompleted("done");
    }

}
