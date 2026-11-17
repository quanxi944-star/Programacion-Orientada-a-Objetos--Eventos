package Entidades;

import java.util.ArrayList;

public class GestorEventos implements Gestionable {

    private ArrayList<Evento> eventos;

    public GestorEventos() {
        eventos = new ArrayList<>();
    }

    @Override
    public void registrar(Evento e) {
        eventos.add(e);
        System.out.println("Evento registrado correctamente.");
    }

    @Override
    public void eliminar(int id) {

        for (Evento e : eventos) {
            if (e.getIdEvento() == id) {
                e.eliminarEvento();
                System.out.println("Evento eliminado.");
                return;
            }
        }

        System.out.println("Evento no encontrado.");
    }

    @Override
    public void actualizar(Evento evento) {

        for (Evento e : eventos) {
            if (e.getIdEvento() == evento.getIdEvento()) {
                e.setNombre(evento.getNombre());
                e.setDescripcion(evento.getDescripcion());
                e.setFecha(evento.getFecha());
                e.setUbicacion(evento.getUbicacion());
                e.setCapacidadMaxima(evento.getCapacidadMaxima());

                System.out.println("Evento actualizado.");
                return;
            }
        }

        System.out.println("Evento no encontrado.");
    }

    @Override
    public void consultar() {

        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
        }

        for (Evento e : eventos) {
            e.consultarEvento();
            System.out.println("----------------------");
        }
    }

    public Evento buscarEvento(int id) {

        for (Evento e : eventos) {
            if (e.getIdEvento() == id) {
                return e;
            }
        }

        return null;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }
}
