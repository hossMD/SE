package markers;

import java.util.Scanner;

/**
 * Created by MaRV on 1/29/2015.
 */
public class MarkersStore {


    public static void main(String[] args) {
        System.out.println("U wanna buy some markers?We have red yellow and black markes. Do you wanna know the prises?");


        Scanner sc = new Scanner(System.in);
        System.out.println("Do U wanna se the price? [yes]/[no]");
        if (sc.hasNext("yes")) {
            System.out.println("Prices are: Red[10] Yellow[20] Black [30]");
            sc.next();
        }
        else
//        String vowel = sc.next();
        System.out.println("Thank you for the visit! Have a nice day! Bye! ");



    }
}

