package com.example.sqlAndFiles;

import java.io.Serializable;
/**
 * The ToDo class represents a single task in a to-do list.
 * It implements Serializable to allow tasks to be saved to and read from a file.
 */
public class ToDo implements Serializable {
// properties of this class
    int id;
    String task;
    boolean isComplete;

// constructor for this class
    public ToDo(int id, String task, boolean isComplete) {
        this.id = id;
        this.task = task;
        this.isComplete = isComplete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
