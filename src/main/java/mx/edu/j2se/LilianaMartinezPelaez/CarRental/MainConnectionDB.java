package mx.edu.j2se.LilianaMartinezPelaez.CarRental;

import java.sql.*;

public class MainConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema?user=root&password=XXXXXXX!&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL);
    }

    public static void close(ResultSet resSet) throws SQLException{
        resSet.close();
    }

    public static void close(PreparedStatement preStm) throws SQLException{
        preStm.close();
    }

    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}