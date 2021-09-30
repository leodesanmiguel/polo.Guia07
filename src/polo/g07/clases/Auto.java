/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.g07.clases;

/**
 *
 * @author Leonardo Martinez
 */
public class Auto {
    

    
    private String color;
    private String marca;
    private String modelo;
    private String patente;
    private int puertas;

    public Auto() {

    }

    public Auto(String color, String marca, String modelo, String patente, int puertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.puertas = puertas;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Auto: {" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + '}';
    }

    
    
    
}
