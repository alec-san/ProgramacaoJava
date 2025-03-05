/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.edu.bibliotecadesktop.view;

/**
 *
 * @author Alecksandre
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuAutor = new javax.swing.JMenuItem();
        mnuCategoria = new javax.swing.JMenuItem();
        mnuEditora = new javax.swing.JMenuItem();
        mnuGenero = new javax.swing.JMenuItem();
        mnuLivro = new javax.swing.JMenuItem();
        mnuOpcoes = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        mnuCadastro.setText("Cadastro");

        mnuAutor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuAutor.setText("Autor");
        mnuAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAutorActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuAutor);

        mnuCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuCategoria.setText("Categoria");
        mnuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCategoriaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCategoria);

        mnuEditora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuEditora.setText("Editora");
        mnuEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditoraActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuEditora);

        mnuGenero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGenero.setText("Genero");
        mnuGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGeneroActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuGenero);

        mnuLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuLivro.setText("Livro");
        mnuLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLivroActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuLivro);

        Menu.add(mnuCadastro);

        mnuOpcoes.setText("Opções");

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuSair.setText("Sair");
        mnuOpcoes.add(mnuSair);

        Menu.add(mnuOpcoes);

        mnuAjuda.setText("Ajuda");

        mnuSobre.setText("Sobre");
        mnuAjuda.add(mnuSobre);

        Menu.add(mnuAjuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1022, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditoraActionPerformed
        //  chamara o formulário interno Editora dentro painel desktop
        friEditora editora = new friEditora();
        editora.setVisible(true);
        desktop.add(editora);
        try {
            editora.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_mnuEditoraActionPerformed

    private void mnuGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGeneroActionPerformed
        // chamara o formulário interno Genero dentro painel desktop
        friGenero genero = new friGenero();
        genero.setVisible(true);
        desktop.add(genero);
        try {
            genero.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_mnuGeneroActionPerformed

    private void mnuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCategoriaActionPerformed
        // chamara o formulário interno Categoria dentro painel desktop
        friCategoria categoria = new friCategoria();
        categoria.setVisible(true);
        desktop.add(categoria);
        try {
            categoria.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_mnuCategoriaActionPerformed

    private void mnuAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAutorActionPerformed
        // chamara o formulário interno Autor dentro painel desktop
        friAutor autor = new friAutor();
        autor.setVisible(true);
        desktop.add(autor);
        try {
            autor.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_mnuAutorActionPerformed

    private void mnuLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLivroActionPerformed
        // chamara o formulário interno Livro dentro painel desktop
        friLivro livro = new friLivro();
        livro.setVisible(true);
        desktop.add(livro);
        try {
            livro.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_mnuLivroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAutor;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuCategoria;
    private javax.swing.JMenuItem mnuEditora;
    private javax.swing.JMenuItem mnuGenero;
    private javax.swing.JMenuItem mnuLivro;
    private javax.swing.JMenu mnuOpcoes;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenuItem mnuSobre;
    // End of variables declaration//GEN-END:variables
}
