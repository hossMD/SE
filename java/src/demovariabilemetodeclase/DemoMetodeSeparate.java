/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demovariabilemetodeclase;

import javax.swing.JOptionPane;

/**
 *
 * @author iurasun
 */
public class DemoMetodeSeparate {

    static int nrLitere;


    public static void main(String[] args) {

        introducereaDatelor();

        afisareLitere();

        afisareMesajFinal();


    }

    private static void introducereaDatelor() {
        String nrLitereStr=JOptionPane.showInputDialog("Cate litere vrei sa vezi? ");
        if(nrLitereStr.length()==0)
            return ;
        nrLitere =Integer.parseInt(nrLitereStr);
    }

    private static void afisareLitere() {
        for (int i = 65; i < 65+nrLitere; i++) {
            System.out.print(" "+(char)i);

        }
    }

    private static void afisareMesajFinal() {

        System.out.println("");

        System.out.println("Gata litere afisate");
    }

}
