
package logical;

/**
 *
 * @author iurasun
 */
public class DemoLogici {
    
    
    public static void main(String[] args) {
        
        //  && &     || |       !
        
     //   demoAnd();
       // demoOr();
        demoNot();
        
    }

    private static void demoAnd() {
        System.out.println(" &&  & ");
         //(T) && (T)  = T
        
        String parola=null;
        
        int x=55;
        if(   parola !=null      &&    ++x > 0){
            System.out.println("am intrat in contul meu pe site");
            System.out.println("if x="+x);
        }else{
            System.out.println("`nu poti intra.. ceva gresit");
            System.out.println("else x="+x);
        }
        
        
    }

    private static void demoOr() {
        
        System.out.println(" ||  | ");
         //(T) || (T)  = T
         //(T) || (F)  = T
         //(F) || (T)  = T
         //(F) || (F)  = F
        
        
        
        int x=55;
        int y=77;
        
        // se dau 2 numere cel putin 1 sa fie pozitiv
        
        if(   x>0    ||    y++ > 0){
            System.out.println("avem ubn numar ++");
            System.out.println("if y="+y);// 78
        }else{
            System.out.println("nu avem numar negativ");
            System.out.println("else x="+x);
        }
    }

    private static void demoNot() {
     
         System.out.println(" demo ! ");
         //!(T)    = F
         //!(F)    = T
         
         
         
        
        
        int x=-55;
        int y=77;
        
        // se dau 2 numere cel putin 1 sa fie pozitiv
        
        if(   !(x>0)   ){
            System.out.println("! ");
           
        }else{
            
            System.out.println(" ! nu a mers");
        }
        
        
    }
}
