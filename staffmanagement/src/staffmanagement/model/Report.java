package staffmanagement.model;

import java.util.Date;

public class Report {
    private int reportId;
    private int staffId;
    private String content;
    private Date date;

    public Report(int reportId, int staffId, String content, Date date) {
        this.reportId = reportId;
        this.staffId = staffId;
        this.content = content;
        this.date = date;
    }

    public int getReportId() {
        return reportId;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Report [reportId=" + reportId + ", staffId=" + staffId + ", content=" + content + ", date=" + date + "]";
    }
}