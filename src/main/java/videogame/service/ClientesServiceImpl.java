/*
* Hecho por: Heber Esaú Hernández Ramírez
* Fecha de creación: 05/12/22
* Descripción: Controlador para clientes
*/
package videogame.service;

import java.util.List;
import videogame.entity.Clientes;
import videogame.model.IClientesModel;
import videogame.model.IClientesModelImpl;

public class ClientesServiceImpl implements IClientesService{
   private IClientesModel model = new IClientesModelImpl();
    
    /*
    * Metodo para insertar un usuario a la BD
    */
    @Override
    public void insertarRegistro(Clientes clientes) {
        model.insertarRegistro(clientes);
    }
    
    /*
    * Metodo para consultar usuarios de la BD
    */
    @Override
    public List<Clientes> obtenerRegistros() {
        return model.obtenerRegistros();
    }
    
    /*
    * Metodo para actualizar un usuario a la BD
    */
    @Override
    public void actualizarRegistro(Clientes clientes) {
        model.actualizarRegistro(clientes);
    }
    
    /*
    * Metodo para eliminar un usuario a la BD
    */
    @Override
    public void eliminarRegistro(Clientes clientes) {
        model.eliminarRegistro(clientes);
    }
    
}

