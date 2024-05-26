package staffmanagement.model;

public abstract class AbstractStaffMember {
    protected String id;
    protected String firstName;
    protected String lastName;

    public AbstractStaffMember(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void performDuties();
}