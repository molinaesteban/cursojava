
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servidor")

public class Servidor extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);


        PrintWriter out = resp.getWriter();
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
