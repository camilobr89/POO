class Car {
    Integer id;
    String license;
    Account driver;
<<<<<<< HEAD
    private Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passegenger != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passegenger);
        }
        
    }


    public Integer getPassenger(){
        return passegenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passegenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
    
}
=======
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
>>>>>>> 8ad97fc583aaa81e541ae675a6e5aa557571f8f4
