package JdataType;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

/**
 * Created by iucosoft7 on 1/21/15.
 */



public class JavaType {

    int x;
    {
        System.out.println("arata x "+x);
        x =55;
     }
    public static void main(String[] args) {
        JavaType refObj = new JavaType();
        System.out.println("x= " + refObj.x);

//        refObj.x =66;

        int y = 88;
        System.out.println("y=" + y);


        String tt = "tt";
        System.out.print("qwe= "+tt);



    }
}
