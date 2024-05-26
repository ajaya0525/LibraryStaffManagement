package staffmanagement.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import staffmanagement.model.RoleAssignment;
import staffmanagement.service.StaffManagementService;

public class RoleAssignmentTest {

    @Mock
    private StaffManagementService staffManagementServiceMock;

    @InjectMocks
    private StaffManagementService staffManagementService;

    public RoleAssignmentTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAssignRole_ValidRole() {
        // Mock data
        RoleAssignment roleAssignment = new RoleAssignment("S123", "Librarian");

        // Mock behavior
        when(staffManagementServiceMock.assignRole(any(RoleAssignment.class))).thenReturn(true);

        // Perform role assignment
        boolean isAssigned = staffManagementService.assignRole(roleAssignment);

        // Verify
        assertTrue(isAssigned);
    }

    @Test
    public void testAssignRole_InvalidRole() {
        // Mock data
        RoleAssignment invalidRoleAssignment = new RoleAssignment("S123", "InvalidRole");

        // Mock behavior
        when(staffManagementServiceMock.assignRole(any(RoleAssignment.class))).thenReturn(false);

        // Perform role assignment
        boolean isAssigned = staffManagementService.assignRole(invalidRoleAssignment);

        // Verify
        assertFalse(isAssigned);
    }
}