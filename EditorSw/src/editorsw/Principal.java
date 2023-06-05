/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorsw;

import javax.swing.JFrame;

/**
 *
 * @author Alecksandre
 */
public class Principal extends JFrame {

    public Principal() {
        this.setSize(1400, 900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setTitle("Editor Swing");
        this.add(new PainelTexto());
        this.setVisible(true);
    }
}
