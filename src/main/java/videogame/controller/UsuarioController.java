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
import videogame.entity.Usuario;
import videogame.service.IUsuarioService;
import videogame.service.UsuarioServiceImpl;

@RequestScoped
@ManagedBean(name = "usuario")
public class UsuarioController implements Serializable {

    private IUsuarioService service;
    private Usuario usuario;
    private List<Usuario> listaRegistros;

    @PostConstruct
    public void init() {
        service = new UsuarioServiceImpl();
        usuario = new Usuario();
        listaRegistros = service.obtenerRegistros();
    }
    /*
    Metodo para crear un registro de usuario 
    */
    public void CrearRegistro() {
        service.insertarRegistro(usuario);
        listaRegistros = service.obtenerRegistros();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    /*
    *metodo para listar a los usuarios
    */
    public List<Usuario> getListaRegistros() {
        return listaRegistros;
    }
    /*
    metodo para editar un registro de usuario
    */
    public void onRowEdit(RowEditEvent event) {
        Usuario usuario = (Usuario) event.getObject();
        service.actualizarRegistro(usuario);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje
                = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);
    }
    /*
    metodo para eliminar un registro de usuario
    */
    public void EliminarRegistro(Usuario usuario) {
        service.eliminarRegistro(usuario);
        listaRegistros = service.obtenerRegistros();
        FacesMessage mensaje
                = new FacesMessage("Registro eliminado exitosamente");
        FacesContext.getCurrentInstance().
                addMessage(null, mensaje);

    }
    
}
