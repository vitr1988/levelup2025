package lesson24;

import lesson24.dto.AccountDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/page")
public class JspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Hello World");
        req.setAttribute("account", new AccountDto(1, "test", "test", 1));
        req.getRequestDispatcher("/WEB-INF/page.jsp").forward(req, resp);
    }
}
