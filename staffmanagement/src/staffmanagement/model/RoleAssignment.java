package staffmanagement.model;

import java.util.Date;

public class RoleAssignment {
    private int assignmentId;
    private int staffId;
    private String role;
    private Date startDate;
    private Date endDate;

    public RoleAssignment(int assignmentId, int staffId, String role, Date startDate, Date endDate) {
        this.assignmentId = assignmentId;
        this.staffId = staffId;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getRole() {
        return role;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "RoleAssignment [assignmentId=" + assignmentId + ", staffId=" + staffId + ", role=" + role + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }
}