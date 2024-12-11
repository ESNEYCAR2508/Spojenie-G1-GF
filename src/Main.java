/**
 gitClase Main
 -Esta clase contiene el punto de entrada principal de la aplicacion.
 -Permite gestionar contactos mediante un menu de opciones.
 -Los usuarios pueden agregar, buscar, actualizar, eliminar contactos y ver la informacion.

 Funcionalidades principales:
 -Agregar contacto:Solicita al usuario nombre, telefono y email para almacenar un nuevo contacto.
 -Buscar contacto:Permite buscar contactos por nombre y muestra la informacion completa si se encuentra.
 -Actualizar contacto:Solicita el nombre del contacto a actualizar junto con el nuevo telefono y email.
 -Eliminar contacto:Solicita el nombre del contacto a eliminar de la lista.
 -Mostrar ficha tecnica:Proporciona informacion del equipo de desarrollo.

 Validaciones:
 -El sistema asegura que las entradas del usuario sean consistentes.
 -Se limpia el buffer despues de leer datos numericos para evitar problemas con la entrada de texto.

 Detalles adicionales:
 -Utiliza la clase Scanner para la entrada de datos.
 -La ejecucion del programa se realiza en un bucle que termina al seleccionar la opcion de salir.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            // Mostrar menu de opciones
            System.out.println("\n--- Agenda de Contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Acerca de");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar contacto
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese telefono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese email: ");
                    String email = scanner.nextLine();
                    agenda.agregarContacto(new Contacto(nombre, telefono, email));
                    break;

                case 2:
                    // Buscar contacto
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Contacto contacto = agenda.buscarContacto(nombreBuscar);
                    if (contacto != null) {
                        System.out.println("Contacto encontrado: " + contacto);
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;

                case 3:
                    // Actualizar contacto
                    System.out.print("Ingrese el nombre del contacto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo telefono: ");
                    String nuevoTelefono = scanner.nextLine();
                    System.out.print("Ingrese el nuevo email: ");
                    String nuevoEmail = scanner.nextLine();
                    agenda.actualizarContacto(nombreActualizar, nuevoTelefono, nuevoEmail);
                    break;

                case 4:
                    // Eliminar contacto
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    agenda.eliminarContacto(nombreEliminar);
                    break;

                case 5:
                    // Mostrar ficha tecnica
                    agenda.mostrarFichaTecnica();
                    break;

                case 6:
                    // Salir
                    System.out.println("Saliendo de la agenda...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}
