package Entidades;

public class Evento {

    private int idEvento;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String ubicacion;
    private int capacidadMaxima;
    private int inscriptos;
    private String estado;
    private Categoria categoria;

    public Evento(int idEvento, String nombre, String descripcion,
            String fecha, String ubicacion, int capacidadMaxima,
            Categoria categoria) {

        this.idEvento = idEvento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
        this.categoria = categoria;
        this.inscriptos = 0;
        this.estado = "Activo";
    }

    public void crearEvento() {
        System.out.println("Evento creado.");
    }

    public void eliminarEvento() {
        estado = "Eliminado";
    }

    public void modificarEvento() {
        System.out.println("Evento modificado.");
    }

    public void consultarEvento() {
        System.out.println("Evento: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Categoria: " + categoria.getNombre());
        System.out.println("Cupos disponibles: "
                + (capacidadMaxima - inscriptos));
    }

    public boolean hayCuposDisponibles() {
        return inscriptos < capacidadMaxima
                && estado.equals("Activo");
    }

    public void ocuparCupo() {
        if (hayCuposDisponibles()) {
            inscriptos++;
        }
    }

    public void liberarCupo() {
        if (inscriptos > 0) {
            inscriptos--;
        }
    }

    // Getters y setters

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
