/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationali;

/**
 *
 * @author iurasun
 */
public class Lectie {
    private int durata;

    public Lectie() {
      durata = 180;
    }

    
    public Lectie(int durata) {
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    
    //twiks

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.durata;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lectie other = (Lectie) obj;
        if (this.durata != other.durata) {
            return false;
        }
        return true;
    }
    

    
    
    
    @Override
    public String toString() {
        return "Lectie{" + "durata=" + durata + '}';
    }
    
}
