/**
 * La controladora permite administrar los datos entre la interfaz y la 
 * persistencia. 
 * destacado: Proximo Cliente.
 * Como el nro de cliente es manejado directamente por la persistencia
 * revisa cual será el próximo cliente y le da un posible nuevoo numero.
 * 
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
     * @param can objeto que se guarda 
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
     * @return El proximo Cliente
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
     * todas las mascotas y encontrar cual es el nro de cliente mas alto.
     * 
     * DETALLE: 
     *      Cuando graba, lo hace en cualquier lado registro de la tabla. ???
     *      No afecta por que no va a utilizar para un nuevo registro un 
     *      número que haya salido. Utiliza el próximo al mayor.
     * 
     * @return El último cliente encontrado
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
