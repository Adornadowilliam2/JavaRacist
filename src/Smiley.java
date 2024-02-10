import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Smiley extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        int faceSize = Math.min(width, height) - 40;
        int x = (width - faceSize) / 2;
        int y = (height - faceSize) / 2;

        g.setColor(Color.YELLOW);
        g.fillOval(x, y, faceSize, faceSize); // draw face

        int eyeSize = faceSize / 5;
        int eyeOffset = faceSize / 4;
        int mouthWidth = faceSize / 2;
        int mouthHeight = faceSize / 4;

        g.setColor(Color.BLACK);
        // draw eyes
        for (int i = 0; i < 2; i++) {
            int eyeX = x + eyeOffset + i * (faceSize - 2 * eyeOffset - eyeSize);
            int eyeY = y + faceSize / 3;
            g.fillOval(eyeX, eyeY, eyeSize, eyeSize);
        }

        // draw mouth
        int mouthX = x + (faceSize - mouthWidth) / 2;
        int mouthY = y + 2 * faceSize / 3 - mouthHeight / 2;
        g.fillArc(mouthX, mouthY, mouthWidth, mouthHeight, 0, -180);
    }

    public static void main(String[] args) {
        Smiley smiley = new Smiley();
        JFrame app = new JFrame();
        app.add(smiley);
        app.setSize(300, 300);
        app.setLocationRelativeTo(null); // center the window on the screen
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
