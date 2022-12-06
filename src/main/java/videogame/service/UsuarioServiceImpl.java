/*
* Hecho por: Heber Esaú Hernández Ramírez
* Fecha de creación: 05/12/22
* Descripción: Controlador para clientes
*/

package videogame.service;

import java.util.List;
import videogame.entity.Usuario;
import videogame.model.IUsuarioModel;
import videogame.model.IUsuarioModelImpl;

public class UsuarioServiceImpl implements IUsuarioService {

    private IUsuarioModel model = new IUsuarioModelImpl();
    
    /*
    * Metodo para insertar un usuario
    */
    @Override
    public void insertarRegistro(Usuario usuario) {
        model.insertarRegistro(usuario);
    }
    
    /*
    * Metodo para consultar usuarios 
    */
    @Override
    public List<Usuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
    /*
    * Metodo para actualizar un usuario
    */
    @Override
    public void actualizarRegistro(Usuario usuario) {
        model.actualizarRegistro(usuario);
    }
    
    /*
    * Metodo para eliminar un usuario 
    */
    @Override
    public void eliminarRegistro(Usuario usuario) {
        model.eliminarRegistro(usuario);
    }
    
}
