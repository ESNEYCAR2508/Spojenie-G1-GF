/**
 * Clase ImageUtils
 *
 * Resumen:
 * Esta clase proporciona métodos utilitarios para manipular imágenes, incluyendo el recorte de imágenes en forma circular.
 *
 * Requisitos:
 * - Java Development Kit (JDK) 8 o superior.
 * - Librerías estándar de Java (java.awt, java.awt.geom, java.awt.image).
 *
 * Guía de Uso:
 * - Utilice el metodo cropImageToCircle para recortar una imagen de forma circular.
 *
 * Ejemplo de Uso:
 * <pre>
 * BufferedImage image = ImageIO.read(new File("ruta/a/la/imagen.png"));
 * BufferedImage circularImage = ImageUtils.cropImageToCircle(image, 200);
 * </pre>
 *
 * Estructura del Proyecto:
 * - ImageUtils: Clase utilitaria que proporciona métodos para manipular imágenes.
 *
 * Manejo de Errores y Excepciones:
 * - La clase no maneja errores específicos, ya que se basa en la funcionalidad estándar de las clases de Java.
 *
 * Licencia:
 * - Este código se distribuye bajo la licencia MIT.
 *
 * Notas adicionales:
 * - El metodo cropToImageCircle escala la imagen al tamaño especificado antes de recortarla en forma circular.
 */

/**
 * Librerías Importadas:
 * - java.awt.*: Proporciona clases para la creación de interfaces gráficas y manejo de eventos.
 * - java.awt.geom.Ellipse2D: Proporciona una clase para definir formas geométricas complejas.
 * - java.awt.image.BufferedImage: Proporciona una clase para manejar imágenes en memoria.
 */

/**
 * Metodo cropImageToCircle:
 * - Propósito: Recorta una imagen en forma circular y la escala al tamaño especificado.
 * - Parámetros: BufferedImage image - La imagen original.
 *              int diameter - El diámetro deseado para la imagen circular.
 * - Funcionamiento: Escala la imagen al tamaño especificado, crea una máscara circular y aplica la máscara a la imagen escalada.
 * - Retorno: BufferedImage - La imagen recortada en forma circular.
 */



import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class ImageUtils {
    public static BufferedImage cropImageToCircle(BufferedImage image, int diameter) {
        // Escalar la imagen al tamaño deseado
        Image scaledImage = image.getScaledInstance(diameter, diameter, Image.SCALE_SMOOTH);
        BufferedImage bufferedScaledImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = bufferedScaledImage.createGraphics();
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.dispose();

        // Crear una máscara circular
        BufferedImage mask = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        g2d = mask.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fill(new Ellipse2D.Double(0, 0, diameter, diameter));
        g2d.dispose();

        // Aplicar la máscara a la imagen escalada
        BufferedImage cropped = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        g2d = cropped.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawImage(bufferedScaledImage, 0, 0, null);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
        g2d.drawImage(mask, 0, 0, null);
        g2d.dispose();

        return cropped;
    }
}