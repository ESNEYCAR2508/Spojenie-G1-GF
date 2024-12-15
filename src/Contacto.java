
/**
Clase Contacto
 /**
  Clase Contacto
  Esta clase representa un contacto personal con información básica como nombre, teléfono y correo electrónico.
  Está diseñada para ser utilizada como unidad básica en sistemas de gestión de contactos, como una agenda.

  Funcionalidades principales:
  - **Encapsulación de datos**: Permite almacenar y gestionar información personal de un contacto.
  - **Acceso a atributos**: Métodos para obtener y modificar los valores de los atributos nombre, teléfono y correo electrónico.
  - **Representación como texto**:  Metodo para obtener la informacion del contacto a manera de texto.

  Detalles de implementación:
  - Los atributos `nombre`, `telefono` y `email` son privados, asegurando que solo puedan ser modificados
    a través de los métodos de acceso (getters y setters).
  - El constructor permite inicializar un objeto `Contacto` con los valores de los atributos.
  - Incluye un metodo para facilitar la visualizacion del contacto de forma sencilla de leer y comprender.

  Restricciones :
  - Se debe validar los valores de los atributos antes de asignarlos mediante los métodos `set`
 */

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{7,15}")) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Número de teléfono inválido. Debe contener entre 7 y 15 dígitos.");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Email: " + email;
    }
}

