package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class ActualizarRegistros {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila?" +
                     "user=root&password=12345678");

            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE MITABLA SET NAME='JOSE' WHERE ID=123");
            stmt.executeUpdate("DELETE FROM MITABLA WHERE ID=789");
            rs = stmt.executeQuery("SELECT ID, NAME FROM MITABLA");

            while (rs.next()) {
                System.out.println(rs.getString("ID") + " " +
                         rs.getString("NAME"));
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendedorError" + ex.getErrorCode());

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.getMessage());
                }
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.getMessage());
                }
                stmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                    System.out.println(sqlEx.getMessage());
                }
                conn = null;
            }
        }

    }

}
