/*
* Hecho por: Heber Esaú Hernández Ramírez
* Fecha de creación: 05/12/22
* Descripción: Controlador para clientes
*/
package videogame.model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import videogame.entity.Usuario;

public class IUsuarioModelImpl implements IUsuarioModel {

    private SessionFactory sf;
    private Session session;

    /*
    * Metodo para insertar un usuario 
    */
    @Override
    public void insertarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }

    /*
    * Metodo para consultar usuarios 
    */
    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listaUsuario = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            listaUsuario = session.createCriteria(Usuario.class).list();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
        return listaUsuario;
    }

    /*
    * Metodo para actualizar un usuario
    */
    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }

    /*
    * Metodo para eliminar un usuario
    */
    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.delete(usuario);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }

}
