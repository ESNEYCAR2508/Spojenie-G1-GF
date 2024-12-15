
/**
  Clase Agenda
  Esta clase representa una agenda para la gestión de contactos personales.
  Ofrece diversas funcionalidades para añadir, buscar, actualizar y eliminar contactos.
  Además, incluye validaciones para evitar duplicados y asegurar que los correos electrónicos sean válidos.

  Funcionalidades principales:
  - **Agregar contactos**: Permite añadir contactos únicos verificando que el nombre no se repita
    y que el email tenga un formato válido. Si se cumplen las condiciones, el contacto se almacena.
  - **Buscar contactos**: Permite localizar un contacto existente mediante su nombre, sin importar
    mayúsculas o minúsculas.
  - **Actualizar información**: Facilita la modificación del teléfono y el email de un contacto existente.
  - **Eliminar contactos**: Permite remover un contacto de la lista utilizando su nombre como referencia.
  - **Ficha técnica**: Proporciona información del equipo que desarrolló la aplicación.

  Validaciones:
  - Los contactos deben tener nombres únicos dentro de la lista.
  - El formato del email debe seguir el estándar correcto (e.g., ejemplo@dominio.com).

  Detalles adicionales:
  - La clase utiliza un ArrayList para almacenar los contactos, lo que permite un manejo dinámico
    del tamaño de la lista.
  - Las validaciones de correo electrónico se realizan mediante expresiones regulares.
 **/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    // Método para exportar contactos a un archivo
    public void exportarContactos(String rutaArchivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Contacto contacto : contactos) {
                writer.write(contacto.getNombre() + "," + contacto.getTelefono() + "," + contacto.getEmail());
                writer.newLine();
            }
        }
    }

    // Método para importar contactos desde un archivo
    public void importarContactos(String rutaArchivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    Contacto contacto = new Contacto(partes[0], partes[1], partes[2]);
                    contactos.add(contacto);
                }
            }
        }
    }



    public void agregarContacto(Contacto contacto) {
        if (buscarContacto(contacto.getNombre()) == null && validarEmail(contacto.getEmail()) && validarTelefono(contacto.getTelefono())) {
            contactos.add(contacto);
            System.out.println("Contacto agregado exitosamente.");
        } else {
            System.out.println("Contacto duplicado, email o teléfono inválido.");
        }
    }

    private boolean validarTelefono(String telefono) {
        return telefono != null && telefono.matches("\\d{7,15}");
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


    public ArrayList<Contacto> getContactos() {
        return contactos;
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
        System.out.println(  "👩‍💻 Natalia Niño\n" +
                "👨‍💻 Bryant Cardoza\n" +
                "👨‍💻 Jhoan Araque Jaimes\n" +
                "👨‍💻 Deyson Carrillo\n" +
                "🚀 \"Construyendo conexiones que transforman ideas en acciones.");
    }


    private boolean validarEmail(String email) {
        return email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]{2,4})+$");
    }
}

