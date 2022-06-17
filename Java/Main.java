class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(2);
        uberX.printDataCar();
=======
        
        Car car = new Car("ABC123", new Account("Andres Herrera", "AND123"));
    
        car.passenger = 4;
        car.printData();

        Car car2 = new Car("XYZ789", new Account("Andres Herrera", "AND456"));
        
        car2.passenger = 3;
        car2.printData();
        



>>>>>>> 8ad97fc583aaa81e541ae675a6e5aa557571f8f4

        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger = 3;
        car2.printDataCar();*/
    }
}