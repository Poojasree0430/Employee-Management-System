import java.util.*;
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=======================================DREAM COMPANY============================================");
            System.out.println("\n------- Employee Management System--------");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 -> manager.addEmployee();
                case 2 -> manager.viewEmployees();
                case 3 -> manager.searchEmployee();
                case 4 -> manager.updateEmployee();
                case 5 -> manager.deleteEmployee();
                case 6 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
