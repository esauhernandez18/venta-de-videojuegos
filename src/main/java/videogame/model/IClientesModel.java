/*
* Hecho por: Heber Esaú Hernández Ramírez
* Fecha de creación: 05/12/22
* Descripción: Controlador para clientes
*/
package videogame.model;

import java.util.List;
import videogame.entity.Clientes;


public interface IClientesModel {
   /*
    * Metodo para insertar un cliente
    */
    public void insertarRegistro(Clientes clientes);
    /*
    * Metodo para consultar cliente 
    */
    public List<Clientes> obtenerRegistros();
    /*
    * Metodo para actualizar un cliente
    */
    public void actualizarRegistro (Clientes clientes);
    /*
    * Metodo para eliminar un cliente
    */
    public void eliminarRegistro (Clientes clientes);
}
