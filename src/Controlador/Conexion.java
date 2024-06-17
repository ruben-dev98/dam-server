/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ruben
 */
public class Conexion {

    private static String DATABASE = "jdbc:mysql://127.0.0.1/libreria";
    private static String USER = "root"; // root@localhost
    //private static String PASSWORD = "M4st3rRubi99!";
    private static Connection connection;

    public static void open() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(DATABASE, USER, ""/*PASSWORD*/);
        //System.out.println(connection);
        connection.setAutoCommit(false);
    }

    public static void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void commit() throws SQLException {
        connection.commit();
    }

    public static void rollback() {
        try {
            connection.rollback();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
