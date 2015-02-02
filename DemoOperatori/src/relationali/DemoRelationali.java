package relationali;

/**
 *
 * @author iurasun
 */
public class DemoRelationali {

    public static void main(String[] args) {

        int n1 = 44;
        int n2 = 44;

        boolean b1 = false;
        System.out.println("" + n1 + " " + n2);
        System.out.println(" == " + (n1 == n2));
        System.out.println(" != " + (n1 != n2));
        System.out.println(" > " + (n1 > n2));
        System.out.println(" < " + (n1 < n2));
        System.out.println(" >= " + (n1 >= n2));
        System.out.println(" <= " + (n1 <= n2));

        if (n1 == n2) {
            System.out.println("egale cu  == ");
        }

        String str1 = "HELLO";
        String str2 = "HELLO";

        str1 = new String("HELLO");
        str2 = new String("HELLO");

        System.out.println(" == " + (str1 == str2));
        System.out.println(" equals " + str1.equals(str2));

        Lectie aL1 = new Lectie(60);
        Lectie aL2 = new Lectie(45);

        System.out.println(" == " + (aL1 == aL2));
        System.out.println(" equals " + (aL1.equals(aL2)) );
        System.out.println(" nu-s equale?  " + (!aL1.equals(aL2)) );
        
        System.out.println("l1 > l2 ?  " +  (aL1.getDurata() > aL2.getDurata())  );
        

    }
}
