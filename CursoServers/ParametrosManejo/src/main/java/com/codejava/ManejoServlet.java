package com.codejava;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/Servidor")
public class ManejoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);


        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parametro del usuario es: "+ usuario);
        out.println("<br/>");
        out.println("el parametro del password es:" + password);
        out.println("</body>");
        out.println("/html");
        out.close();

    }


}
