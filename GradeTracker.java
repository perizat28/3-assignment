import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double assignmentPoints = 0;
        int assignmentCount = 0;

        double examPoints = 0;
        int examCount= 0;

        int choice = 0;

        while ( choice !=4){
            System.out.println("\n=====SEMESTER GRADE TRACKER=====");
            System.out.println("1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
            }else{
                scanner.next();
                System.out.println("Invalid option.");
                continue;
            }

            if (choice == 1){
                System.out.println("Enter assignment score: ");
                double score = scanner.nextDouble();
                if (score >= 0 && score <= 100){
                    assignmentPoints += score;
                    assignmentCount++;
                    System.out.println("Assignment score added.");
                }else{
                    System.out.println("Invalid score. Enter a value from 0 to 100. ");
                }
            }else if (choice == 2){
                System.out.println("Enter exam score: ");
                double score = scanner.nextDouble();

                if (score >= 0 && score <= 100){
                    examPoints += score;
                    examCount++;

                    System.out.println("Exam score added.");
                }else {
                    System.out.println("Invalid score. Enter a value from 1 to 100. ");
                }
            }else if (choice == 3){
                if (assignmentCount == 0 && examCount == 0){
                    System.out.println("No results available yet.");
                }else{
                    System.out.println("\n======CURRENT RESULTS=====");

                    double assignmentAverage =0;
                    if (assignmentCount > 0){
                        assignmentAverage = assignmentPoints / assignmentCount;
                        System.out.println("Assignment completed: " + assignmentCount);
                        System.out.printf("Assignment average: %.1f\n",  assignmentAverage);
                    }
                    double examAverage = 0;
                    if (examCount > 0 ){
                        examAverage = examPoints / examCount;
                        System.out.println("Exam completed: " + examCount);
                        System.out.printf("Exam average: %.1f\n",  examAverage);
                    }
                    double overallAverage;
                    if (assignmentCount > 0 && examCount > 0) {
                        overallAverage = (assignmentAverage * 0.50) + (examAverage * 0.50);
                    } else if (assignmentCount > 0) {
                        overallAverage = assignmentAverage;
                    } else {
                        overallAverage = examAverage;
                    }
                    System.out.printf("Overall average: %.1f\n", overallAverage);

                    char grade;
                    if (overallAverage >= 90) {
                        grade = 'A';
                    } else if (overallAverage >= 80) {
                        grade = 'B';
                    } else if (overallAverage >= 70) {
                        grade = 'C';
                    } else if (overallAverage >= 60) {
                        grade = 'D';
                    } else {
                        grade = 'F';
                    }
                    System.out.println("Grade: " + grade);

                    if (overallAverage >= 60) {
                        System.out.println("Status: Passing");
                    } else {
                        System.out.println("Status: Failing");
                    }
                }

            } else if (choice == 4) {
                System.out.println("Exiting program.");
            } else {
                System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
        scanner.close();
    }

}

