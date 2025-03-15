package lesson24;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson24.db.DbHelper;
import lesson24.dto.AccountDto;

import javax.annotation.Resource;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static lesson24.filter.AccountFilter.SERVLET_ATTRIBUTE;

@WebServlet(urlPatterns = {"/accounts/*", "/accounts"}, name = "AccountServlet")
public class AccountServlet extends HttpServlet /*implements SingleThreadModel*/ {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Resource(name = "jdbc/PostgresDataSource")
    private DataSource dataSource;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().setAttribute("test", "test");

        AccountDto accountDto = OBJECT_MAPPER.readValue(req.getInputStream(), AccountDto.class);

        try (PreparedStatement preparedStatement = dataSource.getConnection().prepareStatement("""
            insert into accounts(account_number, full_name, balance)
            values (?,?,?)
        """)) {
            preparedStatement.setString(1, accountDto.getAccountNumber());
            preparedStatement.setString(2, accountDto.getFullName());
            preparedStatement.setInt(3, accountDto.getBalance());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        System.out.println(accountDto);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getAttribute(SERVLET_ATTRIBUTE));
        String pathInfo = req.getPathInfo();
        Integer id = Integer.valueOf(pathInfo.split("/")[1]);
        try (PreparedStatement preparedStatement = DbHelper.createPreparedStatement("""
            select id, account_number, full_name, balance
            from accounts
            where id = ?
        """)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int accountId = rs.getInt("id");
                String accountNumber = rs.getString("account_number");
                String fullName = rs.getString("full_name");
                int balance = rs.getInt("balance");
                resp.setContentType("application/json");
                resp.getWriter().println(OBJECT_MAPPER.writeValueAsString(
                        new AccountDto(accountId, accountNumber, fullName, balance)
                ));
            } else {
                resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            }
        }
        catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}
