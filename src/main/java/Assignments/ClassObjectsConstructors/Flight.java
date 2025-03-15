package Assignments.ClassObjectsConstructors;

public class Flight {

    // Instance variables
    private String flightNumber;
    private String origin;
    private String destination;
    private double price;
    private boolean isAvailable;

    // Static variable
    private static int totalFlights = 0;

    // Constructor
    public Flight(String flightNumber, String origin, String destination, double price, boolean isAvailable) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.isAvailable = isAvailable;
        totalFlights++;
    }

    // Getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Static method
    public static int getTotalFlights() {
        return totalFlights;
    }

    // ToString method
    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
