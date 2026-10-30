for (int j = 0; j < subjects; j++) {
            System.out.printf("%8s", "SUB" + (j + 1));
        }

        System.out.printf("%10s%10s%8s%n", "TOTAL", "AVE", "POS");

        System.out.println("=".repeat(75));

        for (int i = 0; i < students; i++) {

            double average = (double) totals[i] / subjects;

            System.out.printf("%-12s", "Student " + (i + 1));

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%8d", scores[i][j]);
            }

            System.out.printf("%10d%10.2f%8d%n",
                    totals[i], average, positions[i]);
        }

        // Subject summary
        System.out.println("\n" + "=".repeat(55));
        System.out.println("SUBJECT SUMMARY");
        System.out.println("=".repeat(55));

        int[] subjectTotals = new int[subjects];
        int[] subjectPasses = new int[subjects];
        int[] subjectFails = new int[subjects];
        double[] subjectAverages = new double[subjects];

        for (int j = 0; j < subjects; j++) {

            int highest = scores[0][j];
            int lowest = scores[0][j];

            int highestStudent = 1;
            int lowestStudent = 1;

            int total = 0;
            int passes = 0;
            int fails = 0;

            for (int i = 0; i < students; i++) {

                int score = scores[i][j];

                total += score;

                if (score > highest) {
                    highest = score;
                    highestStudent = i + 1;
                }

                if (score < lowest) {
                    lowest = score;
                    lowestStudent = i + 1;
                }

                if (score >= 50) {
                    passes++;
                } else {
                    fails++;
                }
            }

            double average = (double) total / students;

            subjectTotals[j] = total;
            subjectAverages[j] = average;
            subjectPasses[j] = passes;
            subjectFails[j] = fails;

            System.out.println("\nSubject " + (j + 1));

            System.out.println("Highest scoring student is: Student "
                    + highestStudent + " scoring " + highest);

            System.out.println("Lowest scoring student is: Student "
                    + lowestStudent + " scoring " + lowest);

            System.out.println("Total score is: " + total);
            System.out.printf("Average score is: %.2f%n", average);

            System.out.println("Number of passes: " + passes);
            System.out.println("Number of fails: " + fails);
        }

        // Find hardest and easiest subjects
        int hardestSubject = 0;
        int easiestSubject = 0;

        for (int j = 1; j < subjects; j++) {

            if (subjectFails[j] > subjectFails[hardestSubject]) {
                hardestSubject = j;
            }

            if (subjectPasses[j] > subjectPasses[easiestSubject]) {
                easiestSubject = j;
            }
        }

        System.out.println("\n" + "=".repeat(55));

        System.out.println("The hardest subject is Subject "
                + (hardestSubject + 1) + " with "
                + subjectFails[hardestSubject] + " failures");

        System.out.println("The easiest subject is Subject "
                + (easiestSubject + 1) + " with "
                + subjectPasses[easiestSubject] + " passes");

        // Overall highest and lowest scores
        int highestScore = scores[0][0];
        int lowestScore = scores[0][0];

        int highestStudent = 1;
        int highestSubject = 1;

        int lowestStudent = 1;
        int lowestSubject = 1;

        for (int i = 0; i < students; i++) {

            for (int j = 0; j < subjects; j++) {

                if (scores[i][j] > highestScore) {

                    highestScore = scores[i][j];
                    highestStudent = i + 1;
                    highestSubject = j + 1;
                }

                if (scores[i][j] < lowestScore) {

                    lowestScore = scores[i][j];
                    lowestStudent = i + 1;
                    lowestSubject = j + 1;
                }
            }
        }

        System.out.println("The overall highest score is scored by Student "
                + highestStudent + " in Subject " + highestSubject
                + " scoring " + highestScore);

        System.out.println("The overall lowest score is scored by Student "
                + lowestStudent + " in Subject " + lowestSubject
                + " scoring " + lowestScore);

        // Class summary
        int bestStudent = 0;
        int worstStudent = 0;

        int classTotal = 0;

        for (int i = 0; i < students; i++) {

            classTotal += totals[i];

            if (totals[i] > totals[bestStudent]) {
                bestStudent = i;
            }

            if (totals[i] < totals[worstStudent]) {
                worstStudent = i;
            }
        }

        double classAverage = (double) classTotal / students;

        System.out.println("\n" + "=".repeat(55));
        System.out.println("CLASS SUMMARY");
        System.out.println("=".repeat(55));

        System.out.println("Best Graduating Student is: Student "
                + (bestStudent + 1) + " scoring " + totals[bestStudent]);

        System.out.println("Worst Graduating Student is: Student "
                + (worstStudent + 1) + " scoring " + totals[worstStudent]);

        System.out.println("=".repeat(55));

        System.out.println("Class total score is: " + classTotal);

        System.out.printf("Class Average score is: %.1f%n", classAverage);

        System.out.println("=".repeat(55));

        input.close();
    }
}

