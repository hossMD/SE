<<<<<<< HEAD
//package demostring;

=======
>>>>>>> f5afb522a03bde5013fb305fed733aef61b767ec
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iurasun
 */
public class DemoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        demoMetodeStatice();
<<<<<<< HEAD
        //      demoConstructori();
=======
  //      demoConstructori();
>>>>>>> f5afb522a03bde5013fb305fed733aef61b767ec
        demoMetodeDeInstanta();
    }

    private static void demoMetodeStatice() {
        System.out.println("demo metode statice:");
<<<<<<< HEAD

        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(45));
        System.out.println(String.valueOf(23.45));

        char[] data={  'A','B' ,'C' ,'D' };
        System.out.println(String.copyValueOf(data));

        String str="TEXTUL Meu";
        System.out.println(String.format("|%-20s|%-6d|%-8.2f|",str, 55, 77.12345678));
        str=String.format("|%-20s|%-6d|%-8.2f|",str, 55, 77.12345678);
        // JOptionPane.showMessageDialog(null, str);



    }

    private static void demoConstructori() {

        String str = "ABC"; // new ...   // 1   -  1 obj
        str = new String();
        str = new String("ABC");         //3     - 2 obj

        str=new String("AAAAAA".getBytes());

        StringBuilder sb= new StringBuilder("fasdf");
        str=new String(sb);

=======
        
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(45));
        System.out.println(String.valueOf(23.45));
        
        char[] data={  'A','B' ,'C' ,'D' };
        System.out.println(String.copyValueOf(data));
        
        String str="TEXTUL Meu";
        System.out.println(String.format("|%-20s|%-6d|%-8.2f|",str, 55, 77.12345678));
        str=String.format("|%-20s|%-6d|%-8.2f|",str, 55, 77.12345678);
       // JOptionPane.showMessageDialog(null, str);
         
        
        
    }

    private static void demoConstructori() {
          
        String str = "ABC"; // new ...   // 1   -  1 obj
        str = new String();
        str = new String("ABC");         //3     - 2 obj
        
        str=new String("AAAAAA".getBytes());
        
        StringBuilder sb= new StringBuilder("fasdf");
        str=new String(sb);
        
>>>>>>> f5afb522a03bde5013fb305fed733aef61b767ec
        char[] chars={  'A','B' ,'C' ,'D' };
        str=new String(chars, 1, 2);
        System.out.println("str = "+str);
    }

    private static void demoMetodeDeInstanta() {
        System.out.println("demo metode de instanta:");
<<<<<<< HEAD

        String str="ABC";

        char c = str.charAt(1);
        System.out.println("c="+c);

        //  arataCaractere("SALUT LUME!");


        int code =  str.codePointAt(1);
        System.out.println("cod = "+code);

        System.out.println(str.codePointBefore(1));


        System.out.println(str.codePointCount(1, 3));

        String str1="aBZ";
        String str2="aBGNHNDFGNDFSGNDFcgnaBZ";

        int rez = str1.compareTo(str2);
        System.out.println("rez="+rez);

        System.out.println( "nu-s egale? "+  !str1.equals(str2) );

        //str==str2
        // str1.equals(rez)

        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        System.out.println(str2.startsWith(str1));
        System.out.println(str2.endsWith(str1));



        System.out.println("str2="+str2);
        System.out.println("str1="+str1);

        String str3 = str2+str1;  //str2.concat(str1);

        str2="abc def";
        str1=    "def";
        System.out.println("str2="+str2);
        System.out.println("str1="+str1);

        System.out.println("str3="+str3);


        System.out.println("HC 2 ="+str2.hashCode());

        System.out.println("contains "+str2.contains(str1));
        System.out.println("pozitia "+str2.indexOf(str1));

        Object obj=new Object();

        System.out.println("toString()  = "+obj.toString());

//        String message = String.join(" ", "Java", "is", "cool");

//        System.out.println(message);


        int x=5;
        int y=7;

        if(x != 7){

        }


=======
        
        String str="ABC";
        
       char c = str.charAt(1);
        System.out.println("c="+c);
        
      //  arataCaractere("SALUT LUME!");
        
        
        int code =  str.codePointAt(1);
        System.out.println("cod = "+code);
        
        System.out.println(str.codePointBefore(1));
        
        
        System.out.println(str.codePointCount(1, 3));
        
        String str1="aBZ";
        String str2="aBGNHNDFGNDFSGNDFcgnaBZ";
        
        int rez = str1.compareTo(str2);
        System.out.println("rez="+rez);
        
        System.out.println( "nu-s egale? "+  !str1.equals(str2) );
        
         //str==str2 
        // str1.equals(rez)
        
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
        
        System.out.println(str2.startsWith(str1));
        System.out.println(str2.endsWith(str1));
        
        
        
        System.out.println("str2="+str2);
        System.out.println("str1="+str1);
        
        String str3 = str2+str1;  //str2.concat(str1);
        
         str2="abc def";
         str1=    "def";
        System.out.println("str2="+str2);
        System.out.println("str1="+str1);
        
        System.out.println("str3="+str3);
        
        
        System.out.println("HC 2 ="+str2.hashCode());
        
        System.out.println("contains "+str2.contains(str1));
        System.out.println("pozitia "+str2.indexOf(str1));
        
        Object obj=new Object();
        
        System.out.println("toString()  = "+obj.toString());
        
         String message = String.join(" ", "Java", "is", "cool");
         
         System.out.println(message);
         
         
        int x=5;
        int y=7;
        
        if(x != 7){
        
        }
        
        
>>>>>>> f5afb522a03bde5013fb305fed733aef61b767ec
        String text="Salut lume ce mai faci";
        String[] cuvinte=text.split(" ");
        for (int i = 0; i < cuvinte.length; i++) {
            System.out.println(cuvinte[i]);
<<<<<<< HEAD

        }



=======
            
        }
        
        
        
>>>>>>> f5afb522a03bde5013fb305fed733aef61b767ec
    }

    private static void arataCaractere(String str) {

<<<<<<< HEAD

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

=======
        
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
          
>>>>>>> f5afb522a03bde5013fb305fed733aef61b767ec
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(DemoString.class.getName()).log(Level.SEVERE, null, ex);
            }
<<<<<<< HEAD

        }
        System.out.println("");

    }

=======
          
        }
        System.out.println("");
        
    }
    
>>>>>>> f5afb522a03bde5013fb305fed733aef61b767ec
}

