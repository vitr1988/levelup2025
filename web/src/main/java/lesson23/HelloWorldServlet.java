package lesson23;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;

//@WebServlet(urlPatterns = "/hello", loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet {

    private Integer value = 0;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        String value1 = config.getInitParameter("test");
        Enumeration<String> servletNames = config.getServletContext().getServletNames();
        List<String> servletNamesList = new ArrayList<>();
        while (servletNames.hasMoreElements()) {
            servletNamesList.add(servletNames.nextElement());
        }
        System.out.println(servletNamesList);
        System.out.println("Init " + this.getClass().getSimpleName());
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        System.out.println("Enter ...");
        super.service(req, res);
        System.out.println("Exit ...");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy " + this.getClass().getSimpleName());
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String name = request.getParameter("name");
        String name = request.getHeader("X-Name");
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                response.getWriter().println("%s = %s".formatted(cookie.getName(), cookie.getValue()));
            }
        }
        response.getWriter().println("Hello, %s!".formatted(Objects.toString(name, "World")));
    }
}
