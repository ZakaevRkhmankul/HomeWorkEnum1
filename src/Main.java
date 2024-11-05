public class Main {
    public static void main(String[] args) {
        double distance = 100.0;
        double car = TransportType.CAR.calculateTravelCost(distance);
        double bus = TransportType.BUS.calculateTravelCost(distance);
        double truck = TransportType.TRUCK.calculateTravelCost(distance);

        System.out.println("Car = "+car);
        System.out.println("Bus = "+bus);
        System.out.println("Truck = "+truck);
    }
}