/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.edu.bibliotecadesktop.view;

import br.com.edu.bibliotecadesktop.conexao.AutorDAO;
import br.com.edu.bibliotecadesktop.dto.AutorDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alecksandre
 */
public class friAutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form friAutor
     */
    public friAutor() {
        initComponents();
        listarAutor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdAutor = new javax.swing.JTextField();
        txtNomeAutor = new javax.swing.JTextField();
        txtPseudonimo = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnCadastrarAutor = new javax.swing.JButton();
        btnEditarAutor = new javax.swing.JButton();
        btnRemoverAutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAutor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNacionalidade = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro do Autor");
        setPreferredSize(new java.awt.Dimension(514, 348));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Pseudonimo:");

        txtIdAutor.setEnabled(false);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCadastrarAutor.setText("Cadastrar");
        btnCadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAutorActionPerformed(evt);
            }
        });

        btnEditarAutor.setText("Editar");
        btnEditarAutor.setEnabled(false);
        btnEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutorActionPerformed(evt);
            }
        });

        btnRemoverAutor.setText("Remover");
        btnRemoverAutor.setEnabled(false);
        btnRemoverAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverAutorActionPerformed(evt);
            }
        });

        tbAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Pseudonimo", "Nacionalidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAutor);
        if (tbAutor.getColumnModel().getColumnCount() > 0) {
            tbAutor.getColumnModel().getColumn(0).setMinWidth(20);
            tbAutor.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel4.setText("Nacionalidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomeAutor)
                                .addComponent(txtPseudonimo, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrarAutor)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarAutor)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoverAutor)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPseudonimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCadastrarAutor)
                    .addComponent(btnEditarAutor)
                    .addComponent(btnRemoverAutor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAutorActionPerformed
        // TODO add your handling code here:
        cadastrarAutor();
        limparCampos();
        listarAutor();
    }//GEN-LAST:event_btnCadastrarAutorActionPerformed

    private void btnEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutorActionPerformed
        // TODO add your handling code here:
        editarAutor();
        limparCampos();
        listarAutor();
    }//GEN-LAST:event_btnEditarAutorActionPerformed

    private void btnRemoverAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverAutorActionPerformed
        // TODO add your handling code here:
        removerAutor();
        limparCampos();
        listarAutor();
    }//GEN-LAST:event_btnRemoverAutorActionPerformed

    private void tbAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAutorMouseClicked
        // TODO add your handling code here:
  
        DefaultTableModel tabela = (DefaultTableModel) tbAutor.getModel();
        String cmpCodigo = tabela.getValueAt(tbAutor.getSelectedRow(), 0).toString();
        String cmpNome = tabela.getValueAt(tbAutor.getSelectedRow(), 1).toString();
        String cmpPseudo = tabela.getValueAt(tbAutor.getSelectedRow(), 2).toString();
        String cmpNacio = tabela.getValueAt(tbAutor.getSelectedRow(), 3).toString();

        txtIdAutor.setText(cmpCodigo);
        txtNomeAutor.setText(cmpNome);
        txtPseudonimo.setText(cmpPseudo);
        txtNacionalidade.setText(cmpNacio);

        btnCadastrarAutor.setEnabled(false);
        btnEditarAutor.setEnabled(true);
        btnRemoverAutor.setEnabled(true);

    }//GEN-LAST:event_tbAutorMouseClicked

    public void limparCampos() {
        txtIdAutor.setText("");
        txtNomeAutor.setText("");
        txtPseudonimo.setText("");
        txtNacionalidade.setText("");
        btnCadastrarAutor.setEnabled(true);
        btnEditarAutor.setEnabled(false);
        btnRemoverAutor.setEnabled(false);
    }

    public void listarAutor() {

        AutorDAO autorDao = new AutorDAO();
        DefaultTableModel tabela = (DefaultTableModel) tbAutor.getModel();
        tabela.setNumRows(0);
        ArrayList<AutorDTO> lista = autorDao.PesquisarAutor();
        for (int i = 0; i < lista.size(); i++) {
            tabela.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getNome(),
                lista.get(i).getPseudonimo(),
                lista.get(i).getNacionalidade()
                    
            });
        }
    }

    public void cadastrarAutor() {

        String nomeAutor = txtNomeAutor.getText();
        String pseudoAutor = txtPseudonimo.getText();
        String nacionalidade = txtNacionalidade.getText();

        AutorDTO autorDto = new AutorDTO();
        autorDto.setNome(nomeAutor);
        autorDto.setPseudonimo(pseudoAutor);
        autorDto.setNacionalidade(nacionalidade);

        AutorDAO autorDao = new AutorDAO();
        autorDao.CadastrarAutor(autorDto);
    }

    public void editarAutor() {

        Long idAutor = Long.parseLong(txtIdAutor.getText());
        String nomeAutor = txtNomeAutor.getText();
        String pseudoAutor = txtPseudonimo.getText();
        String nacionalidade= txtNacionalidade.getText();

        AutorDTO autorDto = new AutorDTO();
        autorDto.setId(idAutor);
        autorDto.setNome(nomeAutor);
        autorDto.setPseudonimo(pseudoAutor);
        autorDto.setNacionalidade(nacionalidade);

        AutorDAO autorDao = new AutorDAO();
        autorDao.AtualizarAutor(autorDto);

    }

    public void removerAutor() {

        Long idAutor = Long.parseLong(txtIdAutor.getText());
        AutorDTO autorDto = new AutorDTO();
        autorDto.setId(idAutor);

        AutorDAO autorDao = new AutorDAO();
        autorDao.RemoverAutor(autorDto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAutor;
    private javax.swing.JButton btnEditarAutor;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemoverAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAutor;
    private javax.swing.JTextField txtIdAutor;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNomeAutor;
    private javax.swing.JTextField txtPseudonimo;
    // End of variables declaration//GEN-END:variables
}
