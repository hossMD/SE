package JavaApplicationTabloluri;

/**
 * Created by iucosoft7 on 1/23/15.
 */
public class DemoTablouri {
    public static void main(String[] args) {
//        int [] numele;
        int [] numele = {22, 33, 44, 55} ;
        System.out.println("lungimea = "+ numele.length);


        numele = new int[] {22, 55} ;
        System.out.println("lungimea = "+ numele.length);

        numele = new int [4] ;
        numele[0] = 1;
        numele[1] = 11;
        numele[2] = 111;
        numele[3] = 1111;


        numele[2] = 121;
//        numele[4] = 1221; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4

        System.out.println("element al treilea " + numele[2]);



    }
}
