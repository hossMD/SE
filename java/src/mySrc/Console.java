package mySrc;

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Console {

    public static void main(String[] args) {
//        String nume = JOptionPane.showInputDialog("introdu Numele");
//        String aniStr = JOptionPane.showInputDialog("ce varsta ai(cifre)");
        Scanner kb = new Scanner(System.in);
        System.out.println("da nume");
        String nume = kb.nextLine();
        System.out.println("ce virsta ai");
        String aniStr = kb.nextLine(); // numar!!!

        int ani = Integer.parseInt(aniStr);

        String mesaj = "Salut " + nume + "! Ai " + ani + " si poti merge la ";

        if (ani < 16) {
            mesaj = mesaj + "invatat";
        } else {
            mesaj = mesaj + "film indiiskii";
        }
//        JOptionPane.showMessageDialog(null, mesaj);
        System.out.println(mesaj);
    }
}
