
package demovariabilemetodeclase;

/**
 *
 * @author iurasun
 */
public class TestareA {
    public static void main(String[] args) {

        System.out.println("aMicStatic="+A.aMicStatic);

        A aRef1=new A();
        System.out.println("aMic din 1 ="+aRef1.aMic);

        A aRef2=new A();

        aRef2.aMic=123;
        System.out.println("aMic din 2 ="+aRef2.aMic);
    }

}
