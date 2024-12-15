/**
 * Clase ContactApp
 *
 * Resumen:
 * Esta clase representa la aplicación principal para la gestión de contactos. Proporciona una interfaz gráfica de usuario (GUI)
 * para agregar, buscar, actualizar, eliminar, importar y exportar contactos. Utiliza la clase `Agenda` para manejar la lógica
 * de gestión de contactos y la clase `HojaButton` para crear botones personalizados con forma de hoja. Además, permite mostrar
 * una imagen circular en el centro del círculo formado por los botones.
 *
 * Requisitos:
 * - Java Development Kit (JDK) 8 o superior.
 * - Librerías estándar de Java (javax.swing, java.awt, java.io, javax.imageio).
 *
 * Instrucciones de Instalación:
 * 1. Asegúrese de tener instalado JDK 8 o superior.
 * 2. Compile las clases `ContactApp`, `Agenda`, `Contacto`, `HojaButton` y `ImageUtils`.
 * 3. Ejecute la clase `ContactApp` para iniciar la aplicación.
 *
 * Guía de Uso:
 * - Al iniciar la aplicación, se muestra una ventana con opciones para gestionar contactos.
 * - Los usuarios pueden agregar, buscar, actualizar, eliminar contactos y ver la información del equipo de desarrollo.
 * - Los botones de importar y exportar permiten manejar contactos desde y hacia archivos externos.
 * - Una imagen circular se muestra en el centro del círculo formado por los botones.
 *
 * Estructura del Proyecto:
 * - ContactApp: Clase principal que inicia la aplicación y configura la GUI.
 * - Agenda: Clase que maneja la lógica de gestión de contactos.
 * - Contacto: Clase que representa un contacto individual.
 * - HojaButton: Clase personalizada para crear botones con forma de hoja.
 * - ImageUtils: Clase utilitaria para manipular imágenes.
 *
 * Manejo de Errores y Excepciones:
 * - La aplicación maneja errores de entrada del usuario y muestra mensajes de error apropiados usando `JOptionPane`.
 * - Los errores de importación y exportación de archivos se manejan y se muestran mensajes de error específicos.
 *
 * Pruebas:
 * - Asegúrese de probar todas las funcionalidades de la GUI, incluyendo agregar, buscar, actualizar, eliminar, importar y exportar contactos.
 *
 * Licencia:
 * - Este código se distribuye bajo la licencia MIT.
 *
 * Contactos y Soporte:
 * - Para soporte, contacte a los desarrolladores del proyecto.
 *
 * Notas adicionales:
 * - La aplicación utiliza iconos predeterminados de Java Swing para los cuadros de diálogo.
 * - Los botones de importar y exportar tienen una forma personalizada de hoja con un gradiente de color.
 * - La imagen circular en el centro se escala y recorta utilizando la clase `ImageUtils`.
 */

/**
 * Librerías Importadas:
 * - javax.swing.*: Proporciona clases para crear una interfaz gráfica de usuario (GUI) en Java.
 * - java.awt.*: Proporciona clases para la creación de interfaces gráficas y manejo de eventos.
 * - java.awt.event.*: Proporciona clases para manejar eventos de la GUI.
 * - java.awt.image.BufferedImage: Proporciona una clase para manejar imágenes en memoria.
 * - java.io.*: Proporciona clases para la entrada y salida de datos, incluyendo la manipulación de archivos.
 * - javax.imageio.ImageIO: Proporciona clases para leer y escribir imágenes.
 */

/**
 * Dependencias:
 * - Agenda: Clase que maneja la lógica de gestión de contactos.
 * - Contacto: Clase que representa un contacto individual.
 * - HojaButton: Clase personalizada para crear botones con forma de hoja.
 * - ImageUtils: Clase utilitaria para manipular imágenes.
 */

/**
 * Metodo Main:
 * - Propósito: Punto de entrada principal de la aplicación. Configura la ventana principal y los componentes de la GUI.
 * - Parámetros: String[] args - Argumentos de línea de comandos (no utilizados).
 * - Funcionamiento: Configura la ventana principal, añade los componentes de la GUI y define las acciones de los botones.
 */

/**
 * Metodo agregarContacto:
 * - Propósito: Solicita al usuario los datos de un nuevo contacto y lo agrega a la agenda.
 * - Parámetros: JFrame frame - La ventana principal de la aplicación.
 * - Funcionamiento: Solicita el nombre, teléfono y correo electrónico del contacto. Valida los datos y agrega el contacto a la agenda.
 */

/**
 * Metodo buscarContacto:
 * - Propósito: Solicita al usuario el nombre de un contacto y muestra su información si existe.
 * - Parámetros: JFrame frame - La ventana principal de la aplicación.
 * - Funcionamiento: Solicita el nombre del contacto, lo busca en la agenda y muestra la información del contacto si se encuentra.
 */

/**
 * Metodo actualizarContacto:
 * - Propósito: Solicita al usuario el nombre de un contacto y los nuevos datos para actualizarlo.
 * - Parámetros: JFrame frame - La ventana principal de la aplicación.
 * - Funcionamiento: Solicita el nombre del contacto, verifica si existe, y luego solicita los nuevos datos para actualizar el contacto.
 */

/**
 * Metodo eliminarContacto:
 * - Propósito: Solicita al usuario el nombre de un contacto y lo elimina de la agenda si existe.
 * - Parámetros: JFrame frame - La ventana principal de la aplicación.
 * - Funcionamiento: Solicita el nombre del contacto, verifica si existe, y lo elimina de la agenda si se encuentra.
 */

/**
 * Metodo mostrarFichaTecnica:
 * - Propósito: Muestra la información del equipo de desarrollo.
 * - Parámetros: JFrame frame - La ventana principal de la aplicación.
 * - Funcionamiento: Muestra un cuadro de diálogo con la información del equipo de desarrollo.
 */

/**
 * Metodo salirAplicacion:
 * - Propósito: Cierra la aplicación.
 * - Parámetros: Ninguno.
 * - Funcionamiento: Llama a System.exit(0) para cerrar la aplicación.
 */

/**
 * Metodo listarContactos:
 * - Propósito: Muestra una lista de todos los contactos en la agenda.
 * - Parámetros: JFrame frame - La ventana principal de la aplicación.
 * - Funcionamiento: Recorre la lista de contactos y muestra la información de cada uno en un cuadro de diálogo.
 */

/**
 * Metodo crearBotonCircular:
 * - Propósito: Crea un botón circular con un gradiente de color.
 * - Parámetros: String texto - El texto del botón.
 *              Color color1 - El primer color del gradiente.
 *              Color color2 - El segundo color del gradiente.
 * - Funcionamiento: Sobrescribe el metodo paintComponent para dibujar un boton circular con un gradiente de color.
 */

/**
 * Metodo colocarBotonesEnCirculo:
 * - Propósito: Coloca los botones en un círculo alrededor del centro del panel.
 * - Parámetros: JLayeredPane panel - El panel que contiene los botones.
 *              JFrame frame - La ventana principal de la aplicación.
 * - Funcionamiento: Calcula las posiciones de los botones y los coloca en un círculo alrededor del centro del panel.
 */


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ContactApp {
    private static Agenda agenda = new Agenda();
    private static BufferedImage circularImage;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Agenda de Contactos");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Fondo personalizable
        JLabel fondo = new JLabel(new ImageIcon("C:/Users/Usuario/IdeaProjects/P/Spojenie-G1-GF/Required Files/Fondo.png"));
        fondo.setLayout(new BorderLayout());
        frame.setContentPane(fondo);

        // Crear el panel de botones y añadirlo al marco principal
        JLayeredPane layeredPane = new JLayeredPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (circularImage != null) {
                    int x = (getWidth() - circularImage.getWidth()) / 2;
                    int y = (getHeight() - circularImage.getHeight()) / 2;
                    g.drawImage(circularImage, x, y, null);
                }
            }
        };
        fondo.add(layeredPane, BorderLayout.CENTER);

        try {
            BufferedImage image = ImageIO.read(new File("C:/Users/Usuario/IdeaProjects/P/Spojenie-G1-GF/Required Files/fondo2.png"));
            circularImage = ImageUtils.cropImageToCircle(image, 800); // Ajustar el tamaño de la imagen
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Crear botones adicionales
        // Crear botones adicionales con la forma de hoja
        HojaButton importarButton = new HojaButton("Importar");
        HojaButton exportarButton = new HojaButton("Exportar");

        importarButton.setBounds(950, 100, 160, 160); // Posicionados en la parte inferior
        exportarButton.setBounds(950, 500, 160, 160);

        importarButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecciona un archivo para importar contactos");
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    agenda.importarContactos(fileChooser.getSelectedFile().getAbsolutePath());
                    JOptionPane.showMessageDialog(frame, "Contactos importados con éxito.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error al importar contactos: " + ex.getMessage());
                }
            }
        });

        exportarButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecciona dónde guardar los contactos");
            int result = fileChooser.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    agenda.exportarContactos(fileChooser.getSelectedFile().getAbsolutePath());
                    JOptionPane.showMessageDialog(frame, "Contactos exportados con éxito.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error al exportar contactos: " + ex.getMessage());
                }
            }
        });

        // Crear botones circulares
        JButton agregarBtn = crearBotonCircular("Agregar", Color.orange, Color.red);
        agregarBtn.addActionListener(e -> agregarContacto(frame));

        JButton buscarBtn = crearBotonCircular("Buscar", Color.red, Color.orange);
        buscarBtn.addActionListener(e -> buscarContacto(frame));

        JButton actualizarBtn = crearBotonCircular("Actualizar", Color.orange, Color.red);
        actualizarBtn.addActionListener(e -> actualizarContacto(frame));

        JButton eliminarBtn = crearBotonCircular("Eliminar", Color.RED, Color.BLACK);
        eliminarBtn.addActionListener(e -> eliminarContacto(frame));

        JButton acercaDeBtn = crearBotonCircular("Acerca de", Color.LIGHT_GRAY, Color.BLACK);
        acercaDeBtn.addActionListener(e -> mostrarFichaTecnica(frame));

        JButton salirBtn = crearBotonCircular("Salir", Color.red, Color.orange);
        salirBtn.addActionListener(e -> salirAplicacion());

        JButton listarBtn = crearBotonCircular("Contactos", Color.orange, Color.red);
        listarBtn.addActionListener(e -> listarContactos(frame));

        // Añadir botones al panel
        layeredPane.add(importarButton);
        layeredPane.add(exportarButton);
        layeredPane.add(agregarBtn);
        layeredPane.add(buscarBtn);
        layeredPane.add(actualizarBtn);
        layeredPane.add(eliminarBtn);
        layeredPane.add(acercaDeBtn);
        layeredPane.add(salirBtn);
        layeredPane.add(listarBtn);

        // Evento para reposicionar los botones cuando se redimensiona la ventana
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                colocarBotonesEnCirculo(layeredPane, frame);
            }
        });

        frame.setVisible(true);
        colocarBotonesEnCirculo(layeredPane, frame); // Posición inicial de los botones
    }

    // Metodo para crear un botón circular personalizado con gradiente
    private static JButton crearBotonCircular(String texto, Color color1, Color color2) {
        JButton button = new JButton(texto) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
                g2.setPaint(gradient);
                g2.fillOval(0, 0, getWidth(), getHeight());

                super.paintComponent(g);
            }
        };

        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(150, 150));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);

        return button;
    }

    // Metodo para colocar los botones en un círculo alrededor del centro del panel
    private static void colocarBotonesEnCirculo(JLayeredPane panel, JFrame frame) {
        int centerX = frame.getWidth() / 2;
        int centerY = frame.getHeight() / 2;
        int radio = 250;

        // Asegúrate de que estás accediendo a los botones correctos.
        JButton[] botones = new JButton[]{
                (JButton) panel.getComponent(2),
                (JButton) panel.getComponent(3),
                (JButton) panel.getComponent(4),
                (JButton) panel.getComponent(5),
                (JButton) panel.getComponent(6),
                (JButton) panel.getComponent(7),
                (JButton) panel.getComponent(8)
        };

        int[] angulos = {0, 51, 102, 153, 204, 255, 306};

        for (int i = 0; i < botones.length; i++) {
            int x = (int) (centerX + radio * Math.cos(Math.toRadians(angulos[i])) - botones[i].getPreferredSize().width / 2);
            int y = (int) (centerY + radio * Math.sin(Math.toRadians(angulos[i])) - botones[i].getPreferredSize().height / 2);

            botones[i].setBounds(x, y, botones[i].getPreferredSize().width, botones[i].getPreferredSize().height);
        }
    }


    // Métodos para las acciones de cada botón
    private static void agregarContacto(JFrame frame) {
        Icon nombreIcono = UIManager.getIcon("OptionPane.questionIcon");
        Icon telefonoIcono = UIManager.getIcon("OptionPane.informationIcon");
        Icon emailIcono = UIManager.getIcon("OptionPane.warningIcon");

        String nombre = (String) JOptionPane.showInputDialog(
                frame,
                "Ingrese el nombre del contacto:",
                "Agregar - Nombre",
                JOptionPane.PLAIN_MESSAGE,
                nombreIcono,
                null,
                null
        );

        if (nombre != null) {
            String telefono = (String) JOptionPane.showInputDialog(
                    frame,
                    "Ingrese el teléfono del contacto:",
                    "Agregar - Teléfono",
                    JOptionPane.PLAIN_MESSAGE,
                    telefonoIcono,
                    null,
                    null
            );

            if (telefono != null) {
                if (!telefono.matches("\\d{7,15}")) {
                    JOptionPane.showMessageDialog(frame, "Número de teléfono inválido. Debe contener entre 7 y 15 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String email = (String) JOptionPane.showInputDialog(
                        frame,
                        "Ingrese el email del contacto (opcional):",
                        "Agregar - Email",
                        JOptionPane.PLAIN_MESSAGE,
                        emailIcono,
                        null,
                        null
                );

                // Si el email es nulo o vacío, se guarda como una cadena vacía
                if (email == null || email.isEmpty()) {
                    email = "";
                } else if (!email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]{2,4})+$")) {
                    JOptionPane.showMessageDialog(frame, "Email inválido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Contacto nuevo = new Contacto(nombre, telefono, email);
                agenda.agregarContacto(nuevo);
                JOptionPane.showMessageDialog(frame, "Contacto agregado con éxito.");
            }
        }
    }

    private static void buscarContacto(JFrame frame) {
        Icon buscarIcono = UIManager.getIcon("OptionPane.searchIcon"); // Icono para buscar
        String nombre = (String) JOptionPane.showInputDialog(
                frame,
                "Ingrese el nombre del contacto a buscar:",
                "Buscar Contacto",
                JOptionPane.PLAIN_MESSAGE,
                buscarIcono, // Icono aquí
                null,
                null
        );

        if (nombre != null) {
            Contacto contacto = agenda.buscarContacto(nombre);
            if (contacto != null) {
                JOptionPane.showMessageDialog(frame, contacto.toString(), "Resultado de Búsqueda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Contacto no encontrado.", "Buscar Contacto", JOptionPane.WARNING_MESSAGE);
            }
        }
    }


    private static void actualizarContacto(JFrame frame) {
        Icon actualizarIcono = UIManager.getIcon("OptionPane.informationIcon");
        String nombre = (String) JOptionPane.showInputDialog(
                frame,
                "Ingrese el nombre del contacto a actualizar:",
                "Actualizar Contacto",
                JOptionPane.PLAIN_MESSAGE,
                actualizarIcono,
                null,
                null
        );

        if (nombre != null) {
            Contacto contacto = agenda.buscarContacto(nombre);
            if (contacto != null) {
                String nuevoTelefono = (String) JOptionPane.showInputDialog(
                        frame,
                        "Ingrese el nuevo teléfono:",
                        "Actualizar - Teléfono",
                        JOptionPane.PLAIN_MESSAGE,
                        actualizarIcono,
                        null,
                        null
                );

                if (nuevoTelefono != null && !nuevoTelefono.matches("\\d{7,15}")) {
                    JOptionPane.showMessageDialog(frame, "Número de teléfono inválido. Debe contener entre 7 y 15 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String nuevoEmail = (String) JOptionPane.showInputDialog(
                        frame,
                        "Ingrese el nuevo email (deje en blanco para mantener el actual):",
                        "Actualizar - Email",
                        JOptionPane.PLAIN_MESSAGE,
                        actualizarIcono,
                        null,
                        null
                );

                if (nuevoEmail != null && !nuevoEmail.isEmpty() && !nuevoEmail.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]{2,4})+$")) {
                    JOptionPane.showMessageDialog(frame, "Email inválido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (nuevoTelefono != null) {
                    contacto.setTelefono(nuevoTelefono);
                }
                if (nuevoEmail != null && !nuevoEmail.isEmpty()) {
                    contacto.setEmail(nuevoEmail);
                }
                agenda.actualizarContacto(nombre, contacto.getTelefono(), contacto.getEmail());
                JOptionPane.showMessageDialog(frame, "Contacto actualizado con éxito.", "Actualizar Contacto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Contacto no encontrado.", "Actualizar Contacto", JOptionPane.WARNING_MESSAGE);
            }
        }
    }


    private static void listarContactos(JFrame frame) {
        Icon listaIcono = UIManager.getIcon("OptionPane.informationIcon"); // Icono para lista
        StringBuilder lista = new StringBuilder("Contactos:\n");
        for (Contacto contacto : agenda.getContactos()) {
            lista.append(contacto.toString()).append("\n");
        }

        if (lista.toString().equals("Contactos:\n")) {
            JOptionPane.showMessageDialog(frame, "No hay contactos en la agenda.", "Lista de Contactos", JOptionPane.INFORMATION_MESSAGE, listaIcono);
        } else {
            JOptionPane.showMessageDialog(frame, lista.toString(), "Lista de Contactos", JOptionPane.INFORMATION_MESSAGE, listaIcono);
        }
    }


    private static void eliminarContacto(JFrame frame) {
        // Configurar icono de advertencia predeterminado de Swing
        Icon iconoWarning = UIManager.getIcon("OptionPane.warningIcon");

        // Mostrar cuadro de diálogo personalizado
        String nombre = (String) JOptionPane.showInputDialog(
                frame,                               // Componente padre
                "Ingrese el nombre del contacto a eliminar:", // Mensaje
                "Eliminar Contacto",                 // Título
                JOptionPane.WARNING_MESSAGE,         // Tipo de mensaje con icono predeterminado
                iconoWarning,                        // Icono de advertencia predeterminado
                null,                                // Opciones disponibles (null permite input)
                null                                 // Valor inicial
        );

        // Lógica de eliminación del contacto
        if (nombre != null) {
            Contacto contacto = agenda.buscarContacto(nombre);
            if (contacto != null) {
                agenda.eliminarContacto(nombre);
                // Mostrar mensaje de confirmación si se eliminó correctamente
                JOptionPane.showMessageDialog(
                        frame,
                        "El contacto \"" + nombre + "\" fue eliminado correctamente.",
                        "Eliminar Contacto",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                // Mostrar mensaje si no se encuentra el contacto
                JOptionPane.showMessageDialog(
                        frame,
                        "No se encontró un contacto con ese nombre.",
                        "Eliminar Contacto",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        }
    }


    private static void mostrarFichaTecnica(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "\uD83D\uDC69\u200D\uD83D\uDCBB Natalia Niño\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Bryant Cardoza\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Jhoan Araque Jaimes\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Deyson Carrillo\n" +
                "\uD83D\uDE80Construyendo conexiones que transforman ideas en acciones.\n" +
                "Version 1.0");
    }

    private static void salirAplicacion() {
        System.exit(0);
    }
}


