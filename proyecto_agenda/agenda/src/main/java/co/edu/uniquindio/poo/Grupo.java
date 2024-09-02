package co.edu.uniquindio.poo;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    private List<Contacto> contactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    @Override
    public String toString() {
        return "El nombre del grupo es " + nombre + ", categoría: " + categoria + ", y sus contactos son " + contactos;
    }
}
    


