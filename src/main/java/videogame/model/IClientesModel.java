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
    * Metodo para insertar un usuario a la BD
    */
    public void insertarRegistro(Clientes clientes);
    /*
    * Metodo para consultar usuarios de la BD
    */
    public List<Clientes> obtenerRegistros();
    /*
    * Metodo para actualizar un usuario a la BD
    */
    public void actualizarRegistro (Clientes clientes);
    /*
    * Metodo para eliminar un usuario a la BD
    */
    public void eliminarRegistro (Clientes clientes);
}
