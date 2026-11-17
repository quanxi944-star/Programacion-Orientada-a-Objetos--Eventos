package Entidades;

public class Categoria {

    private int idCategoria;
    private String nombre;
    private String descripcion;

    public Categoria(int idCategoria, String nombre,
            String descripcion) {

        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregarCategoria() {
        System.out.println("Categoria agregada.");
    }

    public void modificarCategoria() {
        System.out.println("Categoria modificada.");
    }

    public void eliminarCategoria() {
        System.out.println("Categoria eliminada.");
    }

    public void consultarCategoria() {
        System.out.println("Categoria: " + nombre);
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
