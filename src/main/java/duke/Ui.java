package duke;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
    private Scanner sc;
    String horizontalLine = "____________________________________________________________";
    public Ui() {
        this.sc = new Scanner(System.in);
    }
    public void showWelcomeMessage() {
        String name = "duke.Tired";
        System.out.println(horizontalLine);
        System.out.println("Hello! I'm " + name);
        System.out.println("What can I do for you?");
        System.out.println(horizontalLine + "\n");
    }

    public void showError(String message) {
        System.out.println(message);
    }

    public void showGoodbyeMessage() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public String readCommand() {
        return sc.nextLine();
    }

    public void showTaskList(TaskList tasks) {
        System.out.println(tasks);
    }

    public void showMatchingTasks(ArrayList<Task> matchingTasks) {
        if (matchingTasks.isEmpty()) {
            System.out.println("No matching tasks found.");
        } else {
            System.out.println("Here are the matching tasks in your list:");
            for (int i = 0; i < matchingTasks.size(); i++) {
                System.out.println((i + 1) + "." + matchingTasks.get(i));
            }
        }
    }

    // Will use in future
    public void showAddedTask(Task task) {
        System.out.println(horizontalLine);
        System.out.println("Got it. I've added this task:");
        System.out.println(task);
        System.out.println(horizontalLine);
    }

    public void showMarkedAsDone(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(task);
    }

    public void showMarkedAsUndone(Task task) {
        System.out.println("OK, I've marked this task as not done yet:");
        System.out.println(task);
    }

    public void showRemovedTask(Task task) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(task);
    }
}