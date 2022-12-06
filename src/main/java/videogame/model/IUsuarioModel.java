/*
* Hecho por: Heber Esaú Hernández Ramírez
* Fecha de creación: 05/12/22
* Descripción: Controlador para clientes
*/
package videogame.model;

import java.util.List;
import videogame.entity.Usuario;

public interface IUsuarioModel {
    /*
    * Metodo para insertar un usuario
    */
    public void insertarRegistro(Usuario usuario);
    /*
    * Metodo para consultar usuarios
    */
    public List<Usuario> obtenerRegistros();
    /*
    * Metodo para actualizar un usuario
    */
    public void actualizarRegistro (Usuario usuario);
    /*
    * Metodo para eliminar un usuario
    */
    public void eliminarRegistro (Usuario usuario);
}
