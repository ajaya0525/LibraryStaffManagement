package staffmanagement;

import staffmanagement.model.*;
import staffmanagement.service.StaffService;
import java.util.Scanner;
import java.util.Date;

public class StaffManagementSystem {
    private StaffService staffService = new StaffService();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        // Register staff
        System.out.println("Enter staff details:");
        System.out.print("Staff ID: ");
        int staffId = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Role: ");
        String role = scanner.nextLine();

        Staff staff = new Staff(staffId, firstName, lastName, contactNumber, email, role);
        staffService.registerStaff(staff);

        // Assign roles
        System.out.println("\nEnter role assignment details:");
        System.out.print("Assignment ID: ");
        int assignmentId = scanner.nextInt();
        System.out.print("Staff ID: ");
        int staffIdForAssignment = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Role: ");
        String assignedRole = scanner.nextLine();
        System.out.print("Start Date (YYYY-MM-DD): ");
        String startDateStr = scanner.nextLine();
        Date startDate = parseDate(startDateStr); // Implement parseDate method to convert string to Date

        RoleAssignment assignment = new RoleAssignment(assignmentId, staffIdForAssignment, assignedRole, startDate, null);
        staffService.assignRole(assignment);

        // Other functionalities (Leave request, schedule shift, etc.) can be similarly implemented

        // Close scanner
        scanner.close();
    }

    // Helper method to parse date string to Date object (implement this)
    private Date parseDate(String dateStr) {
        // Implement date parsing logic here (e.g., using SimpleDateFormat)
        return new Date(); // Dummy implementation, replace with actual logic
    }

    public static void main(String[] args) {
        StaffManagementSystem system = new StaffManagementSystem();
        system.run();
    }
}