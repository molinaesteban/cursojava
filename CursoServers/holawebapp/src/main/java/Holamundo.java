
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Holamundo") // path para accederlo desde el navagador

public class Holamundo extends HttpServlet{
//metodo que procesa el servelet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        resp.setContentType("text/html;charset=UTF=8"); //tipo Contenido que va a responder al navegador en este caso html
       PrintWriter out = resp.getWriter();
       out.println(("Hola mundo desde Servlets"));
    }


}
