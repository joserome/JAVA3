<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Que onda Jose</h1>
        
        
            <form action="ServletAutenticar" method="post"> 
            usuario<br>   <!--etiqueta-->
            <input type="text" name ="login"> <br>  <!--cuadro de texto-->
            contraseña<br>
            <input type="password" name ="password"> <br>
            <input type="submit" value="ingresar">  <!--boton-->
        </form>
        
        
        
        
    </body>
</html>
