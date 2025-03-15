package lesson24;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

import static lesson24.filter.SecurityFilter.SECURITY_ATTRIBUTE;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (Objects.equals(username, password)) {
            req.getSession().setAttribute(SECURITY_ATTRIBUTE, username);
        } else {
            resp.sendError(HttpServletResponse.SC_FORBIDDEN);
        }
    }
}
