import java.awt.*;
import java.awt.event.*;

class KEHandling extends Frame implements KeyListener {

    String msg = "", msg2 = "";

    KEHandling() {
        addKeyListener(this);
        setFocusable(true);
    }

    public void keyPressed(KeyEvent ke) {
        msg = "Key Pressed";
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        msg2 += ke.getKeyChar();
        msg = "Key Typed";
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        // Optional: you can handle this if needed
    }

    public static void main(String args[]) {
        KEHandling kh = new KEHandling();
        kh.setTitle("My First Window");
        kh.setSize(400, 300);
        kh.setVisible(true);

        kh.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 50);
        g.drawString(msg2, 100, 100);
    }
}