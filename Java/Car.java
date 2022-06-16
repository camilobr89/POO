class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        
    }

    void printData() {
        System.out.println();
        System.out.println("Car License: ".concat(license));
        System.out.println("Driver: ".concat(driver.name));
        System.out.println("Passenger: ".concat(passenger.toString()));
        System.out.println();
    }
}
