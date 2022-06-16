class Main {
    public static void main(String[] args) {
        
        Car car = new Car("ABC123", new Account("Andres Herrera", "AND123"));
    
        car.passenger = 4;
        car.printData();

        Car car2 = new Car("XYZ789", new Account("Andres Herrera", "AND456"));
        
        car2.passenger = 3;
        car2.printData();
        




    }
}