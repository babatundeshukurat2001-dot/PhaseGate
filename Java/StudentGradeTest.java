import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGrade2Test {

    

    @Test
    void scoreBetween0And100IsValid() {
        assertTrue(StudentGrade2.isValidScore(0));
        assertTrue(StudentGrade2.isValidScore(50));
        assertTrue(StudentGrade2.isValidScore(100));
    }

    @Test
    void scoreBelow0IsInvalid() {
        assertFalse(StudentGrade2.isValidScore(-1));
    }

    @Test
    void scoreAbove100IsInvalid() {
        assertFalse(StudentGrade2.isValidScore(101));
    }

   

    @Test
    void totalIsSumOfScores() {
        assertEquals(240, StudentGrade2.calculateTotal(new int[]{80, 90, 70}));
    }

    @Test
    void totalOfNoScoresIsZero() {
        assertEquals(0, StudentGrade2.calculateTotal(new int[]{}));
    }

   

    @Test
    void averageIsTotalDividedBySubjects() {
        assertEquals(80.0, StudentGrade2.calculateAverage(240, 3), 0.001);
    }

    @Test
    void averageKeepsDecimals() {
        assertEquals(83.33, StudentGrade2.calculateAverage(250, 3), 0.01);
    }

    

    @Test
    void highestTotalGetsPositionOne() {
        int[] positions = StudentGrade2.calculatePositions(new int[]{200, 300, 250});
        assertArrayEquals(new int[]{3, 1, 2}, positions);
    }

    @Test
    void equalTotalsShareSamePosition() {
        int[] positions = StudentGrade2.calculatePositions(new int[]{300, 300, 250});
        assertArrayEquals(new int[]{1, 1, 3}, positions);
    }

    @Test
    void singleStudentIsPositionOne() {
        assertArrayEquals(new int[]{1}, StudentGrade2.calculatePositions(new int[]{150}));
    }
}
