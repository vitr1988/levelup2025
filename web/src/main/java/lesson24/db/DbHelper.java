package lesson24.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHelper {

    public static PreparedStatement createPreparedStatement(String sql) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=public",
                "root", "root");
        return connection.prepareStatement(sql);
    }
}
