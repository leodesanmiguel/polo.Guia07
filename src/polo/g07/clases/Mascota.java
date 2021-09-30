/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.g07.clases;

/**
 *
 * @author Leo Martinez
 */
public class Mascota {
    
    private String nombre;
    private String raza;
    private String especie;
    private boolean sexo;
    private String color;
    private String pelaje;
    private boolean cambio;

    public Mascota() {
    }

    public Mascota(boolean esPerro, String nombre, String raza
            , boolean sexo, String color, String pelaje) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.cambio = false;
        asignarOtros(esPerro);
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.cambio = true;
    }

    public boolean isCambio() {
        return cambio;
    }
    
    public boolean esPerro(){
        
        return especie.equals("Canis familiaris");
    }
    
    
    private void asignarOtros(boolean p){
        
        if (p){
            especie = "Canis familiaris";
        }else{
            especie = "Felis silvestris catus";
        }
            
        
    }

    @Override
    public String toString() {
        String seXo= "Macho";
        if (!this.sexo){
            seXo= "Hembra";
        }
        return "\nMascota: {" + "nombre=" + nombre + 
                ", raza=" + raza + ", especie=" + especie + 
                ", sexo=" + seXo + '}';
    }
    
    
    
}
