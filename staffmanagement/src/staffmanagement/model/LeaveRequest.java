package staffmanagement.model;

import java.util.Date;

public class LeaveRequest {
    private int requestId;
    private int staffId;
    private Date startDate;
    private Date endDate;
    private String status;

    public LeaveRequest(int requestId, int staffId, Date startDate, Date endDate, String status) {
        this.requestId = requestId;
        this.staffId = staffId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getRequestId() {
        return requestId;
    }

    public int getStaffId() {
        return staffId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "LeaveRequest [requestId=" + requestId + ", staffId=" + staffId + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + "]";
    }
}