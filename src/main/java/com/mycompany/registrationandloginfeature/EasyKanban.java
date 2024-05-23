/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginfeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class EasyKanban {
    private int taskNumber; 

    public EasyKanban() {
        this.taskNumber = 0; 
    }

    public void main() {
        boolean exit = false;
        List<Map<String, String>> tasks = new ArrayList<>();

        while (!exit) {
            String menu = "Choose an option:\n1) Add tasks\n2) Show report\n3) Quit";
            String choice = JOptionPane.showInputDialog(menu);

            switch (choice) {
                case "1":
                    addTasks(tasks);
                    break;
                case "2":
                    showReport();
                    break;
                case "3":
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please select a valid option.");
            }
        }
    }

    private void addTasks(List<Map<String, String>> tasks) {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks would you like to enter?"));

        for (int i = 0; i < numTasks; i++) {
            Map<String, String> task = new HashMap<>();
          
            String taskName = JOptionPane.showInputDialog("Enter task name:");
            task.put("Task Name", taskName);
            
            task.put("Task Number", String.valueOf(taskNumber));
            
            String taskDescription;
            do {
                taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
                if (taskDescription.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
                }
            } while (taskDescription.length() > 50);
            task.put("Task Description", taskDescription);
            JOptionPane.showMessageDialog(null, "Task successfully captured");


            String developerFirstName = JOptionPane.showInputDialog("Enter developer's first name:");
            String developerLastName = JOptionPane.showInputDialog("Enter developer's last name:");
            String developerFullName = developerFirstName + " " + developerLastName;
            task.put("Developer Details", developerFullName);


            String taskDuration = JOptionPane.showInputDialog("Enter task duration in hours:");
            task.put("Task Duration", taskDuration);


            String taskID = generateTaskID(taskName, taskNumber, developerLastName);
            task.put("Task ID", taskID);


            JOptionPane.showMessageDialog(null, "Task ID: " + taskID);


            String[] statuses = {"To Do", "Done", "Doing"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Choose task status:", "Task Status",
                                JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);
            task.put("Task Status", taskStatus);

            tasks.add(task);
            taskNumber++; 
        }
    }

    private String generateTaskID(String taskName, int taskNumber, String developerLastName) {
        String taskNamePart = taskName.length() >= 2 ? taskName.substring(0, 2) : taskName;
        String taskNumberPart = String.valueOf(taskNumber);
        String developerLastNamePart = developerLastName.length() >= 3 ? developerLastName.substring(developerLastName.length() - 3) : developerLastName;
        return (taskNamePart + ":" + taskNumberPart + ":" + developerLastNamePart).toUpperCase();
    }

    private void showReport() {
        JOptionPane.showMessageDialog(null, "Coming Soon");
    }

    public void mains() {
        EasyKanban taskManager = new EasyKanban();
        taskManager.main();
    }
}