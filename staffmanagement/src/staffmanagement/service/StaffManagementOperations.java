package staffmanagement.service;

public interface StaffManagementOperations {
    void registerStaff(String id, String firstName, String lastName);
    void assignRole(String id, String role);
    void requestLeave(String id, int days);
}