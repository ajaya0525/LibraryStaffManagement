package staffmanagement.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import staffmanagement.model.PerformanceEvaluation;
import staffmanagement.service.StaffManagementService;

public class PerformanceEvaluationTest {

    @Mock
    private StaffManagementService staffManagementServiceMock;

    @InjectMocks
    private StaffManagementService staffManagementService;

    public PerformanceEvaluationTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testEvaluatePerformance_ValidEvaluation() {
        // Mock data
        PerformanceEvaluation validEvaluation = new PerformanceEvaluation("S123", 4, "Good performance");

        // Mock behavior
        when(staffManagementServiceMock.evaluatePerformance(any(PerformanceEvaluation.class))).thenReturn(true);

        // Perform performance evaluation
        boolean isEvaluated = staffManagementService.evaluatePerformance(validEvaluation);

        // Verify
        assertTrue(isEvaluated);
    }

    @Test
    public void testEvaluatePerformance_InvalidRating() {
        // Mock data
        PerformanceEvaluation invalidRatingEvaluation = new PerformanceEvaluation("S123", 6, "Invalid rating");

        // Mock behavior
        when(staffManagementServiceMock.evaluatePerformance(any(PerformanceEvaluation.class))).thenReturn(false);

        // Perform performance evaluation
        boolean isEvaluated = staffManagementService.evaluatePerformance(invalidRatingEvaluation);

        // Verify
        assertFalse(isEvaluated);
    }
}