public class StudentGrade2 {

    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    public static int calculateTotal(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    public static int[] calculatePositions(int[] totals) {
        int[] positions = new int[totals.length];
        for (int count = 0; count < totals.length; count++) {
            positions[count] = 1;
            for (int index = 0; index < totals.length; index++) {
                if (totals[index] > totals[count]) {
                    positions[count]++;
                }
            }
        }
        return positions;
    }
}
