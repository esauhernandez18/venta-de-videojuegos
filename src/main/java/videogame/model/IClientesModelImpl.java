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
import videogame.entity.Clientes;

public class IClientesModelImpl implements IClientesModel{
  private SessionFactory sf;
    private Session session;

    /*
    * Metodo para insertar un cliente
    */
    @Override
    public void insertarRegistro(Clientes clientes) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.save(clientes);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }

    /*
    * Metodo para consultar cliente
    */
    @Override
    public List<Clientes> obtenerRegistros() {
        List<Clientes> listaclientes = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            listaclientes = session.createCriteria(Clientes.class).list();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
        return listaclientes;
    }

    /*
    * Metodo para actualizar un cliente
    */
    @Override
    public void actualizarRegistro(Clientes clientes) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.update(clientes);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }

    /*
    * Metodo para eliminar un cliente
    */
    @Override
    public void eliminarRegistro(Clientes clientes) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            session.delete(clientes);
            session.getTransaction().commit();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            
        }
    }

}

