class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.license = "ABC123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        System.out.println("Car License: ".concat(car.license));
        System.out.println("Driver: ".concat(car.driver));
        System.out.println("Passenger: ".concat(car.passenger.toString()));


    }
}