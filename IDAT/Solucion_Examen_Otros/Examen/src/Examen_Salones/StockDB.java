package Examen_Salones;

import java.sql.Connection;
import java.sql.DriverManager;

public class StockDB {

    Connection con;

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost: 3306/stock";
        String user = "root";
        String pss = "12345678";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pss);
        } catch (Exception e) {
            System.err.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
        return con;
    }

}
