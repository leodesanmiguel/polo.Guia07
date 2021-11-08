/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Leo Martinez
 */
public class Controladora {

    /**
     * Usa una controladora de Persistencia para enviar todas las necesidades de
     * acceso a datos
     */
    ControladoraPersistencia ctrlPersiste = new ControladoraPersistencia();

    /**
     * guardarCan() --> Recibe los datos de la mascota y los envia a la
     * controladora de persistencia para que los guarde
     *
     * @param can
     * @return 
     */
    public boolean guardarCan(Mascota can) {

        return ctrlPersiste.CrearMascota(can);

    }

    /**
     * proximoCliente() --> recupera de la persistencia el último cliente y le
     * suma uno.De esta forma siempre agrega uno mas.
     *
     *
     * @return
     */
    public int proximoCliente() {
        return ultimoNroCliente() + 1;
    }

    /**
     * ultimoCliente() --> recupera la cantidad de clientes
     *
     * @return
     */
    public int nroClientes() {
        return ctrlPersiste.contidadClientes();
    }

    /**
     * ultimoNrocliente()  --->  debe hacer una recorrida por
     * todas las mascotas y ver que nro de cliente sale.cuando graba lo hace en cualquier lado.
     * @return
     */
    public int ultimoNroCliente() {

        int max = -1;

        List<Mascota> todas = ctrlPersiste.LeerlListaMascotas();

        for (Mascota can : todas) {
            if (can.getNumCliente() > max) {
                max = can.getNumCliente();
            }
        }
        return max;
    }
}
