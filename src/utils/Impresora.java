/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entitys.Huracan;

/**
 *
 * @author carlo
 */
public class Impresora {

    public Impresora() {
    }
    
    
    public void imprimir(Huracan huracan, int categoria, double ojo){
        
        System.out.println(huracan);
        if(categoria!=0){
            System.out.println("Categoria: " + categoria);
        }else{
            System.out.println("No se pudo identificar la categoria");
        }
        System.out.println("El area del ojo del huracan es de: " + ojo + "[Km^2]");
        
    }

    @Override
    public String toString() {
        return "Impresora de información";
    }
    
    
    
    
    
}
