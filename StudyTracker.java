import java.util.Scanner;
public class StudyTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int weeklyGoal = 600;
        int totalSessions = 0;
        int totalStudyTime = 0;
        int programmingTime = 0;
        int mathematicsTime = 0;
        int englishTime = 0;
        int otherTime = 0;

        int choice = 0;

        while (choice != 4) {
            System.out.println("======STUDY TRACKER=====");
            System.out.println("1. Add study session");
            System.out.println("2. View statistics");
            System.out.println("3. Check weekly goal");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Choose a subject");
                System.out.println("1. Programming");
                System.out.println("2. Mathematics");
                System.out.println("3. English");
                System.out.println("4. Other");
                System.out.println("Choose an option: ");
                int subjectChoice = scanner.nextInt();

                if (subjectChoice < 1 || subjectChoice > 4) {
                    System.out.println("Error.");
                } else {
                    System.out.println("study time in minutes: ");
                    int studyTime = scanner.nextInt();
                    if (studyTime <= 0) {
                        System.out.println("Invalid study time. Time must be greater than 0.");
                    } else {
                        if (subjectChoice == 1) {
                            programmingTime += studyTime;
                        } else if (subjectChoice == 2) {
                            mathematicsTime += studyTime;
                        } else if (englishTime == 3) {
                            englishTime += studyTime;
                        } else if (subjectChoice == 4) {
                            otherTime += studyTime;
                        }
                        totalStudyTime += studyTime;
                        totalSessions++;
                        System.out.println();
                        System.out.println("Study session added");
                        System.out.println("Current total study time:" + totalStudyTime + "minutes");
                    }
                }
            } else if (choice == 2) {
                System.out.println("=====WEEKLY STATISTICS=====");
                System.out.println("Study sessions: " + totalSessions);
                System.out.println("Total study time: " + totalStudyTime + "minutes");
                System.out.println();
                System.out.println("Programming: " + programmingTime + "minutes");
                System.out.println("Mathematics: " + mathematicsTime + "minutes");
                System.out.println("English: " + englishTime + "minutes");
                System.out.println("Other: " + otherTime + "minutes");
            } else if (choice == 3) {
                System.out.println("Weekly goal: " + weeklyGoal + "minutes");
                System.out.println("You studied: " + totalStudyTime + "minutes");
                int remaining = weeklyGoal - totalStudyTime;
                if (remaining > 0) {
                    System.out.println("Remaining: " + remaining + "minutes");
                } else {
                    System.out.println("Remaining: 0 minutes");
                    System.out.println("Weekly goal achieved!");
                }
            } else if (choice == 4) {
                    System.out.println("Study tracker closed. Keep up the good work!");
                } else {
                    System.out.println("Invalid option. Please choose between 1 and 4.");
                }
                System.out.println();
        }
        scanner.close();
    }
}
