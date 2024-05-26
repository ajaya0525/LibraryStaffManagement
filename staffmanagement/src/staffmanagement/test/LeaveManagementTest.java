package staffmanagement.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import staffmanagement.model.LeaveRequest;
import staffmanagement.service.StaffManagementService;

public class LeaveManagementTest {

    @Mock
    private StaffManagementService staffManagementServiceMock;

    @InjectMocks
    private StaffManagementService staffManagementService;

    public LeaveManagementTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRequestLeave_ValidRequest() {
        // Mock data
        LeaveRequest validLeaveRequest = new LeaveRequest("S123", "2024-06-01", "2024-06-03");

        // Mock behavior
        when(staffManagementServiceMock.requestLeave(any(LeaveRequest.class))).thenReturn(true);

        // Perform leave request
        boolean isRequested = staffManagementService.requestLeave(validLeaveRequest);

        // Verify
        assertTrue(isRequested);
    }

    @Test
    public void testRequestLeave_InsufficientBalance() {
        // Mock data
        LeaveRequest insufficientBalanceRequest = new LeaveRequest("S123", "2024-06-01", "2024-06-03");

        // Mock behavior
        when(staffManagementServiceMock.requestLeave(any(LeaveRequest.class))).thenReturn(false);

        // Perform leave request
        boolean isRequested = staffManagementService.requestLeave(insufficientBalanceRequest);

        // Verify
        assertFalse(isRequested);
    }
}