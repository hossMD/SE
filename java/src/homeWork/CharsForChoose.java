package homework;

/**
 * Created by MaRV on 1/20/2015.
 */
public class CharsForChoose {
    public static void main(String[] args) {

        int page = 20;

        int chfrom = 63744;
        int chto = 64106;
        int rusFrom = 1072;
        int rusTo = 1104;
        int engFrom = 65;
        int engTo = 90;


        char ch = 65;
        ch = 'A';
        int codCh = ch;
//        System.out.println("ch=." + ch + ". code = " + codCh);
//
//        for (int i = 0; i < Character.MAX_VALUE; i++) {
//            System.out.print(" " + (char) i + "=" + i);
//            if (i >= page && i % page == 0) {
//                System.out.println("");
//            }
//        }
//        System.out.println("");

//        int i = 64106;

        System.out.println("ch=." + ch + ". code = " + codCh);

        for (int i = chfrom; i < chto; i++) {
            System.out.print(" " + (char) i + "=" + i);
            if (i >= page && i % page == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");

//        System.out.println("ch=." + ch + ". code = " + codCh);

        for (int i = engFrom; i < engTo; i++) {
            System.out.print(" " + (char) i + "=" + i);
            if (i >= page && i % page == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");

//        System.out.println("ch=." + ch + ". code = " + codCh);

        for (int i = rusFrom; i < rusTo; i++) {
            System.out.print(" " + (char) i + "=" + i);
            if (i >= page && i % page == 0) {
                System.out.println("");
            }
        }
        System.out.println("");

//        from 63744 to 64106 chinese
//        1072 to  russia
//        65 90 english


    }
}
