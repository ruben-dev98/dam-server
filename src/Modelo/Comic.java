package Modelo;

import java.sql.Blob;
import java.sql.Date;

/**
 *
 * @author luisvi
 */
public class Comic {

    private int id_comic;
    private Coleccion coleccion;
    private String titulo;
    private Date fecha_adquisicion;
    private int numero_coleccion;
    private int paginas;
    private double precio;
    private byte[] portada_byte;
    private Blob portada;
    private Estado estado;

    public Comic(int id_comic, Coleccion coleccion, String titulo, Date fecha_adquisicion, int numero_coleccion, int paginas, double precio, Blob portada, Estado estado) {
        this.id_comic = id_comic;
        this.coleccion = coleccion;
        this.titulo = titulo;
        this.fecha_adquisicion = fecha_adquisicion;
        this.numero_coleccion = numero_coleccion;
        this.paginas = paginas;
        this.precio = precio;
        this.portada = portada;
        this.estado = estado;
    }

    public Comic(int id_comic, Coleccion coleccion, String titulo, Date fecha_adquisicion, int numero_coleccion, int paginas, double precio, byte[] portada_byte, Estado estado) {
        this.id_comic = id_comic;
        this.coleccion = coleccion;
        this.titulo = titulo;
        this.fecha_adquisicion = fecha_adquisicion;
        this.numero_coleccion = numero_coleccion;
        this.paginas = paginas;
        this.precio = precio;
        this.portada_byte = portada_byte;
        this.estado = estado;
    }

    public Comic(Coleccion coleccion, String titulo, Date fecha_adquisicion, int numero_coleccion, int paginas, double precio, Blob portada, Estado estado) {
        this.coleccion = coleccion;
        this.titulo = titulo;
        this.fecha_adquisicion = fecha_adquisicion;
        this.numero_coleccion = numero_coleccion;
        this.paginas = paginas;
        this.precio = precio;
        this.portada = portada;
        this.estado = estado;
    }

    public Comic(Coleccion coleccion, String titulo, Date fecha_adquisicion, int numero_coleccion, int paginas, double precio, byte[] portada_byte, Estado estado) {
        this.coleccion = coleccion;
        this.titulo = titulo;
        this.fecha_adquisicion = fecha_adquisicion;
        this.numero_coleccion = numero_coleccion;
        this.paginas = paginas;
        this.precio = precio;
        this.portada_byte = portada_byte;
        this.estado = estado;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumero_coleccion(int numero_coleccion) {
        this.numero_coleccion = numero_coleccion;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPortada_byte(byte[] portada_byte) {
        this.portada_byte = portada_byte;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    public Date getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public int getId_comic() {
        return id_comic;
    }

    public int getNumero_coleccion() {
        return numero_coleccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public byte[] getPortada_byte() {
        return portada_byte;
    }

    public Blob getPortada() {
        return portada;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
