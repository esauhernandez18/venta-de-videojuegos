/*
* Hecho por: Heber Esaú Hernández Ramírez
* Fecha de creación: 05/12/22
* Descripción: Controlador para clientes
*/
package videogame.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import sun.print.resources.serviceui;
import videogame.entity.Clientes;
import videogame.service.IClientesService;
import videogame.service.ClientesServiceImpl;

@RequestScoped
@ManagedBean(name = "clientes")
public class ClientesController {
  private IClientesService service;
    private Clientes clientes;
    private List<Clientes> listaRegistros;

    @PostConstruct
    public void init() {
        service = new ClientesServiceImpl();
        clientes = new Clientes();
        listaRegistros = service.obtenerRegistros();
    }
    /*
    Metodo para crear un registro de usuario 
    */
    public void CrearRegistro() {
        service.insertarRegistro(clientes);
        listaRegistros = service.obtenerRegistros();
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
/*
    *metodo para listar los clientes
    */
    public List<Clientes> getListaRegistros() {
        return listaRegistros;
    }
/*
    metodo para editar un registro de usuario 
    */
    public void onRowEdit(RowEditEvent event) {
        Clientes clientes = (Clientes) event.getObject();
        service.actualizarRegistro(clientes);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje
                = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);
    }
    /*
    metodo para eliminar un registro de usuario 
    */
    public void EliminarRegistro(Clientes clientes) {
        service.eliminarRegistro(clientes);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje
                = new FacesMessage("Registro eliminado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);

    }
   
}

