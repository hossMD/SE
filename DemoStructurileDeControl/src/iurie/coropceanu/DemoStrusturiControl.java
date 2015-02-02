package iurie.coropceanu;

/**
 *
 * @author iurasun
 */
public class DemoStrusturiControl {

    public static void main(String[] args) {

        //demoIf();
       // demoIfElse();
      //  demoIfElseIf();
        
         demoIfElseIfElse();

    }

    private static void demoIf() {
        System.out.println("demo if");

        boolean c1 = true;
        boolean c2 = false;
        boolean c3 = true;

        if (c1) {
            System.out.println("din if 1");
        }

        if (c2) {
            System.out.println("din if 2");
        }

        if (c3) {
            System.out.println("din if 3");
        }

        //System.out.println("din if 2");  
        System.out.println("dupa if in orice caz");
    }

    private static void demoIfElse() {
        System.out.println("demo if else");

        boolean c = false;

        if (c) {
            System.out.println("if1");
            System.out.println("if2");
        } else {
            System.out.println("else");
            ; // nimic de facut aici
        }
        
        System.out.println("text dupa if-else in orice caz");

    }

    private static void demoIfElseIf() {
        System.out.println("demo if else if");        
        
        boolean c1=false;
        boolean c2=false;
        boolean c3=false;
        boolean c4=false;
        boolean c5=false;
        
        
        if (c1) {
            System.out.println("c1");
        } else if(c2) {
            System.out.println("c2");
        }else if(c3) {
            System.out.println("c3");
        }else if(c4) {
            System.out.println("c4");
        }else if(c5) {
            System.out.println("c5");
        }
        
        System.out.println("sigur dupa if - else -if");
    }

    private static void demoIfElseIfElse() {
        System.out.println("demo if else if ELSE");        
        
        boolean c1=false;
        boolean c2=false;
        boolean c3=false;
        boolean c4=false;
        boolean c5=false;
        
        
        if (c1) {
            System.out.println("c1");
        } else if(c2) {
            System.out.println("c2");
        }else if(c3) {
            System.out.println("c3");
        }else if(c4) {
            System.out.println("c4");
        }else if(c5) {
            System.out.println("c5");
        }else{
            System.out.println("in toate celelalte cazuri din ifuri");
        }
        
        System.out.println("sigur dupa if - else -if");
    }

}
