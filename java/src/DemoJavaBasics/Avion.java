//Entitate

package DemoJavaBasics;

/**
 * Created by iucosoft7 on 1/21/15.
 */
public class Avion {
    private int nrDeAripi;
    private double putereMotor; //putere

    private static int nrAvioane;


    public Avion() {
        nrDeAripi = 2;
        putereMotor = 1;


    }

    public Avion(int nrDeAripi, double putereMotor) {
        this.nrDeAripi = nrDeAripi;
        this.putereMotor = putereMotor;

    }

    public int getNrDeAripi() {
        return nrDeAripi;
    }

    public void setNrDeAripi(int nrDeAripi) {
        this.nrDeAripi = nrDeAripi;
    }

    public double getPutereMotor() {
        return putereMotor;
    }

    public void setPutereMotor(double putereMotor) {
        this.putereMotor = putereMotor;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "nrDeAripi=" + nrDeAripi +
                ", putereMotor=" + putereMotor +
                '}';
    }

    public static int getNrAvioane() {
        return nrAvioane;

    }

    public static void setNrAvioane(int nrAvioane) {
        Avion.nrAvioane = nrAvioane;
    }
}
