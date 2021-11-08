package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Leo Martinez
 */

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int numCliente;
    
    @Basic
    String nombrePerro;
    String raza;
    String color;
    boolean esAlergico;
    boolean tieneAtencionEpecial;
    String nombreDueño;
    String celularDueño;
    String observaciones;

    public Mascota() {
    }

    public Mascota(int numCliente, String nombrePerro, String raza, String color, boolean esAlergico, boolean tieneAtencionEpecial, String nombreDueño, String celularDueño, String observaciones) {
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.esAlergico = esAlergico;
        this.tieneAtencionEpecial = tieneAtencionEpecial;
        this.nombreDueño = nombreDueño;
        this.celularDueño = celularDueño;
        this.observaciones = observaciones;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(boolean esAlergico) {
        this.esAlergico = esAlergico;
    }

    public boolean isTieneAtencionEpecial() {
        return tieneAtencionEpecial;
    }

    public void setTieneAtencionEpecial(boolean tieneAtencionEpecial) {
        this.tieneAtencionEpecial = tieneAtencionEpecial;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getCelularDueño() {
        return celularDueño;
    }

    public void setCelularDueño(String celularDueño) {
        this.celularDueño = celularDueño;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mascota: " + nombrePerro + "  (" + raza + " "+  color +  ") -  "  
          + "\n   Dueño: " + nombreDueño 
          + "\n   observaciones: " + observaciones + "\n";
    }
    
    

}
