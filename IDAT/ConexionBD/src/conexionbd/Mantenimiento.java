package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Mantenimiento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila?"
                    + "user=root&password=12345678");
            stmt = conn.createStatement();
            //Creacion de ña tabla medoante este comando
            /*
            stmt.executeUpdate("CREATE TABLE PRODUCTOS "
                    + "(ID INT NOT NULL, "
                    + "NOMBRE VARCHAR(20), "
                    + "PRECIO DECIMAL(7,2), "
                    + " PRIMARY KEY (ID))");
            System.out.println("Tabla creada correctamente");
             */

            while (opcion != 5) {
                System.out.println("======= MENU =======");
                System.out.println("1. Crear producto");
                System.out.println("2. Leer productos");
                System.out.println("3. Actualizar producto");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Salir");
                System.out.print("Ingrese la opcion deseada: ");
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        try {
                        System.out.println("Ingrese el ID del producto: ");
                        String id = entrada.nextLine();
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese el precio del producto: ");
                        String precio = entrada.nextLine();

                        // Validar si ya existe el ID
                        rs = stmt.executeQuery("SELECT * FROM productos WHERE id = '" + id + "'");
                        if (rs.next()) {
                            System.out.println("Ya existe un producto con el ID " + id);
                        } else {
                            stmt.executeUpdate("INSERT INTO productos (id, nombre, precio) values ('" + id + "', '"
                                    + nombre + "', '" + precio + "')");
                            System.out.println("Producto agregado correctamente.");
                        }
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al insertar el producto: " + sqlEx.getMessage());
                    }
                    break;
                    case 2:
                        try {
                        System.out.println("Ingrese el ID del producto a buscar: ");
                        String idBuscar = entrada.nextLine();
                        rs = stmt.executeQuery("SELECT id, nombre, precio FROM productos WHERE id = '" + idBuscar + "'");

                        while (rs.next()) {
                            System.out.println(rs.getString("id") + " "
                                    + rs.getString("nombre") + " " + rs.getString("precio"));
                        }
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al buscar el producto: " + sqlEx.getMessage());
                    }
                    break;
                    case 3:
                        try {
                        System.out.println("Ingrese el ID del producto a actualizar: ");
                        String idActualizar = entrada.nextLine();
                        System.out.println("Ingrese el nuevo nombre del producto: ");
                        String nombreNuevo = entrada.nextLine();
                        System.out.println("Ingrese el nuevo precio del producto: ");
                        String precioNuevo = entrada.nextLine();
                        stmt.executeUpdate("UPDATE productos SET nombre = '" + nombreNuevo
                                + "', precio = '" + precioNuevo + "' WHERE id = '" + idActualizar + "'");
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al actualizar el producto: " + sqlEx.getMessage());
                    }
                    break;
                    case 4:
                        try {
                        stmt = conn.createStatement();
                        rs = stmt.executeQuery("SELECT id, nombre, precio FROM productos");

                        while (rs.next()) {
                            System.out.println(rs.getString("id") + " "
                                    + rs.getString("nombre") + " " + rs.getString("precio"));
                        }

                        System.out.println("Ingrese el ID del producto a eliminar: ");
                        String idEli = entrada.nextLine();
                        stmt.executeUpdate("DELETE FROM productos WHERE id = '" + idEli + "'");
                        System.out.println("Producto eliminado correcatmente...!!!");
                        break;
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al eliminar el producto: " + sqlEx.getMessage());
                    }
                    break;
                    case 5:
                        System.out.println("Bye Bye...!!!");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
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
