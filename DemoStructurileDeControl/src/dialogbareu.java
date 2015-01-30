import java.util.Scanner;

/**
 * Created by iucosoft7 on 1/30/15.
 */
public class dialogbareu {
    public static void main(String[] args) {
        System.out.println("arata si ai: ");

        Scanner kb= new Scanner(System.in);







        int punctaj = Integer.parseInt(kb.nextLine());

        String mesaj= "Tu ai " + punctaj ;




        if  (punctaj>90){
            mesaj += " asta e nota A ";
        }
        else  if (punctaj>80){
            mesaj += " asta e nota  B ";
        }
        else  if (punctaj>70){
            mesaj += " asta e nota  C ";
        }
        else  if (punctaj>60){
            mesaj += " asta e nota  D ";
        }
        else  if (punctaj>50){
            mesaj += "  asta e nota  E ";
        }



        System.out.println(mesaj);

    }
}
