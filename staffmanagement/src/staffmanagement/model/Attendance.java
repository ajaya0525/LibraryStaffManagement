package staffmanagement.model;

import java.util.Date;

public class Attendance {
    private int attendanceId;
    private int staffId;
    private Date date;
    private String status;

    public Attendance(int attendanceId, int staffId, Date date, String status) {
        this.attendanceId = attendanceId;
        this.staffId = staffId;
        this.date = date;
        this.status = status;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public int getStaffId() {
        return staffId;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Attendance [attendanceId=" + attendanceId + ", staffId=" + staffId + ", date=" + date + ", status=" + status + "]";
    }
}