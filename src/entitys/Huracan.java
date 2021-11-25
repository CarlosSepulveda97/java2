/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Huracan {
    
    private int presion; 
    private int velocidadViento; 
    private int marejadas; 
    private ArrayList<Double> ubicacionGeografica; //latitud y longitud
    private String direccion;// 35°SUR
    private float diametro;
    private float temperatura;
    private String humedad;
    private float velocidadDesplazamiento;

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    
    public ArrayList<Double> getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(ArrayList<Double> ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getVelocidadDesplazamiento() {
        return velocidadDesplazamiento;
    }

    public void setVelocidadDesplazamiento(float velocidadDesplazamiento) {
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }
 
    public Huracan() {
    }

    
    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public int getVelocidadViento() {
        return velocidadViento;
    }

    public int getMarejadas() {
        return marejadas;
    }

    public void setVelocidadViento(int velocidadViento) {
        this.velocidadViento = velocidadViento;
    }

    public void setMarejadas(int marejadas) {
        this.marejadas = marejadas;
    }

    public Huracan(int presion, int velocidadViento, int marejadas, ArrayList<Double> ubicacionGeografica, String direccion, float diametro, float temperatura, String humedad, float velocidadDesplazamiento) {
        this.presion = presion;
        this.velocidadViento = velocidadViento;
        this.marejadas = marejadas;
        this.ubicacionGeografica = ubicacionGeografica;
        this.direccion = direccion;
        this.diametro = diametro;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

     
    @Override
    public String toString(){
        return "Huracan con ubicacion Latitud:" + this.ubicacionGeografica.get(0) + ", Longitud:" + this.ubicacionGeografica.get(1) +
                ", con velocidad de desplazamiento de: " + this.velocidadDesplazamiento + "[mph] , con direccion " + this.direccion +".";
    }
    
    
    
    
}
