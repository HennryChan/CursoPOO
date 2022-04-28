from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("ASH123", Account("Carlos Uc", "ASG845"))
    print(vars(car))
    print(vars(car.drive))
