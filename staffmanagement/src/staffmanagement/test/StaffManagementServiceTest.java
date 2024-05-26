package staffmanagement.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import staffmanagement.model.Staff;
import staffmanagement.service.StaffManagementService;

public class StaffManagementServiceTest {

    @Mock
    private StaffManagementService staffManagementServiceMock;

    @InjectMocks
    private StaffManagementService staffManagementService;

    public StaffManagementServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterStaff_SuccessfulRegistration() {
        // Mock data
        Staff newStaff = new Staff("John", "Doe", "S123");

        // Mock behavior
        when(staffManagementServiceMock.registerStaff(any(Staff.class))).thenReturn(true);

        // Perform registration
        boolean isRegistered = staffManagementService.registerStaff(newStaff);

        // Verify
        assertTrue(isRegistered);
    }

    @Test
    public void testRegisterStaff_DuplicateStaffId() {
        // Mock data
        Staff duplicateStaff = new Staff("Jane", "Smith", "S123");

        // Mock behavior
        when(staffManagementServiceMock.registerStaff(any(Staff.class))).thenReturn(false);

        // Perform registration
        boolean isRegistered = staffManagementService.registerStaff(duplicateStaff);

        // Verify
        assertFalse(isRegistered);
    }

    @Test
    public void testRegisterStaff_NullInput() {
        // Perform registration
        boolean isRegistered = staffManagementService.registerStaff(null);

        // Verify
        assertFalse(isRegistered);
    }
}