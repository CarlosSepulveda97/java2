/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegados;

import entitys.Huracan;
import utils.Constantes;

/**
 *
 * @author carlo
 */
public class Calculador {

    public Calculador() {
    }
    
    
    public int clasificadorCategoria(Huracan huracan){
    
        int categoria = 0;
        try {
            if(huracan.getPresion()>=Constantes.MIN_PRESION_CATEGORIA_1 
            && huracan.getVelocidadViento()<Constantes.MAX_VIENTO_CATEGORIA_1
            && huracan.getVelocidadViento()>=Constantes.MIN_VIENTO_CATEGORIA_1    
            && huracan.getMarejadas()>=Constantes.MIN_MAREJADAS_CATEGORIA_1
            && huracan.getMarejadas()>Constantes.MAX_MAREJADAS_CATEGORIA_1){
            
            categoria=1;
        }
        else if (huracan.getPresion()>=Constantes.MIN_PRESION_CATEGORIA_2
                && huracan.getPresion()<Constantes.MAX_PRESION_CATEGORIA_2
                && huracan.getVelocidadViento()>=Constantes.MIN_VIENTO_CATEGORIA_2 
                && huracan.getVelocidadViento()< Constantes.MAX_VIENTO_CATEGORIA_2
                && huracan.getMarejadas()>= Constantes.MIN_MAREJADAS_CATEGORIA_2
                && huracan.getMarejadas()< Constantes.MAX_MAREJADAS_CATEGORIA_2){
            
            categoria=2;
        }
        else if (huracan.getPresion()>=Constantes.MIN_PRESION_CATEGORIA_3
                && huracan.getPresion()<Constantes.MAX_PRESION_CATEGORIA_3
                && huracan.getVelocidadViento()>=Constantes.MIN_VIENTO_CATEGORIA_3
                && huracan.getVelocidadViento()< Constantes.MAX_VIENTO_CATEGORIA_3
                && huracan.getMarejadas()>= Constantes.MIN_MAREJADAS_CATEGORIA_3
                && huracan.getMarejadas()< Constantes.MAX_MAREJADAS_CATEGORIA_3){
            
            categoria=3;
        }
        else if (huracan.getPresion()>=Constantes.MIN_PRESION_CATEGORIA_4
                && huracan.getPresion()<Constantes.MAX_PRESION_CATEGORIA_4
                && huracan.getVelocidadViento()>=Constantes.MIN_VIENTO_CATEGORIA_4 
                && huracan.getVelocidadViento()< Constantes.MAX_VIENTO_CATEGORIA_4
                && huracan.getMarejadas()>= Constantes.MIN_MAREJADAS_CATEGORIA_4
                && huracan.getMarejadas()< Constantes.MAX_MAREJADAS_CATEGORIA_4){
            
            categoria=4;
        }
        else if (huracan.getPresion()<Constantes.MAX_PRESION_CATEGORIA_5
                && huracan.getVelocidadViento()>=Constantes.MIN_VIENTO_CATEGORIA_5 
                && huracan.getMarejadas()>= Constantes.MIN_MAREJADAS_CATEGORIA_5){
            
            categoria=5;
        }else{
            categoria=0;
        }
        } 
        catch (Exception e) {
             System.out.println("Error en los parametros: " + e.getMessage());
        }
        
        return categoria;
    }
    
    
    public double calcularOjoHuracan(Huracan huracan){
        //ft km2
        double radioEnFt2 = Math.pow(huracan.getDiametro()/2,2);
        double radioEnKm2 = radioEnFt2*Math.pow(9.29,-8);
        double area = radioEnKm2 * Math.PI;
        return area;
    }
    
    public String calcularDesplazamiento(Huracan huracan){
        return "";
    }
    
    
    @Override
    public String toString() {
        return "Calculador de categoria, área y desplazamiento";
    }
    
    
}
