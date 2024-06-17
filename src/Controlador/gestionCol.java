/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Coleccion;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class gestionCol {
    
    
    
    public static ArrayList<Coleccion> getColecciones() {
        ArrayList<Coleccion> colecciones = new ArrayList<>();
        try {
            Conexion.open();
            colecciones =  gestionLib.getColecciones(Conexion.getConnection());
        } catch (ClassNotFoundException | SQLException e) {
            //e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }
        return colecciones;
    }

    public static void insertColeccion(Coleccion coleccion) {
        try {
            Conexion.open();
            gestionLib.insertColeccion(Conexion.getConnection(), coleccion);

            Conexion.commit();
            JOptionPane.showMessageDialog(null, "La colección ha sido añadida con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            Conexion.rollback();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }
    }

    public static void updateColeccion(Coleccion coleccion) {
        try {
            Conexion.open();

             gestionLib.updateColeccion(Conexion.getConnection(), coleccion);

            Conexion.commit();
            JOptionPane.showMessageDialog(null, "La colección ha sido modificada con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            Conexion.rollback();
            //e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }
    }

    public static void deleteColeccion(Coleccion coleccion) {
        try {
            Conexion.open();

             gestionLib.deleteColeccion(Conexion.getConnection(), coleccion);

            Conexion.commit();
            JOptionPane.showMessageDialog(null, "La colección ha sido eliminada con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            Conexion.rollback();
            if (e.getMessage().contains("Cannot delete or update a parent row: a foreign key constraint fails")) {
                JOptionPane.showMessageDialog(null, "No se ha podido borrar la colección. Probablemente todavía existan números en ella.");
            } else {
                //e.printStackTrace();
            }
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }
    }
}
