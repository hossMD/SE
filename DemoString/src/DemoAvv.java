/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iurasun
 */
public class DemoAvv {
    public static void main(String[] args) {
        
        Avion av1=new Avion(2, "AMER");
        Avion av2=new Avion(2, "AMER");
        
        
        if(av1.equals(av2)){
            System.out.println("eglae");
        }else{
            System.out.println("diferite");
        }
        
        
    }
}
