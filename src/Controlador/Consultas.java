/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author ruben
 */
public class Consultas {

    public final static String GET_COLECCIONES = "SELECT * FROM colecciones ORDER BY nombre;";

    /**
     * This may need an input id to select all the ejemplares from a coleccion.
     */
    public final static String GET_COMIC
            = "SELECT\n"
            + "	   comics.id_comic,\n"
            + "    comics.titulo,\n"
            + "    comics.fecha_adquisicion,\n"
            + "    comics.numero_coleccion,\n"
            + "    comics.paginas,\n"
            + "    comics.precio,\n"
            + "    comics.portada,\n"
            + "    colecciones.id_coleccion,\n"
            + "    colecciones.nombre,\n"
            + "    colecciones.sinopsis,\n"
            + "    colecciones.editorial,\n"
            + "    estado.id_estado,\n"
            + "    estado.estado\n"
            + "FROM\n"
            + "	   comics \n"
            + "    NATURAL JOIN colecciones\n"
            + "    NATURAL JOIN estado\n"
            + "WHERE\n"
            + "    ? IS NULL \n"
            + "    OR comics.id_coleccion = ?\n"
            + "ORDER BY\n"
            + "	   comics.id_coleccion,\n"
            + "    comics.numero_coleccion";

    public final static String GET_ESTADOS = "SELECT * FROM libreria.estado;";

    public final static String INSERT_COLECCION
            = "INSERT INTO `libreria`.`colecciones`\n"
            + "(`nombre`, `sinopsis`, `editorial`)\n"
            + "VALUES\n"
            + "(?, ?, ?);";

    public final static String UPDATE_COLECCION
            = "UPDATE `libreria`.`colecciones`\n"
            + "SET\n"
            + "`nombre` = ?,\n"
            + "`sinopsis` = ?,\n"
            + "`editorial` = ?\n"
            + "WHERE `id_coleccion` = ?;";

    public final static String DELETE_COLECCION
            = "DELETE FROM `libreria`.`colecciones`"
            + "WHERE `id_coleccion` = ?;";

    public final static String INSERT_COMIC
            = "INSERT INTO `libreria`.`comics`\n"
            + "(`id_coleccion`,\n"
            + "`titulo`,\n"
            + "`fecha_adquisicion`, \n"
            + "`numero_coleccion`,\n"
            + "`paginas`,\n"
            + "`precio`,\n"
            + "`portada`,\n"
            + "`id_estado`)\n"
            + "VALUES\n"
            + "(?, ?, ?, ?, ?, ?, ?, ?);";

    public final static String UPDATE_COMIC
            = "UPDATE `libreria`.`comics`\n"
            + "SET\n"
            + "`id_coleccion` = ?,\n"
            + "`titulo` = ?,\n"
            + "`numero_coleccion` = ?,\n"
            + "`paginas` = ?,\n"
            + "`precio` = ?,\n"
            + "`portada` = ?,\n"
            + "`id_estado` = ?\n"
            + "WHERE `id_comic` = ?;";

    public final static String DELETE_COMIC
            = "DELETE FROM `libreria`.`comics`\n"
            + "WHERE `id_comic` = ?;";
    
    public final static String DELETE_COMIC_COLECCION
            = "DELETE FROM `libreria`.`comics`\n"
            + "WHERE `id_coleccion` = ?;";

    public final static int COVER_WIDTH = 299;
    public final static int COVER_HEIGHT = 450;
}
