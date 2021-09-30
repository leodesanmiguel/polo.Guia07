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
public class Principal {
    
    int[] animals = new int[5];
    
    Mascota[] mascotas = new Mascota[animals.length];
    
    boolean[] sexo = {true, true, true, false, false};
    
    String[][] perros = {
        {"Boby", "Rony", "Ringo", "Chola", "Redess"},
        {"Beagle", "Pastor Aleman", "Golden Retriever", "Shar Pai", "Setter Inglés"},
        {"Marron claro con manchas", "Marron y negro", "Dorado", "Beige", "Negra"},
        {"corto", "corto", "largo", "corto", "largo"},
        {"", "", "", "", ""},
    };
    String[][] gatos = {
        {"Tigre", "Chino", "Turco", "Luna", "Iris"},
        {"Bengalí", "Siamés", "Persa", "Angora", "Carey"},
        {"atigrado blanco y negro", "beige y marron oscuro", "negro y blanco", "azul", "negro, naranja y blanco"},
        {"corto", "fino y corto", "abundante pelaje", "largo", "corto"},
        {"", "", "", "", ""},
    };    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Principal guia7 = new Principal();
        
        //guia7.muestraAutos();
        
        //guia7.muestraMuebles();

        guia7.muestraMascotas();
        
        
        
    }
    
    
    /**
     * Ejercicio a: Autos
     */
    
    private void muestraAutos(){
    Auto auto1 = new Auto();
        auto1.setColor("Gris");
        auto1.setMarca("Fiat");
        auto1.setModelo("Toro");
        auto1.setPatente("AA 345 DF");
        auto1.setPuertas(2);
       
        
        Auto auto2 = new Auto("Negro", "Ford", "Focus", "AB 023 AU", 4);
        Auto auto3 = new Auto("Rojo", "Renault", "Duster", "AD 132 LM", 5);
        Auto auto4 = new Auto("Blanco", "Chevrolet", "Corsa", "KJM 568", 2);
        
        Auto auto5 = new Auto();
        
        System.out.println(auto1 + "\n" + auto2 + "\n" + auto3 + "\n" + auto4 + "\n" + auto5);        
    }
    
    
    /**
     * Ejercicio b: Muebles
     */
    private void muestraMuebles(){
        Mueble mue1 = new Mueble("Ropero", 3, "Melamina");
        Mueble mue2 = new Mueble("Alacena", 3, "Alumnio");
        Mueble mue3 = new Mueble("Ropero", 3, "Melamina y Vidrio");
        
        System.out.println("\n"+ mue1 + "\n"+ mue2 + "\n"+ mue3 );
        
        mue1.setMaterial("madera");
        mue2.setMaterial("madera");
        mue3.setMaterial("madera");
        
        System.out.println("\n"+ mue1 + "\n"+ mue2 + "\n"+ mue3 );
    }
    
    
    /**
     * Ejercicio c: Mascotas
     */
    
    private void muestraMascotas(){
        boolean unoyuno = true;
        for (int i = 0; i < mascotas.length; i++) {
            if (unoyuno){
                mascotas[i] = new Mascota(unoyuno, 
                        perros[0][i], perros[1][i], sexo[i],
                        perros[2][i], perros[3][i]);
                unoyuno=false;
            }else{
                mascotas[i] = new Mascota(unoyuno, 
                        gatos[0][i], gatos[1][i], sexo[i],
                        gatos[2][i], gatos[3][i]);
                unoyuno=true;
            }
        }

        // muestra lista de mascotas
        System.out.println("\nMuestra lista de Mascotas");
        for (int i = 0; i < animals.length; i++) {
            //int animal = animals[i];
            System.out.println(mascotas[i]);
        }
        
        mascotas[2].setNombre("Peluche");
        mascotas[4].setNombre("Chicha");

        // revisa si esta cambiado y lo muestra
        System.out.println("\n\nMuestra los cambiados");
        for (int i = 0; i < animals.length; i++) {
            
            if (mascotas[i].isCambio()){
                System.out.println(mascotas[i]);
                
            }
        }

        // Muestra mascotas perros
        System.out.println("\n\nMuestra solo los perros");
        for (int i = 0; i < animals.length; i++) {
            
            if (mascotas[i].esPerro()){
                System.out.println(mascotas[i]);
            }
        }        
    }
    
    
    
}
