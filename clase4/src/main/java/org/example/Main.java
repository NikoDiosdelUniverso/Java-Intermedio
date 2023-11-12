package org.example;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conectar = null;
        String sURL = "jdbc:mysql://localhost:3306/facturacion";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            conectar = (Connection) DriverManager.getConnection(sURL, "root", "b,4yaprZk)UhN1gm]m]M");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger("no hay conexion").log(Level.SEVERE, null, ex);
        }

        Statement s = null;
        try {
            s = (Statement) conectar.createStatement();
        } catch (SQLException ex) {
            //  Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        int val = 2;
        ResultSet rs = null;

        try {
            // rs = s.executeQuery("select * from factura where cod_factura='"+val+"'");
            rs = s.executeQuery("select * from factura ");
        } catch (SQLException ex) {
            // Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger("No hubo conexion").log(Level.SEVERE, null, ex);
        }
    }
}