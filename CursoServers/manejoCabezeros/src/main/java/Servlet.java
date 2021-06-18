import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Headers Http </title>");
        out.println("</head>");

        out.println("<h1>Headers Http</h1>");
        out.println("metodo htpp:"+metodoHttp);

        String uri;
        uri = request.getRequestURI();
        out.println("uri solicitada:"+uri);

        //imprimimos todos los cabezeros disponibles
        out.print("</br>");
        out.print("</br>");

        Enumeration cabeceros = request.getHeaderNames();
        while (cabeceros.hasMoreElements()){
            String nombreCabecero= (String) cabeceros.nextElement();
            out.print("<b>"+nombreCabecero +"</b>:");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }
        out.println("<body>");
        out.print("</html>");
        out.close();

    }
}
