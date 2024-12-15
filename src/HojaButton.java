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