/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Coleccion;
import Modelo.Comic;
import Modelo.Estado;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author ruben
 */
public class gestionLib {
    
    public static ArrayList<Coleccion> getColecciones(Connection connection) throws SQLException {
        ArrayList<Coleccion> colecciones = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(Consultas.GET_COLECCIONES);

        while (resultSet.next()) {
            colecciones.add(
                    new Coleccion(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4)
                    )
            );
        }
        return colecciones;
    }

    public static ArrayList<Comic> getComics(Connection connection, Coleccion coleccion) throws SQLException {
        ArrayList<Comic> comics = new ArrayList<>();

        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.GET_COMIC);

        if (coleccion != null && coleccion.getIdColeccion() != 0) {
            preparedStatement.setInt(1, coleccion.getIdColeccion());
            preparedStatement.setInt(2, coleccion.getIdColeccion());
        } else {
            preparedStatement.setNull(1, Types.NULL);
            preparedStatement.setNull(2, Types.NULL);
        }
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            //int, col, date, int, int, int, double, blob, estado
            comics.add(new Comic(
                    resultSet.getInt(1),
                    new Coleccion(
                            resultSet.getInt(8),
                            resultSet.getString(9),
                            resultSet.getString(10),
                            resultSet.getString(11)
                    ),
                    resultSet.getString(2),
                    resultSet.getDate(3),
                    resultSet.getInt(4),
                    resultSet.getInt(5),
                    resultSet.getDouble(6),
                    resultSet.getBlob(7),
                    new Estado(
                            resultSet.getInt(12),
                            resultSet.getString(13)
                    )
            )
            );
        }
        return comics;
    }

    public static ArrayList<Estado> getEstados(Connection connection) throws SQLException {
        ArrayList<Estado> estados = new ArrayList<>();

        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.GET_ESTADOS);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            estados.add(
                    new Estado(
                            resultSet.getInt(1),
                            resultSet.getString(2)
                    )
            );
        }
        return estados;
    }

    public static void insertColeccion(Connection connection, Coleccion coleccion) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.INSERT_COLECCION);
        preparedStatement.setString(1, coleccion.getNombre());
        preparedStatement.setString(2, coleccion.getSinopsis());
        preparedStatement.setString(3, coleccion.getEditorial());

        preparedStatement.executeUpdate();
    }

    public static void updateColeccion(Connection connection, Coleccion coleccion) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.UPDATE_COLECCION);
        preparedStatement.setString(1, coleccion.getNombre());
        preparedStatement.setString(2, coleccion.getSinopsis());
        preparedStatement.setString(3, coleccion.getEditorial());
        preparedStatement.setInt(4, coleccion.getIdColeccion());

        preparedStatement.executeUpdate();
    }

    public static void deleteColeccion(Connection connection, Coleccion coleccion) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.DELETE_COLECCION);
        preparedStatement.setInt(1, coleccion.getIdColeccion());
        
        deleteComicsColeccion(connection, coleccion);

        preparedStatement.executeUpdate();
    }

    public static void insertComic(Connection connection, Comic comic) throws SQLException {
        Blob portada = connection.createBlob();
        if (comic.getPortada_byte() != null) {
            portada.setBytes(1, comic.getPortada_byte());
        }

        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.INSERT_COMIC);
        preparedStatement.setInt(1, comic.getColeccion().getIdColeccion());
        preparedStatement.setString(2, comic.getTitulo());
        preparedStatement.setDate(3, comic.getFecha_adquisicion());
        preparedStatement.setInt(4, comic.getNumero_coleccion());
        preparedStatement.setInt(5, comic.getPaginas());
        preparedStatement.setDouble(6, comic.getPrecio());
        preparedStatement.setBlob(7, portada);
        preparedStatement.setInt(8, comic.getEstado().getIdEstado());

        preparedStatement.executeUpdate();
    }

    public static void updateComic(Connection connection, Comic comic) throws SQLException {
        Blob portada = connection.createBlob();
        if (comic.getPortada_byte() != null) {
            portada.setBytes(1, comic.getPortada_byte());
        }

        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.UPDATE_COMIC);
        preparedStatement.setInt(1, comic.getColeccion().getIdColeccion());
        preparedStatement.setString(2, comic.getTitulo());
        preparedStatement.setInt(3, comic.getNumero_coleccion());
        preparedStatement.setInt(4, comic.getPaginas());
        preparedStatement.setDouble(5, comic.getPrecio());
        preparedStatement.setBlob(6, portada);
        preparedStatement.setInt(7, comic.getEstado().getIdEstado());
        preparedStatement.setInt(8, comic.getId_comic());

        preparedStatement.executeUpdate();
    }

    public static void deleteComic(Connection connection, Comic comic) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.DELETE_COMIC);
        preparedStatement.setInt(1, comic.getId_comic());

        preparedStatement.executeUpdate();
    }
    
    public static ArrayList<Estado> getEstados() {
        ArrayList<Estado> estados = new ArrayList<>();

        try {
            Conexion.open();

            estados = getEstados(Conexion.getConnection());

        } catch (ClassNotFoundException | SQLException e) {
            //e.printStackTrace();
        } finally {
            if (Conexion.getConnection() != null) {
                Conexion.close();
            }
        }

        return estados;
    }
        
    public static void setImage(InputStream inputStream, JLabel lblPicture) {
        try {
            if (inputStream == null) {
                return;
            }
            BufferedImage image = ImageIO.read(inputStream);

            if (image != null) {
                lblPicture.setIcon(
                        new ImageIcon(
                                image.getScaledInstance(
                                        Consultas.COVER_WIDTH,
                                        Consultas.COVER_HEIGHT,
                                        Image.SCALE_SMOOTH)
                        )
                );
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
    }

    public static byte[] getImage(JLabel lblPicture) {
        ImageIcon imageIcon = (ImageIcon) lblPicture.getIcon();
        if (imageIcon == null) {
            return null;
        }

        BufferedImage buffered = new BufferedImage(Consultas.COVER_WIDTH, Consultas.COVER_HEIGHT, BufferedImage.TYPE_INT_RGB);
        buffered.getGraphics().drawImage(imageIcon.getImage(), 0, 0, null);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(buffered, "jpg", baos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        byte[] imageInByte = baos.toByteArray();

        return imageInByte;
    }

    public static void loadComboBox(JComboBox jComboBox, ArrayList arrayList) {
        //jComboBox.removeAllItems();
        for (int i = 0; i < arrayList.size(); i++) {
            jComboBox.addItem(arrayList.get(i));
        }
    }
    
    private static void deleteComicsColeccion(Connection connection, Coleccion coleccion) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(Consultas.DELETE_COMIC_COLECCION);
        preparedStatement.setInt(1, coleccion.getIdColeccion());

        preparedStatement.executeUpdate();
    }
}
