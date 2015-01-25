
package demostringbuilderseara;

/**
 *
 * @author iurasun
 */
public class Avion {
    private   int x;
     
    public Avion() {
       
        x=2;
    }

    public Avion(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Avion{" + "x=" + x + '}';
    }

    

    
    
    
    
}
