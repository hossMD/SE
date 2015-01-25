/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demovariabilemetodeclase;

/**
 *
 * @author iurasun
 */
public class Pix {

    //caracteristici - proprietati - variabile - campuri java
    private String culoare;
    private String material; // platic metal        
    private int greutate;// grame
    private int timp;// minute de exploatare


    public void scrie(String text){
        System.out.println("Am scris cu pixul textul: "+text);
        System.out.println("cluloare "+culoare);
        System.out.println("avea greutatea "+greutate);
    }

    public void setCuloare(String culoareNoua){
        culoare=culoareNoua;
    }

    public String getCuloare(){
        return culoare;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public int getTimp() {
        return timp;
    }

    public void setTimp(int timp) {
        this.timp = timp;
    }





}
