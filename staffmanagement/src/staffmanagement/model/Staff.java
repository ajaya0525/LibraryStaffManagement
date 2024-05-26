
package staffmanagement.model;

public class Staff {
    private int staffId;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;
    private String role;

    public Staff(int staffId, String firstName, String lastName, String contactNumber, String email, String role) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.role = role;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff [staffId=" + staffId + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber + ", email=" + email + ", role=" + role + "]";
    }
}



