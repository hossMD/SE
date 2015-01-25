import javax.swing.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        int n = 1;
        int c;
        int fact = 1;

        String digIt = JOptionPane.showInputDialog("Enter an integer to calculate it's factorial");

        int digInt = Integer.parseInt(digIt);

        System.out.println("Enter an integer to calculate it's factorial");
//        Scanner in = new Scanner(System.in);
//
//        Scanner in;
//        n = in.nextInt();

        if (n < 0)
            System.out.println("Number should be non-negative.");
        else {
            for (c = 1; c <= digInt; c++)
                fact = fact * c;

            System.out.println("Factorial of " + digInt + " is = " + fact);
            JOptionPane.showMessageDialog(null, fact);
        }
    }
}
