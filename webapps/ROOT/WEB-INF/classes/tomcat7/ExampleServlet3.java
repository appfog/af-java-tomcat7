package tomcat7;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.apache.catalina.util.ServerInfo;

@WebServlet("/")
public class ExampleServlet3 extends HttpServlet {

    public ExampleServlet3() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(ServerInfo.getServerInfo());
        response.getWriter().println("Servlet 3.0");
        response.getWriter().println("JVM Version: " + System.getProperty("java.runtime.version"));
        response.getWriter().println("JVM Vendor: " + System.getProperty("java.vm.vendor"));
    }

}
