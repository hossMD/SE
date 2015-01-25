package DemoJavaBasics;

/**
 * Created by iucosoft7 on 1/21/15.
 */
public class DemoJavaBasics {
    public static int x = 99;
    public int y = 88;


    public static void main(String[] args) {

        if (x == 99) {
            int z = 111;
        }

        int z = 111;
        System.out.println("z local = " + z);

        System.out.println("var de clasa x=" + DemoJavaBasics.x);

        DemoJavaBasics ref1 = new DemoJavaBasics();
        System.out.println("var de object indica ref1 y=" + ref1.y);


//        ref1 =null; //NullPointerException

        System.out.println("var de object a fost ref1 y=" + ref1.y);

    }
}
