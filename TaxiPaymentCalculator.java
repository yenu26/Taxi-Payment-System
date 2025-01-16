import java.util.Scanner;

public class TaxiPaymentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for customer details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter vehicle model (threewheel/car/van): ");
        String vehicleModel = scanner.nextLine().toLowerCase();

        System.out.print("Enter distance (in km): ");
        double distance = scanner.nextDouble();

        // Calculate payment based on vehicle model and distance
        double ratePerKm;

        switch (vehicleModel) {
            case "threewheel":
                ratePerKm = 40;
                break;
            case "car":
                ratePerKm = 50;
                break;
            case "van":
                ratePerKm = 60;
                break;
            default:
                System.out.println("Invalid vehicle model entered.");
                return;
        }

        double totalPayment = ratePerKm * distance;

        // Display the bill
        System.out.println("\n--- Taxi Payment Bill ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Payment: Rs. " + totalPayment);
    }
}
