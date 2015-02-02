package ternar;

/**
 *
 * @author iurasun
 */
public class DemoTernar {

    public static void main(String[] args) {

        int x = 55;
        int y = 66;
        int k = 77;

        int z = 0;

        if (x > y) {
            z = x;
        } else {
            z = y;
        }

        if (x > y) {
            z = x;
        } else {
            if (y > k) {
                z = y;
            } else {
                z = k;
            }
        }

//        if(y>x){
//          z=y;
//        }
//        
//        if(x==y){
//          z=x;
//        }
        System.out.println("ternar: ");

        //z = ( 1 ) ? (2 ) :   (3 )   ;
        z = (x > y) ? (x) : (y);

        z = (x > y) ? (x) : ((y > k) ? y : k);

        if (((x > y) ? (x) : ((y > k) ? y : k)) > 32) {

            System.out.println("da cel mai mare numar din cele 3 este mai mare ca 32");
        }

        System.out.println("z=" + z);

        if (((6 + 3) > 4) && ((9 - 1) < 11)) {

        }
    }
}
