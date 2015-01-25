package DemoJavaBasics;

/**
 * Created by iucosoft7 on 1/21/15.
 */
public class TestAvioane {
    public static void main(String[] args) {
        Avion av1 = new Avion(4,44);
        Avion av2 = new Avion(2,55);

        System.out.println("av1="+ av1.toString());
        System.out.println("av2="+ av2.toString());

        System.out.println("modificam: ");
        av1.setNrDeAripi(6);
        av2.setPutereMotor(34.56);

        av2.setNrDeAripi(3);

        System.out.println("av1="+ av1.toString());
        System.out.println("av2="+ av2.toString());


        System.out.println();


    }
}
