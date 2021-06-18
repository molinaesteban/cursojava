import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean nuevoUsuario = true;

        //Obtenemos el arreglo de cookies
        Cookie [] cookies = request.getCookies();
        
        //Buscamo si ya exixte una cookie creada con anterioridad
        
        if(cookies !=null){
            for (Cookie c:cookies) { if (c.getName().equals("VisitanteRecurrente") &&
            c.getValue().equals("si")){
                nuevoUsuario=false;
                break;
            }

                
            }

            String mensaje= null;
            if(nuevoUsuario){
                Cookie visitanteCookie= new Cookie("VisitanteRecurrente","si");
                //agregamos la cookie en la respuesta
                response.addCookie(visitanteCookie);
                mensaje = "Gracias por visitar a nuestro sitio por primera vez";

            }
            else {
                mensaje = "gracias por visitar nuevamente nuestro sitio";


            }
            response.setContentType("tex/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print("mensaje: "+mensaje);
            out.close();
        }

    }
}
