/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotablouri;

/**
 *
 * @author iurasun
 */
public class Marker {
    private String culoare;
    private int pret;

    public Marker(String culoare, int pret) {
        this.culoare = culoare;
        this.pret= pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Marker{" + "culoare=" + culoare + ", pret=" + pret + '}';
    }

    
    
    
       
}
