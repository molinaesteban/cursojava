
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {

        String usuarioOK ="juan";
        String passwordOK="123";

        //Recibiendo valores del formulario html
        String usuario= request.getParameter("Usuario");
        String password= request.getParameter("password");

        PrintWriter out = response.getWriter();

        //validacion
        if(usuarioOK.equals(usuario) && passwordOK.equals(password)) {
            out.print("<h1>");
            out.print("Datos corretos");
            out.print("<br>Usuario: "+usuario);
            out.print("<br>Password: "+password);
            out.print("</h1>");
        }
        else {
            response.sendError(response.SC_UNAUTHORIZED,"Las credenciales son incorretas");
        }

    }

}
