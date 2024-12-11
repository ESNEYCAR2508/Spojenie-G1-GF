
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
 */

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

