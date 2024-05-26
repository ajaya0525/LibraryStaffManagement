package staffmanagement.model;

import java.util.Date;

public class PerformanceEvaluation {
    private int evaluationId;
    private int staffId;
    private int evaluatorId;
    private Date date;
    private float performanceScore;

    public PerformanceEvaluation(int evaluationId, int staffId, int evaluatorId, Date date, float performanceScore) {
        this.evaluationId = evaluationId;
        this.staffId = staffId;
        this.evaluatorId = evaluatorId;
        this.date = date;
        this.performanceScore = performanceScore;
    }

    public int getEvaluationId() {
        return evaluationId;
    }

    public int getStaffId() {
        return staffId;
    }

    public int getEvaluatorId() {
        return evaluatorId;
    }

    public Date getDate() {
        return date;
    }

    public float getPerformanceScore() {
        return performanceScore;
    }

    @Override
    public String toString() {
        return "PerformanceEvaluation [evaluationId=" + evaluationId + ", staffId=" + staffId + ", evaluatorId=" + evaluatorId + ", date=" + date + ", performanceScore=" + performanceScore + "]";
    }
}