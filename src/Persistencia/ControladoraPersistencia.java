package Persistencia;

import Logica.Mascota;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Leo Martinez
 */
public class ControladoraPersistencia {

    MascotaJpaController jpaMascota = new MascotaJpaController();
    //private List<Mastota> new ArrayList<>();

    // ALTA DE UNA MASCOTA
    public boolean CrearMascota(Mascota can) {
        try {
            jpaMascota.create(can);
            return true;
        } catch (Exception e) {
            System.out.println("Excepción de ALTAS de mascotas: \n" + e);

        }
        return false;
    }

    // LECTURA DE LAS MASCOTAS
    public List<Mascota> LeerlListaMascotas() {

        try {
            return jpaMascota.findMascotaEntities();
        } catch (Exception e) {
            System.out.println("Excepción BUSQUEDA de mascotas: \n" + e);
        }

        return null;
    }

    //  Busca una mascota para mostrar
    public Mascota verUnaMascota(Mascota can) {

        try {
            return jpaMascota.findMascota(can.getNumCliente());
        } catch (Exception e) {
            System.out.println("Excepción BUSQUEDA de UNA mascotas: \n"
                    + "Mascota :" + can + "\n" + e);
        }
        return null;
    }

    /**
     * proximoCliente() --> cual es el proximo nro de cliente lo tiene que
     * encontrar a partir del ultimo
     *
     *
     */
    public void listaMascotas() {
        List<Mascota> perros = new ArrayList<Mascota>();
        for (int j = 0; j < contidadClientes(); j++) {
            perros = jpaMascota.findMascotaEntities(j, 1);
            System.out.println("Perros : " + perros);
        }
        
    }



//  muestra la cantidad de mascotas que contiene 
public int contidadClientes() {
        try {
            return jpaMascota.getMascotaCount();

        } catch (Exception e) {
            System.out.println("Excepción en la CANTIDAD de mascotas: \n"
                    + "PROBLEMA :" + e);
        }
        return 0;
    }

    //  ELIMINAR UNA MASCOTA
    public void EliminaMascota(int id) {
        try {
            jpaMascota.destroy(id);
        } catch (NonexistentEntityException e) {
            System.out.println("Excepción ELIMINAR una mascota por ID: \n" + e);

        }
    }

    public void EliminaMascota(Mascota can) {
        try {
            jpaMascota.destroy(can.getNumCliente());
        } catch (NonexistentEntityException e) {
            System.out.println("Excepción ELIMINAR una mascota enviando la Mascota: \n" + e);

        }
    }

    //  Mostrar cantidad de Mascotas
    public void cantidaMascotas() {
        try {

        } catch (Exception e) {
            System.out.println("Excepción CANTIDAD de Mascotas: \n" + e);
        }
    }

    //  MODIFICAR ALGUN DATO DE LA MASCOTA
}
