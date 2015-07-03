/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.pruebabime;

/**
 *
 * @author jose
 */
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class DAOUsuario {
    //Ponemos static para que se cargen inmediatamente antes de iniciar sesion.
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    public void abrirSesion(){
        factory= HibernateUtilidades.getSessionFactory();
        session= factory.openSession();
        tranza= session.beginTransaction();
    
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
        
    }
    
    public DAOUsuario(){
    
    }
    
    //Creamos el insert
    public void guardar(Usuario u)throws Exception{
        //Aqui poner el codigo de tu guardado
        //despues invocas el metodo cerrar todo
        session.save(u);
        cerrarTodo();
    }
    
    
    
}
