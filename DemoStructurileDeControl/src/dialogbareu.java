import java.util.Scanner;

public class dialogbareu {
    public static void main(String[] args) {
        System.out.println("arata si ai: ");

        Scanner kb = new Scanner(System.in);


        int punctaj = Integer.parseInt(kb.nextLine());

        String mesaj = "Tu ai introdus punctaj egal " + punctaj + " asta e nota ";


        if (punctaj > 100) {
            mesaj = "nu e adevar! ";
        } else if (punctaj > 90) {
            mesaj += "A";
        } else if (punctaj > 80) {
            mesaj += "B";
        } else if (punctaj > 70) {
            mesaj += "C";
        } else if (punctaj > 60) {
            mesaj += "D";
        } else if (punctaj > 50) {
            mesaj += "E";

        } else if (punctaj >= 0 && punctaj <= 50) {

            mesaj += "F";


        } else if (punctaj <= 0) {
            mesaj = "nu e adevar! ";
        }




        System.out.println(mesaj);


    }
}
