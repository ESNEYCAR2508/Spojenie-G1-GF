
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }


    public void agregarContacto(Contacto contacto) {
        if (buscarContacto(contacto.getNombre()) == null && validarEmail(contacto.getEmail())) {
            contactos.add(contacto);
            System.out.println("Contacto agregado exitosamente.");
        } else {
            System.out.println("Contacto duplicado o email inválido.");
        }
    }


    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }


    public void actualizarContacto(String nombre, String nuevoTelefono, String nuevoEmail) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contacto.setTelefono(nuevoTelefono);
            contacto.setEmail(nuevoEmail);
            System.out.println("Contacto actualizado exitosamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }


    public void eliminarContacto(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contactos.remove(contacto);
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }


    public void mostrarFichaTecnica() {
        System.out.println("Equipo: [Nombres, roles, eslogan]");
    }


    private boolean validarEmail(String email) {
        return email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]{2,4})+$");
    }
}

