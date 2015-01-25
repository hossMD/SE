package homeWork;

/**
 * Created by MaRV on 1/20/2015.
 */
public class CharsForChoose {
    public static void main(String[] args) {

        int page=12;

        char ch = 65;
        ch='A';
        int codCh=ch;
        System.out.println("ch=."+ch+". code = "+codCh);

        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.print(" "+(char)i+"="+i);
            if(i>=page && i%page == 0){
                System.out.println("");
            }
        }
        System.out.println("");

//        from 63744 to 64106 chinese
//        1072 to 1103 russia
//        65 90 english


    }
}
