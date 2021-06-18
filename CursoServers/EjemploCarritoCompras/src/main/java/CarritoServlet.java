import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Creamos o recuperamos el objeto http session
        HttpSession session = request.getSession();

        //recuperamos la lista de articulos agregadoso previamente si exiten
        List<String> articulos = (List<String>) session.getAttribute("articulos");

        //Verificamos si la lista de articulos exite
        if(articulos==null){
            //inicializamos la lista de articulos
            articulos = new ArrayList<>();
            session.setAttribute("articulos",articulos);
        }

        //procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        //revisamos y  agregamos el articulo nuevo

        if(articuloNuevo !=null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
        }

        PrintWriter out = response.getWriter();
        out.print("<h1>Lista de articulos</h1>");
        out.print("<br>");
        //iteramos todos los articulos
        for (String a :articulos) {
            out.print("<li>"+a +"</li>");

        }
        out.print("<br>");
        out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        out.close();

    }


}
