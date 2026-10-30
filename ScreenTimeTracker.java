import java.util.Scanner;
public class ScreenTimeTracker {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int socialMediaTime = 0;
        int gamingTime = 0;
        int studyingTime = 0;
        int streamingTime = 0;
        int recordedSessions = 0;

        int choice = 0;

        while (choice != 6) {
            System.out.println("\n======SCREEN-TIME TRACKER=====");
            System.out.println("1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
            } else {
            scanner.next();
            System.out.println("Invalid option.");
            continue;
            }
            if (choice >= 1 && choice <= 4){
                String categoryName = "";
                if (choice == 1) categoryName = "social media";
                else if (choice == 2) categoryName = "gaming";
                else if (choice == 3) categoryName = "studying";
                else if (choice == 4) categoryName = "streaming";

                System.out.print("Enter " + categoryName + "minutes: ");
                int minutes = scanner.nextInt();
                if (minutes > 0 ) {
                    if (choice == 1) socialMediaTime += minutes;
                    else if (choice == 2) gamingTime += minutes;
                    else if (choice == 3) studyingTime += minutes;
                    else if (choice == 4) streamingTime += minutes;
                    recordedSessions++;
                    System.out.println("Time added successfully!");
                }else {
                    System.out.println("Invalid time. Minutes mus be grater than 0.");
                }
                }else if (choice == 5){
                    System.out.println("\n=====TODAY'S SCREEN TIME=====");
                    System.out.println("Social media: " + socialMediaTime + "minutes");
                    System.out.println("Gaming: " + gamingTime + "minutes");
                    System.out.println("Studying: " + studyingTime + "minutes");
                    System.out.println("Streaming: " + streamingTime + "minutes");

                    int totalScreenTime = socialMediaTime + gamingTime + studyingTime + streamingTime;
                    System.out.println("\nTotal screen time: " + totalScreenTime + "minutes");
                    System.out.println("Recorded sessions: " + recordedSessions);

                    int entertainmentTime = socialMediaTime + gamingTime + streamingTime;

                    System.out.println("\nProductive vs. Entertainment Time");
                    if (studyingTime > entertainmentTime) {
                        System.out.println("Study screen time is greater than entertainment screen time. Good balance");
                    } else if (entertainmentTime > studyingTime) {
                        System.out.println("Entertainment screen time is greater than study time.");
                    } else {
                        System.out.println("Study and entertainment screen time are equal.");
                    }

                    System.out.println("\nDaily Screen-Time Message");
                    if (totalScreenTime < 120) {
                        System.out.println("Low screen time");
                    } else if (totalScreenTime <= 240) {
                        System.out.println("Moderate screen time");
                    } else {
                        System.out.println("High screen time");
                    }
                }else if (choice == 6)   {
                    System.out.println("Screen-time tracker closed.");
                }else {
                    System.out.println("Invalid option. Please choose between 1 and 6.");
                }
        }
        scanner.close();
    }
}
