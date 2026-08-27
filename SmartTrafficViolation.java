import java.util.Scanner;

public class SmartTrafficViolationAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Speed: ");
        double speed = sc.nextDouble();

        System.out.print("Enter Speed Limit: ");
        double speedLimit = sc.nextDouble();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Helmet worn? (1-Yes, 0-No): ");
        int helmet = sc.nextInt();

        System.out.print("Seat Belt worn? (1-Yes, 0-No): ");
        int seatBelt = sc.nextInt();

        System.out.print("Valid Driving Licence? (1-Yes, 0-No): ");
        int licence = sc.nextInt();

        System.out.print("Emergency Vehicle? (1-Yes, 0-No): ");
        int emergency = sc.nextInt();

        // Violation flag
        int violationFlag = 0;
        int fine = 0;

        // Speed violation
        if (speed > speedLimit && emergency == 0) {
            violationFlag = violationFlag | 1;
            fine += 1000;
        }

        // Helmet violation
        if (helmet == 0 && emergency == 0) {
            violationFlag = violationFlag | 2;
            fine += 500;
        }

        // Seat belt violation
        if (seatBelt == 0 && emergency == 0) {
            violationFlag = violationFlag | 4;
            fine += 500;
        }

        // Licence violation
        if (licence == 0) {
            violationFlag = violationFlag | 8;
            fine += 2000;
        }

        // Age violation
        if (age < 18) {
            violationFlag = violationFlag | 16;
            fine += 1000;
        }

        // Final Report
        System.out.println("\n----- TRAFFIC VIOLATION REPORT -----");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Speed  : " + speed);
        System.out.println("Speed Limit    : " + speedLimit);
        System.out.println("Driver Age     : " + age);
        System.out.println("Emergency      : " + (emergency == 1 ? "Yes" : "No"));

        if (violationFlag == 0) {
            System.out.println("Violation Status: NO VIOLATION");
            System.out.println("Total Fine     : ₹0");
        } else {
            System.out.println("Violation Status: VIOLATION DETECTED");
            System.out.println("Violation Flag : " + violationFlag);
            System.out.println("Total Fine     : ₹" + fine);

            System.out.println("\nViolations:");

            if ((violationFlag & 1) != 0)
                System.out.println("- Over Speeding: ₹1000");

            if ((violationFlag & 2) != 0)
                System.out.println("- No Helmet: ₹500");

            if ((violationFlag & 4) != 0)
                System.out.println("- No Seat Belt: ₹500");

            if ((violationFlag & 8) != 0)
                System.out.println("- No Driving Licence: ₹2000");

            if ((violationFlag & 16) != 0)
                System.out.println("- Driver Under 18: ₹1000");
        }

        sc.close();
    }
}
