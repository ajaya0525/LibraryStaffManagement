package staffmanagement.model;

import java.util.Date;

public class Schedule {
    private int scheduleId;
    private int staffId;
    private Date date;
    private String shift;

    public Schedule(int scheduleId, int staffId, Date date, String shift) {
        this.scheduleId = scheduleId;
        this.staffId = staffId;
        this.date = date;
        this.shift = shift;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public int getStaffId() {
        return staffId;
    }

    public Date getDate() {
        return date;
    }

    public String getShift() {
        return shift;
    }

    @Override
    public String toString() {
        return "Schedule [scheduleId=" + scheduleId + ", staffId=" + staffId + ", date=" + date + ", shift=" + shift + "]";
    }
}