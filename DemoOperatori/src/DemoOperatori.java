public class DemoOperatori {
    public static void main(String[] args) {
        System.out.println("demo operatori");
        int nr1 =6;
        int nr2= 5;


        double   nrD1 =6.6;
        double   nrD2= 5.4;

        System.out.println(String.format("%d %d %d" ,nr1, nr2,nr1/nr2));


        System.out.println(String.format("%d %s %d = %d" ,nr1, "streeng", nr2, nr1%nr2));





        System.out.println(String.format("%f %f %f" ,nrD1, nrD2,nrD1/nrD2));
//        System.out.println(String.format("%d %d %d" ,nr1, nr2,nr1/nr2));

    }
}
