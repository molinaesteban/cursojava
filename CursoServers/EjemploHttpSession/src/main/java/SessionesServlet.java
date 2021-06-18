import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionesServlet")
public class SessionesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String titulo = null;

        //Pedir el atributo contadorVisitas a la sesion
        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
        //si es nulo es la primera vez que accedemos a la aplicacion

        if(contadorVisitas== null){
            contadorVisitas=1;
            titulo="Bienvenido por primera vez";
        }
        else {
            contadorVisitas++;
            titulo="Bienvenido nuevamente";
        }

        //agregamos el nuevo valor a la sesion
        session.setAttribute("contadorVisitas", contadorVisitas);

        //enviamos la respuesta al cliente
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("no acceso al recurso: "+contadorVisitas);
        out.print("</br>");
        out.print("id de la sesion: "+session.getId());
        out.close();



    }
}
