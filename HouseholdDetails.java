import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int members = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double water = sc.nextDouble();

        System.out.print("Enter house number: ");
        int houseNo = sc.nextInt();

        System.out.print("Enter water usage status (A/B): ");
        char status = sc.next().charAt(0);

        System.out.println("\n--- Household Details ---");
        System.out.println("Family members: " + members);
        System.out.println("Water consumed: " + water + " litres");
        System.out.println("House number: " + houseNo);
        System.out.println("Water usage status: " + status);

        sc.close();
    }
}

