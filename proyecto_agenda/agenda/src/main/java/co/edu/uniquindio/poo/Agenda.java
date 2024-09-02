package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private List<Grupo> grupos;
    private List<Reunion> reuniones;

    public Agenda() {
        this.contactos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.reuniones = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        if (validarContacto(contacto.getNombre(), contacto.getTelefono())){
            mostrarMensaje("Error, este contacto ya se encuentra agregado.");

        }else{
            contactos.add(contacto);
        }
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public boolean validarContacto(String nombre, String telefono){
        boolean contactoRepetido=false;
        for (Contacto contacto:contactos){
            if (contacto.getNombre().equals(nombre) || contacto.getTelefono().equals(telefono)){
                contactoRepetido=true;
            }
        }
        return contactoRepetido;
    
    }

    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    public void eliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

    public void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }

    public void eliminarReunion(Reunion reunion) {
        reuniones.remove(reunion);
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public List<Reunion> getReuniones() {
        return reuniones;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString(){
        return "En tu agenda tienes agregados los siguientes contactos: \n" +contactos+ "\n\n En tu agenda tienes los siguientes grupos: \n;" +grupos+ "\n\n En tu agenda tienes las siguientes reuniones: \n" +reuniones;
        
        
    }
}
