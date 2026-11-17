package Entidades;

public abstract class Usuario {

    private int id;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contraseña;
    private String email;

    public Usuario(int id, String nombre, String apellido,
            String nombreUsuario, String contraseña, String email) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.email = email;
    }

    public boolean iniciarSesion(String usuario, String clave) {
        return nombreUsuario.equals(usuario)
                && contraseña.equals(clave);
    }

    public void cerrarSesion() {
        System.out.println("Sesion cerrada.");
    }

    public boolean recuperarContraseña(String email) {
        return this.email.equals(email);
    }

    public String recuperarUsuario(String email) {
        if (this.email.equals(email)) {
            return nombreUsuario;
        }
        return null;
    }

    public abstract void mostrarDatos();

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}