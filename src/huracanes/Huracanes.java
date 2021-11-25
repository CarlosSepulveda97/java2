/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huracanes;

import delegados.Calculador;
import entitys.Huracan;
import java.util.ArrayList;
import utils.Impresora;

/**
 *
 * @author carlo
 */
public class Huracanes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        ArrayList<Double> ubicacionGeografica = new ArrayList<>();
        ubicacionGeografica.add(-16.50367313339084);
        ubicacionGeografica.add(-68.16254627856979);    
        Huracan huracan = new Huracan(946, 115, 10, ubicacionGeografica, "35° SUR", 1.5F, 30, "66%", 25);
        Calculador calculador = new Calculador();
        int categoria = calculador.clasificadorCategoria(huracan);
        double area = calculador.calcularOjoHuracan(huracan);
        impresora.imprimir(huracan, categoria, area);
        
        
    }
    
}