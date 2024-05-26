package staffmanagement.model;

import java.util.Date;

public class TrainingSession {
    private int sessionId;
    private int staffId;
    private String topic;
    private Date date;
    private int duration; // Duration in hours

    public TrainingSession(int sessionId, int staffId, String topic, Date date, int duration) {
        this.sessionId = sessionId;
        this.staffId = staffId;
        this.topic = topic;
        this.date = date;
        this.duration = duration;
    }

    public int getSessionId() {
        return sessionId;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getTopic() {
        return topic;
    }

    public Date getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TrainingSession [sessionId=" + sessionId + ", staffId=" + staffId + ", topic=" + topic + ", date=" + date + ", duration=" + duration + "]";
    }
}