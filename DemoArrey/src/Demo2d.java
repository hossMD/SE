import java.util.Random;

/**
 * Created by iucosoft7 on 2/2/15.
 */

public class Demo2d {
    public static void main(String[] args) {
        
        int[][] t2d = new int [3][4];
        show2d(t2d);

        aleatori(t2d);
        show2d(t2d);
        
        
    }



    private static void show2d(int[][] t2d) {
        System.out.println("t2d");
        for (int i = 0; i < t2d.length; i++) {
            for (int j = 0; j <t2d[i].length ; j++) {

                System.out.println("t2["+i+"]["+j+"]="+t2d[i][j]);
            }
            System.out.println("");
        }
    }
    private static void aleatori(int[][] t2d) {
        Random random = new Random();
        for (int i = 0; i < t2d.length; i++) {
            for (int j = 0; j <t2d[i].length ; j++) {

             t2d[i][j]=1+ random.nextInt(35);
            }

        }


    }
}

