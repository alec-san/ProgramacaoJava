/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorsw;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;


/**
 *
 * @author Alecksandre
 */
public class Sobre extends JDialog {

    public Sobre() {

       this.setSize(350, 350);
       this.setLocationRelativeTo(null);
//     this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       this.setTitle("Sobre Editor Swing");
//     this.setVisible(false);
//     this.setResizable(false);   

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                this.windowClosed(evt);
            }
        });

    }

}
