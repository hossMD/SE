/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Objects;

/**
 *
 * @author iurasun
 */
public class Avion {
    private int nrAripi;
    private String producator;

    public Avion(int nrAripi, String producator) {
        this.nrAripi = nrAripi;
        this.producator = producator;
    }

    
    
    public int getNrAripi() {
        return nrAripi;
    }

    public void setNrAripi(int nrAripi) {
        this.nrAripi = nrAripi;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.nrAripi;
        
        System.out.println("HC");
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       
        
        
        System.out.println("EQ");
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avion other = (Avion) obj;
        if (this.nrAripi != other.nrAripi) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        return "Avion{" + "nrAripi=" + nrAripi + ", producator=" + producator + '}';
    }
    
    
}
