package staffmanagement.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import staffmanagement.model.Schedule;
import staffmanagement.service.StaffManagementService;

public class ScheduleTest {

    @Mock
    private StaffManagementService staffManagementServiceMock;

    @InjectMocks
    private StaffManagementService staffManagementService;

    public ScheduleTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testScheduleShift_ValidSchedule() {
        // Mock data
        Schedule validSchedule = new Schedule("S123", "2024-06-01", "08:00", "16:00");

        // Mock behavior
        when(staffManagementServiceMock.scheduleShift(any(Schedule.class))).thenReturn(true);

        // Perform shift scheduling
        boolean isScheduled = staffManagementService.scheduleShift(validSchedule);

        // Verify
        assertTrue(isScheduled);
    }

    @Test
    public void testScheduleShift_OverlappingSchedule() {
        // Mock data
        Schedule overlappingSchedule = new Schedule("S123", "2024-06-01", "10:00", "18:00");

        // Mock behavior
        when(staffManagementServiceMock.scheduleShift(any(Schedule.class))).thenReturn(false);

        // Perform shift scheduling
        boolean isScheduled = staffManagementService.scheduleShift(overlappingSchedule);

        // Verify
        assertFalse(isScheduled);
    }
}