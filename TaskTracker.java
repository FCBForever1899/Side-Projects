    import java.util.*;
    import java.io.*;

    public class TaskTracker {

        public static void main (String [] args) {
            int MAX_TASKS = 50;
            String [] tasks = new String [MAX_TASKS];
            boolean [] completed = new boolean [MAX_TASKS];
            Scanner scanner = new Scanner(System.in);

            boolean isRunning = true;

            while (isRunning){
                System.out.println("========= TASK TRACER =========");
                System.out.println("1. Add task");
                System.out.println("2. View taks");
                System.out.println("3. Mark task complete");
                System.out.println("4. Delete task");
                System.out.println("5. Exit");
                System.out.println("Choose an option number: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1){
                    boolean added = false;
                    for (int i = 0; i < MAX_TASKS; i++){
                        if(tasks[i] == null){
                            System.out.println("Enter task description: ");
                            tasks[i] = scanner.nextLine();
                            completed[i] = false;
                            System.out.println("Task added!");
                            added = true;
                            break;
                        }
                    }
                    if (!added) System.out.println("Task list full!");
                    
                } else if (choice == 2){
                    System.out.println("Your tasks: ");
                    for (int i = 0; i < MAX_TASKS; i++){
                        if (tasks[i] != null){
                            String status = completed[i] ? "[x]" : "[ ]";
                            System.out.println((i+1) + ". " + status + " " + tasks[i]);
                        }
                    }
                    //break;
                } else if (choice == 3){
                    System.out.println("Enter task number to mark complete: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    if (mark >= 1 && mark <= MAX_TASKS && tasks[mark-1] != null){
                        if (completed[mark - 1]) {
                        System.out.println("Task is already marked complete.");
                    } else {
                        completed[mark - 1] = true;
                        System.out.println("Task marked complete!");
                    }
                    } else {
                        System.out.println("Invalid task option.");
                    }
                } else if (choice == 4){
                    System.out.println("Enter a task number to delete: ");
                    int delete = scanner.nextInt();
                    scanner.nextLine();
                    if (delete >= 1 && delete <= MAX_TASKS && tasks[delete - 1] != null){
                        tasks[delete-1] = null;
                        completed[delete - 1] = false;
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Invalid task number");
                    }
                    //break;
                } else if (choice == 5){
                    isRunning = false;
                    //break;
                } else {
                    System.out.println("Invalid option.");
                }
            }

            System.out.println("Hava a nice day! :)");
            scanner.close();
        }
        

    }
