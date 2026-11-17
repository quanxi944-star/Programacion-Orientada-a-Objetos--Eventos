package Entidades;


public interface Gestionable {

    void registrar(Evento e);

    void eliminar(int id);

    void actualizar(Evento e);

    void consultar();
}
