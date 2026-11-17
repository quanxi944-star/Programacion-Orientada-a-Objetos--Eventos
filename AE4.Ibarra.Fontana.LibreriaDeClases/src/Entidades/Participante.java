package Entidades;

import java.util.ArrayList;

public class Participante extends Usuario {

    private String telefono;
    private ArrayList<Inscripcion> inscripciones;

    public Participante(int id, String nombre, String apellido,
            String usuario, String clave, String email,
            String telefono) {

        super(id, nombre, apellido, usuario, clave, email);
        this.telefono = telefono;
        this.inscripciones = new ArrayList<>();
    }

    public Inscripcion inscribirse(Evento e) {

        if (e.hayCuposDisponibles()) {
            e.ocuparCupo();

            Inscripcion i = new Inscripcion(
                    inscripciones.size() + 1, this, e);

            inscripciones.add(i);

            System.out.println("Inscripcion realizada.");
            return i;
        }

        System.out.println("No hay cupos disponibles.");
        return null;
    }

    public void cancelarInscripcion(Inscripcion i) {
        if (inscripciones.contains(i) && i.cancelarInscripcion()) {
            System.out.println("Inscripcion cancelada.");
        }
    }

    public void consultarEventos() {
        System.out.println("Consultando eventos disponibles...");
    }

    public void consultarInscripciones() {
        for (Inscripcion i : inscripciones) {
            i.consultarInscripcion();
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Participante: " + getNombre()
                + " " + getApellido());
        System.out.println("Telefono: " + telefono);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}