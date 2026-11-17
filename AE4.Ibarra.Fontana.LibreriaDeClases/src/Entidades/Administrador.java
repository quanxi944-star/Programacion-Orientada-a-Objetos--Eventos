package Entidades;

public class Administrador extends Usuario {

    private int nivelAcceso;
    private GestorEventos gestor;

    public Administrador(int id, String nombre, String apellido,
            String usuario, String clave, String email,
            int nivelAcceso, GestorEventos gestor) {

        super(id, nombre, apellido, usuario, clave, email);
        this.nivelAcceso = nivelAcceso;
        this.gestor = gestor;
    }

    public void altaEvento(Evento e) {
        gestor.registrar(e);
    }

    public void bajaEvento(int id) {
        gestor.eliminar(id);
    }

    public void actualizarEvento(Evento e) {
        gestor.actualizar(e);
    }

    public void consultarEventos() {
        gestor.consultar();
    }

    public void gestionarUsuarios() {
        System.out.println("Gestionando usuarios...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Administrador: " + getNombre()
                + " " + getApellido());
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
