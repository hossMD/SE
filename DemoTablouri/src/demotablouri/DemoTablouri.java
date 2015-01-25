
package demotablouri;

/**
 *
 * @author iurasun
 */
public class DemoTablouri {

    public static void main(String[] args) {

        
        int[] numere = { 22,33,44,55, 66 };
        System.out.println("lungimea tabloului = "+numere.length);
        
        numere =new  int[]{23, 45};
        System.out.println("lungimea tabloului = "+numere.length);
        
        numere = new  int[4] ;
       
        numere[0] = 1;
        numere[1] = 11;
        numere[2] = 111;
        numere[3] = 1111;
        
        
        numere[2] = 222;
       
      //  numere[4] = 222; ArrayIndexOutOfBoundException
        
        System.out.println("elementul al 3-lea "+numere[2]);
        
        Marker[] markere=new Marker[3];
        
        markere[0] = new Marker("verde", 12);
        markere[1] = new Marker("rosu", 11);
        markere[2] = new Marker("negru", 22);
                

        int suma=0;
        
        for (int i = 0; i < markere.length; i++) {
            
            System.out.println(markere[i].getCuloare()+" "+markere[i].getPret());
            suma = suma+markere[i].getPret();
        }
        
        System.out.printf("suma toatala = "+suma);
        
        
    }
    
}
