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
                    System.out.print("Ingrese teléfono: ");
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
                    System.out.print("Ingrese el nuevo teléfono: ");
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
                    // Mostrar ficha técnica
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
