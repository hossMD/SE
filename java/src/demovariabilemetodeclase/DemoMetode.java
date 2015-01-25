
package demovariabilemetodeclase;

import javax.swing.JOptionPane;

/**
 *
 * @author iurasun
 */
public class DemoMetode {

    public static void main(String[] args) {

        //1  - introducere
        String nrLitereStr=JOptionPane.showInputDialog("Cate litere vrei sa vezi? ");

        int nrLitere =Integer.parseInt(nrLitereStr);


        //    introducereaDatelor();


        //2 afisare litere

        //   afisareLitere();

        for (int i = 65; i < 65+nrLitere; i++) {
            System.out.print(" "+(char)i);

        }


        //3  afiare mesaj inal

        // afisareMesajFinal();


        System.out.println("");

        System.out.println("Gata litere afisate");

    }


}
