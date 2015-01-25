package DemoJavaBasics;

public class Car {

    private int wheelsNumber;
    private int putereaMotorului;
    private int carCost;

    public Car(int wheelsNumber, int putereaMotorului, int carNr) {
        this.wheelsNumber = wheelsNumber;
        this.putereaMotorului = putereaMotorului;
        this.carCost = carNr;
    }



    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getPutereaMotorului() {
        return putereaMotorului;
    }

    public void setPutereaMotorului(int putereaMotorului) {
        this.putereaMotorului = putereaMotorului;
    }

    public int getCarNr() {
        return carCost;
    }

    public void setCarCost(int carNr) {
        this.carCost = carNr;
    }
//
    @Override
    public String toString() {
        return "Car{" +
                "wheelsNumber=" + wheelsNumber +
                ", putereaMotorului=" + putereaMotorului +
                ", carCost=" + carCost +
                '}';
    }
}
