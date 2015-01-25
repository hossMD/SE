
import java.util.Scanner;
import javax.swing.JOptionPane;


public class MiniDialog {
    public static void main (String[] args) {
        String nume = JOptionPane.showInputDialog("introdu Numele");
        String aniStr = JOptionPane.showInputDialog("ce varsta ai(cifre)");

        Scanner kb= new Scanner(System.in);


        int ani = Integer.parseInt(aniStr);

        String mesaj= "Salut " + nume + "! Ai " + ani + " si poti merge la ";

        if  (ani < 16 ){
            mesaj= mesaj+"invatat";
        }
        else  {
            mesaj = mesaj + "film indiiskii";
        }
        JOptionPane.showMessageDialog(null, mesaj);
    }
}





class Test
{
    public static void main(String args[])
    {
        int n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if ( n < 0 )
            System.out.println("Number should be non-negative.");
        else
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;

            System.out.println("Factorial of "+n+" is = "+fact);
        }
    }
}