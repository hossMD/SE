
package demovariabilemetodeclase;

/**
 *
 * @author iurasun
 */
public class TestPixe {
    public static void main(String[] args) {


        Pix p1=new Pix();
        Pix p2=new Pix();

        p1.setCuloare("Rosu");
        p2.setCuloare("Verde");

        p1.setGreutate(123);
        p2.setGreutate(234);



        p1.scrie("SALUT LUME");

        p2.scrie("HELLO LUME");



        System.out.println("culoarea pixului 1 este "+p1.getCuloare());

    }
}

