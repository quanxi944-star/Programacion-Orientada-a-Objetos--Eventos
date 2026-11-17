package Main;

import Entidades.GestorEventos;
import Entidades.SistemaLogin;
import Entidades.Administrador;
import Entidades.Categoria;
import Entidades.Evento;
import Entidades.Inscripcion;
import Entidades.Participante;
import Entidades.Usuario;

public class Main {

    public static void main(String[] args) {

        GestorEventos gestor = new GestorEventos();
        SistemaLogin login = new SistemaLogin();

        Categoria categoria = new Categoria(
                1, "Tecnologia", "Eventos tecnologicos");

        Administrador admin = new Administrador(
                1,
                "Carlos",
                "Rodriguez",
                "carlos",
                "1234",
                "carlos@gmail.com",
                1,
                gestor
        );

        Participante participante = new Participante(
                2,
                "Maria",
                "Gomez",
                "maria",
                "5678",
                "maria@gmail.com",
                "3704000000"
        );

        login.registrarUsuario(admin);
        login.registrarUsuario(participante);

        System.out.println("\n-INICIO DE SESION-");
        login.iniciarSesion("carlos", "1234");

        Evento evento = new Evento(
                1,
                "Conferencia Java",
                "Introduccion a Java",
                "20/12/2026",
                "Formosa",
                50,
                categoria
        );

        System.out.println("\n-REGISTRO DE EVENTOS-");
        admin.altaEvento(evento);

        System.out.println("\n-LISTA DE EVENTOS-");
        admin.consultarEventos();

        System.out.println("\n-INSCRIPCION-");
        Inscripcion inscripcion = participante.inscribirse(evento);

        if (inscripcion != null) {
            inscripcion.consultarInscripcion();
        }

        System.out.println("\n-POLIMORFISMO-");

        Usuario[] usuarios = new Usuario[2];

        usuarios[0] = admin;
        usuarios[1] = participante;

        for (Usuario u : usuarios) {
            u.mostrarDatos();
        }

        System.out.println("\n-CANCELACION-");
        if (inscripcion != null) {
            participante.cancelarInscripcion(inscripcion);
        }

        System.out.println("\n-EVENTOS ACTUALES-");
        admin.consultarEventos();
    }
}

