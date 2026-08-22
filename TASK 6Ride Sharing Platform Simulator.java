import java.util.*;
class InvalidBookingException extends Exception {
    InvalidBookingException(String msg) {
        super(msg);
    }
}
abstract class Vehicle {
    abstract double fare(double d);
}
class Bike extends Vehicle {
    double fare(double d) {
        return 20 + d * 8;
    }
}
class Auto extends Vehicle {
    double fare(double d) {
        return 30 + d * 12;
    }
}
class Cab extends Vehicle {
    double fare(double d) {
        return 50 + d * 15;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < 1 || n > 100000) {
                throw new InvalidBookingException(
                    "Number of trips must be between 1 and 100000"
                );
            }
            Vehicle vehicle = new Bike();
            for (int i = 0; i < n; i++) {
                double distance = sc.nextDouble();
                if (distance <= 0) {
                    throw new InvalidBookingException(
                        "Distance must be greater than zero"
                    );
                }
                System.out.println((int) vehicle.fare(distance));
            }
        } catch (InvalidBookingException e) {
            System.out.println("Booking Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}