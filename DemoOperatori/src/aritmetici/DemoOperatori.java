
package aritmetici;

/**
 *
 * @author iurasun
 */
public class DemoOperatori {
    public static void main(String[] args) {

        System.out.println("demo operatori aritmetici");
        
        int nr1 = 9;
        int nr2 = 10;
        
        System.out.println(String.format(  "%d / %d = %d"  , nr1, nr2, nr1/nr2 ) );
        System.out.println(String.format(  "%d %s %d = %d"  , nr1, "%" ,  nr2, nr1%nr2 ) );
        
        
        double nrD1 = -9.20;
        double nrD2 = 0.0;
        
        System.out.println(String.format(  "%f / %f = %f"  , nrD1, nrD2, nrD1/nrD2 ) );
        System.out.println(String.format(  "%f %s %f = %f"  , nrD1, "%" ,  nrD2, nrD1%nrD2 ) );
        
        
        int nr = 8;
        System.out.println("incrementare dreapta");
        System.out.println("nr "+(nr) );
        System.out.println("nr++ "+(nr++) );
        System.out.println("nr "+(nr) );
        
        
        System.out.println("incrementare stanga");
        System.out.println("nr "+(nr) );
        System.out.println("++nr"+(++nr) );
        System.out.println("nr "+(nr) );
        
        
        
        System.out.println("decrementare dreapta");
        System.out.println("nr "+(nr) );
        System.out.println("nr-- "+(nr--) );
        System.out.println("nr "+(nr) );
        
        
        System.out.println("decrementare stanga");
        System.out.println("nr "+(nr) );
        System.out.println("--nr"+(--nr) );
        System.out.println("nr "+(nr) );
        
        
        
        nr1 = 20;
        nr2 = 10;
        
        //nr = (--nr1) - (--nr2);
        nr = (--nr1) + (nr2++);
        
        System.out.println("nr=? "+nr);
        System.out.println("nr1=? "+nr1);
        System.out.println("nr2=? "+nr2);
        
    }
    
}
