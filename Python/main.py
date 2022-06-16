from car import Car

if __name__ == "__main__":
    print("Hello World!")
    car = Car()
    car.license = "ABC-123"
    car.driver = "John"
    car.passenger = 4
    print(vars(car))

    car2 = Car()
    car2.license = "BCD-456"
    car2.driver = "Tom"
    car2.passenger = 2
    print(vars(car2))