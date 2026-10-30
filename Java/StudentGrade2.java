import java.util.Scanner;

public class StudentGrade2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int students = input.nextInt();

        System.out.print("How many subjects do they offer? ");
        int subjects = input.nextInt();

        int[][] scores = new int[students][subjects];
        int[] totals = new int[students];
        int[] positions = new int[students];

        
        for (int count = 0; count < students; count++) {

            System.out.println("\nEntering score for Student " + (count + 1));

            for (int index = 0; index < subjects; index++) {

                while (true) {

                    System.out.print("Enter score for subject " + (index + 1) + ": ");
                    int score = input.nextInt();

                    if (score >= 0 && score <= 100) {

                        scores[count][index] = score;
                        totals[count] += score;

                        System.out.println("Saved successfully");
                        break;

                    } else {

                        System.out.println("Invalid score! Enter a score between 0 and 100.");
                    }
                }
            }
        }

        
        for (int count = 0; count < students; count++) {

            positions[count] = 1;

            for (int index = 0; index < students; index++) {

                if (totals[index] > totals[count]) {
                    positions[count]++;
                }
            }
        }

        
        System.out.println("\n" + "============================================================");
        System.out.println("STUDENT GRADE SUMMARY");
        System.out.println("============================================================");

        System.out.printf("%-12s", "STUDENT");

    for (int index = 0; index < subjects; index++) {
            System.out.printf("%8s", "SUB" + (index + 1));
        }

        System.out.printf("%10s%10s%8s%n", "TOTAL", "AVE", "POS");

        System.out.println("============================================================");


    for (int count = 0; count < students; count++) {

            double average = (double) totals[count] / subjects;

            System.out.printf("%-12s", "Student " + (count + 1));

            for (int index = 0; index < subjects; index++) {
                System.out.printf("%8d", scores[count][index]);
            }

            System.out.printf("%10d%10.2f%8d%n",
                    totals[count], average, positions[count]);
        }

   

   

}
 
}
        
