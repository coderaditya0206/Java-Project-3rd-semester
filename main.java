import java.util.Scanner;

class AmbulanceBooking {
    private String patientName;
    private String contactNumber;
    private String location;
    private String ambulanceType;
    private boolean isBooked;

    public AmbulanceBooking(String patientName, String contactNumber, String location, String ambulanceType) {
        this.patientName = patientName;
        this.contactNumber = contactNumber;
        this.location = location;
        this.ambulanceType = ambulanceType;
        this.isBooked = false;
    }

    public void bookAmbulance() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ambulance booked successfully!");
            System.out.println("Booking Details:");
            System.out.println("Patient Name: " + patientName);
            System.out.println("Contact Number: " + contactNumber);
            System.out.println("Location: " + location);
            System.out.println("Ambulance Type: " + ambulanceType);
        } else {
            System.out.println("Ambulance is already booked.");
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Ambulance booking has been canceled.");
        } else {
            System.out.println("No booking found to cancel.");
        }
    }

    public boolean isBooked() {
        return isBooked;
    }
}

public class AmbulanceBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient's name: ");
        String patientName = scanner.nextLine();

        System.out.print("Enter contact number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        System.out.println("Select ambulance type (1 for Basic, 2 for Advanced): ");
        int ambulanceChoice = scanner.nextInt();
        scanner.nextLine(); 

        String ambulanceType = (ambulanceChoice == 1) ? "Basic" : "Advanced";

        AmbulanceBooking booking = new AmbulanceBooking(patientName, contactNumber, location, ambulanceType);

       
        booking.bookAmbulance();

       
        System.out.print("Do you want to cancel the booking? (yes/no): ");
        String cancelChoice = scanner.nextLine();

        if (cancelChoice.equalsIgnoreCase("yes")) {
            booking.cancelBooking();
        }

        scanner.close();
    }
}
