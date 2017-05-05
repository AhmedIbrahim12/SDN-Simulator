/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdn;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Ahmed Ibrahim
 */
public class Controller {
    int controllerNumber;
    String IP;
    JButton b;
    ControllerWindow w;

    public Controller(int n) {
        this.controllerNumber=n;
        w = new ControllerWindow(n);
        w.controllerNum = controllerNumber;
        this.IP = w.IP;
        Image play;
        try {
            play = ImageIO.read(getClass().getResource("/images/controller.png"));
            b = new JButton(new ImageIcon(play));
            b.setBounds(20, 20, 128, 128);
            DragListener drag = new DragListener();
            b.addMouseListener(drag);
            b.addMouseMotionListener(drag);
            b.addActionListener(new OpenWindow(w));
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static class OpenWindow implements ActionListener {

        ControllerWindow window;

        public OpenWindow(ControllerWindow w) {
            this.window = w;
        }

        public void actionPerformed(ActionEvent e) {
            this.window.setVisible(true);
        }
    }
}
