/**
 * Clase HojaButton
 *
 * Resumen:
 * Esta clase extiende `JButton` para crear un botón con forma de hoja y un diseño personalizado. Utiliza `Java2D` para dibujar
 * la forma de la hoja y aplicar un gradiente de color.
 *
 * Requisitos:
 * - Java Development Kit (JDK) 8 o superior.
 * - Librerías estándar de Java (javax.swing, java.awt).
 *
 * Guía de Uso:
 * - Cree una instancia de `HojaButton` pasando el texto del botón como parámetro.
 * - Agregue el botón a un contenedor de Swing como cualquier otro componente.
 *
 * Ejemplo de Uso:
 * <pre>
 * HojaButton importarButton = new HojaButton("Importar");
 * frame.add(importarButton);
 * </pre>
 *
 * Estructura del Proyecto:
 * - HojaButton: Clase personalizada que extiende `JButton` y sobrescribe el metodo paintComponent para dibujar la forma de la hoja.
 *
 * Manejo de Errores y Excepciones:
 * - La clase no maneja errores específicos, ya que se basa en la funcionalidad estándar de `JButton`.
 *
 * Licencia:
 * - Este código se distribuye bajo la licencia MIT.
 *
 * Notas adicionales:
 * - La forma de la hoja se dibuja utilizando `GeneralPath` y se rellena con un gradiente de color.
 * - El texto del botón se centra automáticamente dentro de la forma de la hoja.
 */

/**
 * Librerías Importadas:
 * - javax.swing.*: Proporciona clases para crear una interfaz gráfica de usuario (GUI) en Java.
 * - java.awt.*: Proporciona clases para la creación de interfaces gráficas y manejo de eventos.
 * - java.awt.geom.GeneralPath: Proporciona una clase para definir formas geométricas complejas.
 */

/**
 * Constructor HojaButton:
 * - Propósito: Crea un botón con forma de hoja y un diseño personalizado.
 * - Parámetros: String text - El texto del botón.
 * - Funcionamiento: Configura el botón para que no tenga área de contenido, enfoque ni borde pintado, y establece el tamaño preferido.
 */

/**
 * Metodo paintComponent:
 * - Propósito: Dibuja la forma de la hoja y el texto del botón.
 * - Parámetros: Graphics g - El contexto gráfico.
 * - Funcionamiento: Utiliza `Graphics2D` para dibujar la forma de la hoja con un gradiente de color y centra el texto del botón.
 */




import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class HojaButton extends JButton {
    public HojaButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setPreferredSize(new Dimension(170, 170));
        setFont(new Font("Arial", Font.BOLD, 17)); // Ajustar el tamaño de la letra
        setForeground(Color.WHITE); // Ajustar el color de la letra
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar la forma de la hoja
        GeneralPath hoja = new GeneralPath();
        hoja.moveTo(75, 0);
        hoja.curveTo(100, 50, 150, 50, 75, 150);
        hoja.curveTo(0, 50, 50, 50, 75, 0);
        hoja.closePath();

        // Rellenar la hoja con un gradiente de color
        GradientPaint gradient = new GradientPaint(0, 0, new Color(255, 165, 0), getWidth(), getHeight(), new Color(255, 69, 0));
        g2.setPaint(gradient);
        g2.fill(hoja);

        // Dibujar el texto del botón
        g2.setColor(getForeground());
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = (getHeight() + fm.getAscent()) / 2 - 5;
        g2.drawString(getText(), x, y);

        g2.dispose();
    }
}