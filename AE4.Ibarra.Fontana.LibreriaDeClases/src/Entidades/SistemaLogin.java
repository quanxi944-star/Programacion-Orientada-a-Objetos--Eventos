package Entidades;

import java.util.ArrayList;

/**
 * Clase que administra el acceso de los usuarios al sistema.
 */
public class SistemaLogin {

    private ArrayList<Usuario> usuarios;

    public SistemaLogin() {
        usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario u) {

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(
                    u.getNombreUsuario())) {

                System.out.println("El usuario ya existe.");
                return;
            }
        }

        usuarios.add(u);
        System.out.println("Usuario registrado correctamente.");
    }

    public boolean iniciarSesion(String usuario, String clave) {

        for (Usuario u : usuarios) {
            if (u.iniciarSesion(usuario, clave)) {
                System.out.println("Bienvenido "
                        + u.getNombre() + "!");
                return true;
            }
        }

        System.out.println("Usuario o contraseña incorrectos.");
        return false;
    }

    public boolean recuperarContraseña(String email) {

        for (Usuario u : usuarios) {
            if (u.recuperarContraseña(email)) {
                System.out.println("Correo encontrado.");
                return true;
            }
        }

        System.out.println("Correo no encontrado.");
        return false;
    }

    public String recuperarUsuario(String email) {

        for (Usuario u : usuarios) {
            String usuario = u.recuperarUsuario(email);

            if (usuario != null) {
                return usuario;
            }
        }

        return null;
    }

    public void cerrarSesion() {
        System.out.println("Sesion cerrada correctamente.");
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
