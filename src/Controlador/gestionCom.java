/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Coleccion;
import Modelo.Comic;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class gestionCom {

    public static ArrayList<Comic> getComics() {
        ArrayList<Comic> comics = new ArrayList<>();
        try {
            Conexion.open();
            comics = gestionLib.getComics(Conexion.getConnection(), null);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }

        return comics;
    }

    public static ArrayList<Comic> getComics(Coleccion coleccion) {
        ArrayList<Comic> ejemplares = new ArrayList<>();

        try {
            Conexion.open();

            ejemplares = gestionLib.getComics(Conexion.getConnection(), coleccion);

        } catch (ClassNotFoundException | SQLException e) {
            //e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }

        return ejemplares;
    }

    public static void insertEjemplar(Comic comic) {
        try {
            Conexion.open();

            gestionLib.insertComic(Conexion.getConnection(), comic);

            Conexion.commit();
            JOptionPane.showMessageDialog(null, "El ejemplar ha sido añadido con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            Conexion.rollback();
            //e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }
    }

    public static void updateComic(Comic comic) {
        try {
            Conexion.open();

            gestionLib.updateComic(Conexion.getConnection(), comic);

            Conexion.commit();
            JOptionPane.showMessageDialog(null, "El ejemplar ha sido modificado con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            Conexion.rollback();
            //e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }
    }

    public static void deleteComic(Comic comic) {
        try {
            Conexion.open();

            gestionLib.deleteComic(Conexion.getConnection(), comic);

            Conexion.commit();
            JOptionPane.showMessageDialog(null, "El ejemplar ha sido eliminado con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            Conexion.rollback();
            //e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }
    }

}
