
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GeneracionExelServlet")
public class GeneracionExelServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        //Especificacion de documento que se envia al cliente
        response.setContentType("application/vnd.ms-excel");
        //cuando de click descarge el documento
        response.setHeader("ContentDisposition","attachmet;filename-excelEjemplo.xls");
        //para que el navegador no guarde cache y siempre informacion nueva
        response.setHeader("Pragma","no-cahce");
        response.setHeader("Cache-Control","no store");
        response.addDateHeader("Expires",-1);
        // despliege de informacion al cliente
        PrintWriter out = response.getWriter();
        // agregamos texto a exel
        //\t= tabulador primera celda vacia o siguiente celda
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        //suma de valores por funccion exel
        out.print("Total\t=SUMA(B2:B3)");
        out.close();


    }
}
