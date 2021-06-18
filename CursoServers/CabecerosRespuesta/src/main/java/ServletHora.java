import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ServletHora")
public class ServletHora extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF=8");
        //cabecero que refresca la informacion enviada



























































        response.setHeader("refresh","1");
        //cabecero que muestra la hora
        Date fecha = new Date();
        //formato de fecha con clase:
        SimpleDateFormat format = new SimpleDateFormat("'Hora actualizada' HH:mm:ss" );
        // formato al objeto fecha
        String horaFormato = format.format(fecha);

        PrintWriter out = response.getWriter();
        out.print("Hora acuatilizada"+horaFormato);
        out.close();

    }
}
