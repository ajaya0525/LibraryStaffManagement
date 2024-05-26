package staffmanagement.service;

import staffmanagement.model.*;

import java.util.ArrayList;
import java.util.List;

public class StaffService {
    private List<Staff> staffList = new ArrayList<>();
    private List<RoleAssignment> roleAssignments = new ArrayList<>();
    private List<LeaveRequest> leaveRequests = new ArrayList<>();
    private List<Schedule> schedules = new ArrayList<>();
    private List<PerformanceEvaluation> evaluations = new ArrayList<>();
    private List<TrainingSession> trainingSessions = new ArrayList<>();
    private List<Communication> communications = new ArrayList<>();
    private List<Attendance> attendances = new ArrayList<>();
    private List<Report> reports = new ArrayList<>();

    public void registerStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Staff registered: " + staff);
    }

    public void assignRole(RoleAssignment roleAssignment) {
        roleAssignments.add(roleAssignment);
        System.out.println("Role assigned: " + roleAssignment);
    }

    public void requestLeave(LeaveRequest leaveRequest) {
        leaveRequests.add(leaveRequest);
        System.out.println("Leave requested: " + leaveRequest);
    }

    public void scheduleShift(Schedule schedule) {
        schedules.add(schedule);
        System.out.println("Shift scheduled: " + schedule);
    }

    public void evaluatePerformance(PerformanceEvaluation evaluation) {
        evaluations.add(evaluation);
        System.out.println("Performance evaluated: " + evaluation);
    }

    public void addTrainingSession(TrainingSession session) {
        trainingSessions.add(session);
        System.out.println("Training session added: " + session);
    }

    public void sendCommunication(Communication communication) {
        communications.add(communication);
        System.out.println("Communication sent: " + communication);
    }

    public void recordAttendance(Attendance attendance) {
        attendances.add(attendance);
        System.out.println("Attendance recorded: " + attendance);
    }

    public void generateReport(Report report) {
        reports.add(report);
        System.out.println("Report generated: " + report);
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public List<RoleAssignment> getRoleAssignments() {
        return roleAssignments;
    }

    public List<LeaveRequest> getLeaveRequests() {
        return leaveRequests;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<PerformanceEvaluation> getEvaluations() {
        return evaluations;
    }

    public List<TrainingSession> getTrainingSessions() {
        return trainingSessions;
    }

    public List<Communication> getCommunications() {
        return communications;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public List<Report> getReports() {
        return reports;
    }
}