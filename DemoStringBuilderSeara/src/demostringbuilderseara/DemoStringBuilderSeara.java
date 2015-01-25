package demostringbuilderseara;

/**
 *
 * @author iurasun
 */
public class DemoStringBuilderSeara {
    public static void main(String[] args) {
      
//      Avion ref1=new Avion();
//      Avion ref2=new Avion(3242);
//      
//     
//      ref1.setX(44);
//      ref1.setX(44);
//      ref1.setX(44);ref1.setX(44);ref1.setX(44);
//      
//      ref1=null;
        System.out.println("demoStringBuilder");
      
        StringBuilder sb = new StringBuilder();//16
        info(sb);
        
        sb.append("12345678901234561234");
        info(sb);
        
        sb.append("A123456789012345612Z");
        info(sb);
        
        sb.append(23.45);
        info(sb);
        
        
        sb.insert(sb.length()/2, "QWERTY");
        info(sb);
        
        
        sb.delete(10, 20 );  //  [  ] [ )
        info(sb);
        
        sb.replace(10, 11, "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        info(sb);
        
        
        StringBuilder sb2 = sb.reverse();
        info(sb2);
        info(sb);
        
       String subString = sb.substring(2);
        System.out.println("text extras "+subString);
        info(sb);
        
        sb=new StringBuilder("In moldova sunt moldoveni");
        String deCautat="old";
        
        int lungimeaTextului = deCautat.length();
        
        
        int index = sb.indexOf(deCautat);
        
        System.out.println(sb.toString());
        System.out.println(deCautat);
        System.out.println("index="+index);

        int indiceNou = index+lungimeaTextului;
        
        index = sb.indexOf(deCautat, indiceNou);
        
    }

    private static void info(StringBuilder sb) {
        System.out.println("sb=["+sb.toString()+"] lungimea = "+sb.length() + " capacitatea = "+sb.capacity());
    }
    
}
