/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.pruebabime;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author jose
 */
public class ServletAutenticar extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         
 
 String login= request.getParameter("login");
 String password=request.getParameter("password");       
        
   
 
 
 
  //Creeamos un model 
        Usuario u = new Usuario();
        //Ajustamos su login y password
            u.setLogin(login);
            u.setPassword(password);
            
        //Redireccionamos el servlet
            ModeloAutenticar modelo=new ModeloAutenticar();
            
            if(modelo.Servletautenticar(u)){
                      
            RequestDispatcher despachador=request.getRequestDispatcher("/Bienvenido.jsp");
            despachador.forward(request, response);
            }else{
            RequestDispatcher despachador=request.getRequestDispatcher("/Error.jsp");
            despachador.forward(request, response);
            }
            
            
    }

   
}
