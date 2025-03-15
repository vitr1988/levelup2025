package lesson24.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(servletNames = "AccountServlet")
public class AccountFilter extends HttpFilter {

    public static final String SERVLET_ATTRIBUTE = "ServletAttribute";

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        req.setAttribute(SERVLET_ATTRIBUTE, "TEST!");
        super.doFilter(req, res, chain);
    }
}
