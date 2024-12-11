import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ContactApp {
    private static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Agenda de Contactos");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Fondo personalizable
        JLabel fondo = new JLabel(new ImageIcon("C:/Users/Usuario/IdeaProjects/P/Spojenie-G1-GF/Required Files/Fondo.png"));
        fondo.setLayout(new BorderLayout());
        frame.setContentPane(fondo);

        // Crear el panel de botones y añadirlo al marco principal
        JLayeredPane layeredPane = new JLayeredPane();
        fondo.add(layeredPane, BorderLayout.CENTER);

        // Crear botones personalizados con diferentes colores y añadir acción a cada uno
        JButton agregarBtn = crearBotonCircular("Agregar", Color.MAGENTA, Color.BLACK);
        agregarBtn.addActionListener(e -> agregarContacto(frame));

        JButton buscarBtn = crearBotonCircular("Buscar", Color.BLUE, Color.BLACK);
        buscarBtn.addActionListener(e -> buscarContacto(frame));

        JButton actualizarBtn = crearBotonCircular("Actualizar", Color.GREEN, Color.BLACK);
        actualizarBtn.addActionListener(e -> actualizarContacto(frame));

        JButton eliminarBtn = crearBotonCircular("Eliminar", Color.RED, Color.BLACK);
        eliminarBtn.addActionListener(e -> eliminarContacto(frame));

        JButton acercaDeBtn = crearBotonCircular("Acerca de", Color.LIGHT_GRAY, Color.BLACK);
        acercaDeBtn.addActionListener(e -> mostrarFichaTecnica(frame));

        JButton salirBtn = crearBotonCircular("Salir", Color.PINK, Color.BLACK);
        salirBtn.addActionListener(e -> salirAplicacion());

        // Añadir botones al panel
        layeredPane.add(agregarBtn);
        layeredPane.add(buscarBtn);
        layeredPane.add(actualizarBtn);
        layeredPane.add(eliminarBtn);
        layeredPane.add(acercaDeBtn);
        layeredPane.add(salirBtn);

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

                // Fondo del botón circular con gradiente difuminado
                GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
                g2.setPaint(gradient);
                g2.fillOval(0, 0, getWidth(), getHeight());

                super.paintComponent(g);
            }
        };

        // Estilos del botón circular
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(150, 150)); // Tamaño del botón circular (más grande)
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);

        return button;
    }

    // Metodo para colocar los botones en un círculo alrededor del centro del panel
    private static void colocarBotonesEnCirculo(JLayeredPane panel, JFrame frame) {
        int centerX = frame.getWidth() / 2;
        int centerY = frame.getHeight() / 2;
        int radio = 250;

        JButton[] botones = new JButton[6];
        int[] angulos = {0, 60, 120, 180, 240, 300};

        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (panel.getComponent(i) instanceof JButton) {
                botones[i] = (JButton) panel.getComponent(i);
                int x = (int) (centerX + radio * Math.cos(Math.toRadians(angulos[i])) - botones[i].getPreferredSize().width / 2);
                int y = (int) (centerY + radio * Math.sin(Math.toRadians(angulos[i])) - botones[i].getPreferredSize().height / 2);

                botones[i].setBounds(x, y, botones[i].getPreferredSize().width, botones[i].getPreferredSize().height);
            }
        }
    }

    // Métodos para las acciones de cada botón
    private static void agregarContacto(JFrame frame) {
        String nombre = JOptionPane.showInputDialog(frame, "Ingrese el nombre del contacto:");
        String telefono = JOptionPane.showInputDialog(frame, "Ingrese el teléfono del contacto:");
        String email = JOptionPane.showInputDialog(frame, "Ingrese el email del contacto:");

        if (nombre != null && telefono != null && email != null) {
            Contacto nuevo = new Contacto(nombre, telefono, email);
            agenda.agregarContacto(nuevo);
        }
    }


    private static void buscarContacto(JFrame frame) {
        String nombre = JOptionPane.showInputDialog(frame, "Ingrese el nombre del contacto a buscar:");
        if (nombre != null) {
            Contacto contacto = agenda.buscarContacto(nombre);
            if (contacto != null) {
                JOptionPane.showMessageDialog(frame, contacto.toString());
            } else {
                JOptionPane.showMessageDialog(frame, "Contacto no encontrado.");
            }
        }
    }


    private static void actualizarContacto(JFrame frame) {
        String nombre = JOptionPane.showInputDialog(frame, "Ingrese el nombre del contacto a actualizar:");
        if (nombre != null) {
            String nuevoTelefono = JOptionPane.showInputDialog(frame, "Ingrese el nuevo teléfono:");
            String nuevoEmail = JOptionPane.showInputDialog(frame, "Ingrese el nuevo email:");
            if (nuevoTelefono != null && nuevoEmail != null) {
                agenda.actualizarContacto(nombre, nuevoTelefono, nuevoEmail);
            }
        }
    }


    private static void eliminarContacto(JFrame frame) {
        String nombre = JOptionPane.showInputDialog(frame, "Ingrese el nombre del contacto a eliminar:");
        if (nombre != null) {
            agenda.eliminarContacto(nombre);
        }
    }


    private static void mostrarFichaTecnica(JFrame frame) {
        JOptionPane.showMessageDialog( frame,  "👩‍💻 Natalia Niño\n" + "👨‍💻 Bryant Cardoza\n" + "👨‍💻 Jhoan Araque Jaimes\n" + "👨‍💻 Deyson Carrillo\n" + "🚀Construyendo conexiones que transforman ideas en acciones.\n" + "Version 1.0");
    }


    private static void salirAplicacion() {
        System.exit(0);
    }

}


