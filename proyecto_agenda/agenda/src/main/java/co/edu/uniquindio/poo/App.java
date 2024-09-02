package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Crear contactos
        Contacto contacto1 = new Contacto("Laura", "Lala", "Conjunto bosque", "+57 3127062992", "lau@gmail.com");
        Contacto contacto2 = new Contacto("Maria", "mari", "Barrio Kioskos", "+57 317277881", "maria@gmail.com");
        Contacto contacto3 = new Contacto("Martin", "Papá", "Mi casa", "+57 3156906745", "martinval@gmail.com");
        Contacto contacto4 = new Contacto("Jorge", "Tio España", "Madrid, España", "+34 3156562497", "jorgeg@gmail.com");
        Contacto contacto5 = new Contacto("Pedro", "Amigo universidad", "Barrio los alamos", "+57 3215948721", "pedrolastr@gmail.com");
        Contacto contacto6 = new Contacto("Jose Antonio", "Toño", "Conjunto violetas", "+57 3006498828", "tonito@gmail.com");
        Contacto contacto7 = new Contacto("Rosa Maria", "Abuela", "Mi casa", "+57 3124856612", "rosita@gmail.com");
        Contacto contacto8 = new Contacto("Manuel", "Amigo Universidad", "Conjunto monteverde", "+57 3144230806", "ahdmanuel@gmail.com");
        Contacto contacto9 = new Contacto("Saray", "Amiga colegio", "Barrio granada", "+57 3214576420", "sarayqr@gmail.com");
        Contacto contacto10 = new Contacto("Mariana", "Amiga universidad", "Barrio los alamos", "+57 3204485678", "mariana521@gmail.com");
        Contacto contacto11 = new Contacto("Michelle", "Amiga universidad", "Barrio campestre", "+57 3154896241", "mich0928@gmail.com");



        // Agregar contactos a la agenda
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto4);
        agenda.agregarContacto(contacto5);
        agenda.agregarContacto(contacto6);
        agenda.agregarContacto(contacto7);
        agenda.agregarContacto(contacto8);
        agenda.agregarContacto(contacto9);
        agenda.agregarContacto(contacto10);
        agenda.agregarContacto(contacto11);



        // Crear grupos
        Grupo grupo1 = new Grupo("Proyecto de grado", Categoria.AMIGOS);
        grupo1.agregarContacto(contacto8);
        grupo1.agregarContacto(contacto5);
        grupo1.agregarContacto(contacto10);
        grupo1.agregarContacto(contacto11);
        grupo1.agregarContacto(contacto9);        


        Grupo grupo2 = new Grupo("Cumpleaños abuela", Categoria.FAMILIA);
        grupo2.agregarContacto(contacto1);
        grupo2.agregarContacto(contacto3);
        grupo2.agregarContacto(contacto4);
        grupo2.agregarContacto(contacto6);
        grupo2.agregarContacto(contacto8);
        


        // Agregar grupos a la agenda
        agenda.agregarGrupo(grupo1);
        agenda.agregarGrupo(grupo2);


        // Crear reuniones
        Reunion reunion1 = new Reunion("Reunion de trabajo", "2024-09-14", "10:00AM");
        reunion1.agregarAsistente(contacto8);
        reunion1.agregarAsistente(contacto10);
        reunion1.agregarAsistente(contacto11);
        reunion1.agregarAsistente(contacto5);

        // Agregar reuniones a la agenda
        agenda.agregarReunion(reunion1);

        Agenda.mostrarMensaje(agenda.toString());
    }
}
        
    

