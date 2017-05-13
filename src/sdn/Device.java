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
import static java.util.logging.Logger.global;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Ahmed Ibrahim
 */
public class Device extends DeviceWindow{

    int DeviceNumber;
    String IP;
    JButton b;
    DeviceWindow w;
    Boolean state;
    String deviceType;
    
    public Device(int n, String imagePath,String dType) {
        this.deviceType = dType;
        this.DeviceNumber = n;
        w = new DeviceWindow(this,n,dType);
        Image play;
        try {
            play = ImageIO.read(getClass().getResource(imagePath));
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

    class OpenWindow implements ActionListener {

        DeviceWindow window;

        public OpenWindow(DeviceWindow w) {
            this.window = w;
        }

        public void actionPerformed(ActionEvent e) {
            this.window.setVisible(true);
        }
    }
}
