package DemoStringBuilder;

/**
 * Created by iucosoft7 on 1/23/15.
 */
public class DemoStringBUilderSeara {
    public static void main(String[] args) {
        System.out.println("demo ");


        StringBuilder sb = new StringBuilder();
        info(sb);
        sb.append("1234567890");
        info(sb);

//        sb.append("1wec23234567890");
//        info(sb);

        sb.insert(0, "qwerty");
        info(sb);

        sb.insert(sb.length(), "qwerty");
        info(sb);

        sb.delete(0, 2);
        info(sb);

        StringBuilder sb2 = sb.reverse();
        info(sb2);
        info(sb.reverse());

        sb.reverse();
        info(sb);

        String subString = sb.substring(2);
        System.out.println("test egal "+subString);
        info(sb);





    }

    private static void info(StringBuilder sb) {
        System.out.println("sb=["+sb.toString()+"] lungimea = " +sb.length()+"capacitatea "+sb.capacity());
    }
}
