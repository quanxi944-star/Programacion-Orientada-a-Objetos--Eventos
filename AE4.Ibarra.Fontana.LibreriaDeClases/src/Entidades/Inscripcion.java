package Entidades;

public class Inscripcion {

    private int idInscripcion;
    private String fechaInscripcion;
    private String estado;
    private Participante participante;
    private Evento evento;

    public Inscripcion(int idInscripcion,
            Participante participante, Evento evento) {

        this.idInscripcion = idInscripcion;
        this.participante = participante;
        this.evento = evento;
        this.fechaInscripcion = "17/11/2026";
        this.estado = "Activa";
    }

    public void registrarInscripcion() {
        System.out.println("Inscripcion registrada.");
    }

    public boolean cancelarInscripcion() {
        if (estado.equals("Activa")) {
            estado = "Cancelada";
            evento.liberarCupo();
            return true;
        }
        return false;
    }

    public void consultarInscripcion() {
        System.out.println("Inscripcion: " + idInscripcion);
        System.out.println("Evento: " + evento.getNombre());
        System.out.println("Estado: " + estado);
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Evento getEvento() {
        return evento;
    }
}
