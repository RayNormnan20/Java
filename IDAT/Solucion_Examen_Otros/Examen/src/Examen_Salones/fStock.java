package Examen_Salones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class fStock {

    private ResultSet rs;
    private StockDB db = new StockDB();
    private Connection cn = db.getConnection();

    public void Insertar(Stock St) {
        try {
            CallableStatement csta = cn.prepareCall("{ call InsertarStock(?, ?, ?, ?) }");
            csta.setInt(1, St.getStockId());
            csta.setString(2, St.getName());
            csta.setDate(3, (Date) St.getLastdate());
            csta.setInt(4, St.getBenchmarkId());

            rs = csta.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Actualizar(Stock St) {
        try {
            CallableStatement csta = cn.prepareCall("{ call ActualizarStock(?, ?, ?, ?) }");
            csta.setInt(1, St.getStockId());
            csta.setString(2, St.getName());
            csta.setDate(3, (Date) St.getLastdate());
            csta.setInt(4, St.getBenchmarkId());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Eliminar(int stockId) {
        try {
            CallableStatement csta = cn.prepareCall("{ call EliminarStock(?) }");
            csta.setInt(1, stockId);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public DefaultTableModel buscarPorId(int stockId) {
        DefaultTableModel modelo;
        String[] titulos = {"stockId", "name", "lastdate", "benchmarkId"};
        String[] Registros = new String[4];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement csta = cn.prepareCall("{ call ObtenerStock(?) }");
            csta.setInt(1, stockId);
            rs = csta.executeQuery();

            while (rs.next()) {
                Registros[0] = Integer.toString(rs.getInt("stockId"));
                Registros[1] = rs.getString("name");
                Registros[2] = rs.getString("lastdate");
                Registros[3] = Integer.toString(rs.getInt("benchmarkId"));

                modelo.addRow(Registros);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar por id: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar ResultSet: " + e.getMessage());
            }
        }

        return modelo;
    }

    public DefaultTableModel mostrar() {
        DefaultTableModel modelo;
        String[] titulos = {"stockId", "name", "lastdate", "benchmarkId"};
        String[] Registros = new String[4];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement csta = cn.prepareCall("{ call ObtenerTodosStocks }");
            rs = csta.executeQuery();

            while (rs.next()) {
                Registros[0] = Integer.toString(rs.getInt("stockId"));
                Registros[1] = rs.getString("name");
                Registros[2] = rs.getString("lastdate");
                Registros[3] = Integer.toString(rs.getInt("benchmarkId"));

                modelo.addRow(Registros);
            }

            return modelo;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static void generarReporteVentas() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/stock?"
                    + "user=root&password=12345678");
            JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\Lenovo\\JaspersoftWorkspace\\MyReports\\REPORTE.jasper", null, conn);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\Lenovo\\JaspersoftWorkspace\\MyReports\\REPORTE.pdf");
            System.out.println("Archivo creado correctamente");
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            jasperViewer.setVisible(true);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendedorError" + ex.getErrorCode());

        } catch (JRException jre) {
            System.out.println(jre.getMessage());
        } finally {
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
