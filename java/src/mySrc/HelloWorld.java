package mySrc;

import javax.swing.*;

public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("Hello, World");
        System.out.println("qwe123");
        for (int i = 0; i < 6; i++) {

            System.out.println("Linia" + (i + 1));
            String text = JOptionPane.showInputDialog("Cifra");

            int x = Integer.parseInt(text);

            for (int j = x; j < 6; j++) {
                System.out.println("linia" + (j + 1));


            }
        }

    }}

