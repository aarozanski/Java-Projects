package com.example.sqlAndFiles;
import java.io.Serializable;

/**
 * The ToDo class represents a single task in a to-do list.
 * It implements Serializable to allow tasks to be saved to and read from a file.
 */
public class ToDo implements Serializable {
    // Properties of the ToDo class
    private int id;          // Unique identifier for each task
    private String task;     // Description of the task
    private boolean isComplete; // Flag indicating whether the task is completed

    /**
     * Constructor for the ToDo class.
     * Initializes a new instance of a ToDo object with specified id, task description, and completion status.
     *
     * @param id         Unique identifier for the task.
     * @param task       Description of the task.
     * @param isComplete Initial completion status of the task.
     */
    public ToDo(int id, String task, boolean isComplete) {
        this.id = id;            // Set the task ID
        this.task = task;        // Set the task description
        this.isComplete = isComplete; // Set the task completion status
    }

    /**
     * Returns the ID of the task.
     *
     * @return int representing the task's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the task.
     *
     * @param id the new ID for this task.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the description of the task.
     *
     * @return String representing the task's description.
     */
    public String getTask() {
        return task;
    }

    /**
     * Sets the description of the task.
     *
     * @param task the new description of the task.
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Returns the completion status of the task.
     *
     * @return boolean representing whether the task is completed.
     */
    public boolean isComplete() {
        return isComplete;
    }

    /**
     * Sets the completion status of the task.
     *
     * @param complete the new completion status of the task.
     */
    public void setComplete(boolean complete) {
        this.isComplete = complete;
    }

    /**
     * Provides a string representation of the task in a format suitable for file storage.
     * Formats the task data as a comma-separated string.
     *
     * @return String representing the task data formatted as "id,task,isComplete".
     */
    @Override
    public String toString() {
        return id + "," + task + "," + isComplete;
    }
}
