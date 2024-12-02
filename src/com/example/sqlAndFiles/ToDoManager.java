package com.example.sqlAndFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoManager {

    // Method to save tasks to file
    public static void saveTasksToFile(String filePath, List<ToDo> tasks) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (ToDo task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        }
    }

    // Method to load tasks from file
    public static List<ToDo> loadTasksFromFile(String filePath) throws IOException {
        List<ToDo> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    ToDo task = new ToDo(Integer.parseInt(parts[0]), parts[1], Boolean.parseBoolean(parts[2]));
                    tasks.add(task);
                }
            }
        }
        return tasks;
    }

    // Method to mark a task as complete
    public static void markTaskAsComplete(int id, String filePath) throws IOException {
        List<ToDo> tasks = loadTasksFromFile(filePath);
        for (ToDo task : tasks) {
            if (task.getId() == id) {
                task.setComplete(true);
                break;
            }
        }
        saveTasksToFile(filePath, tasks);
    }

    // Method to display tasks
    public static void displayTasks(List<ToDo> tasks) {
        for (ToDo task : tasks) {
            System.out.println("ID: " + task.getId() + ", Task: " + task.getTask() + ", Complete: " + task.isComplete());
        }
    }

    public static void main(String[] args) {
        String filePath = "src/com/example/tasks.txt";
        List<ToDo> tasks = new ArrayList<>();

        // Creating sample tasks
        tasks.add(new ToDo(1, "Buy groceries", false));
        tasks.add(new ToDo(2, "Finish homework", false));
        tasks.add(new ToDo(3, "Call the bank", true));

        try {
            // Saving tasks to file
            saveTasksToFile(filePath, tasks);

            // Loading and displaying tasks
            List<ToDo> loadedTasks = loadTasksFromFile(filePath);
            displayTasks(loadedTasks);

            // Mark a task as complete and update file
            markTaskAsComplete(2, filePath);
            loadedTasks = loadTasksFromFile(filePath);
            System.out.println("After marking task 2 as complete:");
            displayTasks(loadedTasks);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

