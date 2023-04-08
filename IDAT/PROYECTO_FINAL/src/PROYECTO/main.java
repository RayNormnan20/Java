package PROYECTO;

import PROYECTO.productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto?"
                    + "user=root&password=12345678");
            stmt = conn.createStatement();

            List<productos> productos = new ArrayList<>();

            //Creacion de ña tabla medoante este comando
            /*
            
            stmt.executeUpdate("CREATE TABLE PRODUCTOS " + 
                    
                    "(id INT NOT NULL," +
                    "(nombre varchar (20), "+
                    "(precio DECIMAL(7,2)," +
                    "(stock int, " +
                    "primary key (id))");
                             
            System.out.println("Tabla creada correctamente");
             */
            while (opcion != 6) {
                System.out.println("======= MENU =======");
                System.out.println("1. Registrar producto");
                System.out.println("2. Leer productos");
                System.out.println("3. Actualizar producto");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Realizar una venta");
                System.out.println("6. Salir");
                System.out.print("Ingrese la opcion deseada: ");
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                        
                        try {
                        System.out.println("Ingrese el ID del producto: ");
                        int id = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese el precio del producto: ");
                        double precio = entrada.nextDouble();
                        System.out.println("Ingrese el stock del producto: ");
                        int stock = entrada.nextInt();
                        entrada.nextLine();

                        rs = stmt.executeQuery("SELECT * FROM productos WHERE id = '" + id + "'");
                        if (rs.next()) {
                            System.out.println("Ya existe un producto con el ID " + id);
                        } else {

                            productos producto = new productos(id, nombre, precio, stock);
                            stmt.executeUpdate("INSERT INTO productos (id, nombre, precio, stock) values ('" + producto.getId() + "', '"
                                    + producto.getNombre() + "', '" + producto.getPrecio() + "', '" + producto.getStock() + "')");
                            System.out.println("Producto agregado correctamente.");
                        }
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al insertar el producto: " + sqlEx.getMessage());
                    }
                    break;
                    case 2:
                        try {

                        System.out.println("Ingrese el ID del producto a buscar: ");
                        int idBuscado = entrada.nextInt();
                        rs = stmt.executeQuery("SELECT id, nombre, precio, stock FROM productos WHERE id = '" + idBuscado + "'");

                        if (rs.next()) {
                            int id = rs.getInt("id");
                            String nombre = rs.getString("nombre");
                            double precio = rs.getDouble("precio");
                            int stock = rs.getInt("stock");
                            productos pro = new productos(id, nombre, precio, stock);
                            System.out.println("Producto encontrado: " + pro.getNombre() + ",  precio S/." + pro.getPrecio());
                        } else {
                            System.out.println("Producto no encontrado");
                        }
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al leer los productos: " + sqlEx.getMessage());
                    }
                    break;
                    case 3:
                    try {
                        System.out.println("Ingrese el ID del producto a actualizar: ");
                        int id = entrada.nextInt();
                        entrada.nextLine();
                        rs = stmt.executeQuery("SELECT  nombre, precio, stock FROM productos WHERE id = '" + id + "'");

                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese el precio del producto: ");
                        double precio = entrada.nextDouble();
                        System.out.println("Ingrese el stock del producto: ");
                        int stock = entrada.nextInt();
                        entrada.nextLine();

                        productos producto = new productos(id, nombre, precio, stock);
                        stmt.executeUpdate("UPDATE productos SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                                + ", stock = " + producto.getStock() + " WHERE id = " + id);

                        System.out.println("Producto actualizado correctamente.");

                    } catch (SQLException sqlEx) {
                        System.out.println("Error al modificar el producto: " + sqlEx.getMessage());
                    }
                    break;

                    case 4:
                        try {
                        stmt = conn.createStatement();
                        rs = stmt.executeQuery("SELECT id, nombre,  precio, stock FROM productos");

                        while (rs.next()) {
                            System.out.println(rs.getString("id") + "       "
                                    + rs.getString("nombre") + "       " + rs.getString("precio") + "       " + rs.getString("stock"));
                        }

                        System.out.println("Ingrese el ID del producto a eliminar: ");
                        String idEli = entrada.nextLine();
                        stmt.executeUpdate("DELETE FROM productos WHERE id = '" + idEli + "'");
                        System.out.println("Producto eliminado correcatmente...!!!");
                        break;
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al eliminar el producto: " + sqlEx.getMessage());
                    }
                    case 5:
                        try {
                        System.out.println("Ingrese el ID del producto a vender: ");
                        int idVenta = entrada.nextInt();
                        entrada.nextLine();
                        rs = stmt.executeQuery("SELECT id, nombre, precio, stock FROM productos WHERE id = '" + idVenta + "'");

                        if (rs.next()) {
                            int id = rs.getInt("id");
                            String nombre = rs.getString("nombre");
                            double precio = rs.getDouble("precio");
                            int stock = rs.getInt("stock");

                            System.out.println("Producto encontrado: " + nombre + " con un precio de S/. " + precio);

                            System.out.println("Ingrese la cantidad a vender: ");
                            int cantidadVenta = entrada.nextInt();
                            entrada.nextLine();

                            if (cantidadVenta > stock) {
                                System.out.println("No hay suficiente stock disponible." + stock);
                            } else {
                                double totalVenta = cantidadVenta * precio;
                                System.out.println("El total de la venta es: " + totalVenta);

                                int nuevoStock = stock - cantidadVenta;
                                stmt.executeUpdate("UPDATE productos SET stock = '" + nuevoStock + "' WHERE id = '" + idVenta + "'");
                                System.out.println("Venta realizada correctamente. El nuevo stock del producto es: " + nuevoStock);
                            }
                        } else {
                            System.out.println("Producto no encontrado");
                        }
                    } catch (SQLException sqlEx) {
                        System.out.println("Error al realizar la venta: " + sqlEx.getMessage());
                    }
                    break;
                    case 6:
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
