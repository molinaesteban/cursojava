import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //Declaracion del contador
        int contador =0;

        //Revisamos si existe la cookie contadorVisitas
        Cookie[] cookies= request.getCookies();
        if (cookies !=null){
            for (Cookie c:cookies) {
                if(c.getName().equals("contadorVisitas")){
                    contador=Integer.parseInt(c.getValue());
                }

            }
        }
        //incremento del contador
        contador ++;

        //agregamos la respuesta al navegador
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));

        //La cookie se almacenara en el cliente por 1 hora
        c.setMaxAge(3600);
        //agregamos la cookie.
        response.addCookie(c);

        //mandamos la respuesta al navegador
        response.setContentType("text/html;charset-UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: "+contador);



    }
}
