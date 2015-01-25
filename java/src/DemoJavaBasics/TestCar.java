package DemoJavaBasics;

/**
 * Created by iucosoft7 on 1/21/15.
 */
public class TestCar {
    public static void main(String[] args) {
        Car dacia = new Car(4,100,1);
        Car ferary = new Car(5,200,2);


//        zakon4iti kak i avion i razabratisea!!!
//==============================================================
        System.out.println("auto for every day " +dacia.toString());
        System.out.println("auto for ricers "+ferary.toString());


        System.out.println("after tuning moldavskii : ");
        dacia.setPutereaMotorului(130);
        dacia.setWheelsNumber(5);
        dacia.setCarCost(100);
        System.out.println("Dacia after tuning "+dacia.toString());

        ferary.setPutereaMotorului(350);
        ferary.setWheelsNumber(4);
        ferary.setCarCost(70000);
        System.out.println("Ferary arter reparation"+ferary.toString());


        System.out.println(dacia.getWheelsNumber());
        System.out.println(dacia.getPutereaMotorului());
        System.out.println(dacia.getCarNr());
    }
}
