/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Minh Tri
 */
public class In_HinhMach {
    public static ImageIcon In(String _tenhinh)
    {
        ImageIcon icon=new ImageIcon();
        try {
            // TODO add your handling code here:
            BufferedImage img=ImageIO.read(new File("./images/"+_tenhinh+".jpg"));
            icon=new ImageIcon(img);
            
        } catch (IOException ex) {
            Logger.getLogger(GiaoDien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return icon;
    }
}
