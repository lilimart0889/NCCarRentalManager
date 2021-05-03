package mx.edu.j2se.LilianaMartinezPelaez.CarRental;

import java.sql.*;
import static mx.edu.j2se.LilianaMartinezPelaez.CarRental.MainConnectionDB.getConnection;
import static mx.edu.j2se.LilianaMartinezPelaez.CarRental.MainConnectionDB.close;

public class MainTest {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            conn = getConnection();
            Statement statement = conn.createStatement();
            ResultSet vehicles = statement.executeQuery("SELECT * FROM VEHICLES ");
            while(vehicles.next()) {
                System.out.println("NUMBER PLATE: " + vehicles.getInt("NUMBER_PLATE"));
                System.out.println("BRAND: " + vehicles.getString("BRAND"));
                System.out.println("-----------");
            }

            System.out.println("-----------");
            System.out.println("VEHICLES ORDER BY PRICE (DESC)");
            System.out.println("-----------");

            ResultSet vehiclesBrandNissan = statement.executeQuery("SELECT * FROM VEHICLES WHERE BRAND = 'NISSAN' " +
                    "ORDER BY PRICE DESC");
            while(vehiclesBrandNissan.next()) {
                System.out.println("BRAND: " + vehiclesBrandNissan.getString("BRAND"));
                System.out.println("PRICE: " + vehiclesBrandNissan.getString("PRICE"));
                System.out.println("-----------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        finally {
            try {
                close(conn);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}