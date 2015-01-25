
package demovariabilemetodeclase;

/**
 *
 * @author iurasun
 */
public class DemoChar {
    public static void main(String[] args) {

        int page=12;

        char ch = 65;
        ch='A';
        int codCh=ch;
        System.out.println("ch=."+ch+". code = "+codCh);

        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.print(" "+(char)i+"="+i);
            if(i>=page && i%page == 0){
                System.out.println("");
            }
        }
        System.out.println("");


    }
}
