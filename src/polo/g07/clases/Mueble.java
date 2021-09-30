/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.g07.clases;

/**
 *
 * @author profl
 */
public class Mueble {
    
    private String nombre;
    private double alto;
    private double ancho;
    private int cantidad;
    private String material;

    public Mueble() {
    }

    public Mueble(String nombre,  int cantidad, String material) {
        this.nombre = nombre;
        this.alto = 1.7;
        this.ancho = 0.9;
        this.cantidad = 5;
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Mueble: {" + "nombre=" + nombre + ", material=" + material + '}';
    }
    
    
    
    

    
}
