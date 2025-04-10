/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.edu.bibliotecadesktop.view;

import br.com.edu.bibliotecadesktop.conexao.GeneroDAO;
import br.com.edu.bibliotecadesktop.dto.GeneroDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alecksandre
 */
public class friGenero extends javax.swing.JInternalFrame {

    /**
     * Creates new form friGenero
     */
    public friGenero() {
        initComponents();
        listarGenero();
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
        txtIdGenero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomeGenero = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();
        btnCadastrarGenero = new javax.swing.JButton();
        btnEditarGenero = new javax.swing.JButton();
        btnRemoverGenero = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGenero = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro do Genero");

        jLabel1.setText("Código:");

        txtIdGenero.setEnabled(false);

        jLabel3.setText("Nome:");

        btnLimparCampos.setText("Limpar");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnCadastrarGenero.setText("Cadastrar");
        btnCadastrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarGeneroActionPerformed(evt);
            }
        });

        btnEditarGenero.setText("Editar");
        btnEditarGenero.setEnabled(false);
        btnEditarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGeneroActionPerformed(evt);
            }
        });

        btnRemoverGenero.setText("Remover");
        btnRemoverGenero.setEnabled(false);
        btnRemoverGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverGeneroActionPerformed(evt);
            }
        });

        tbGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGeneroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGenero);
        if (tbGenero.getColumnModel().getColumnCount() > 0) {
            tbGenero.getColumnModel().getColumn(0).setMinWidth(20);
            tbGenero.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel2.setText("Descrição:");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane2.setViewportView(txaDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnLimparCampos)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarGenero)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarGenero)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverGenero))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnCadastrarGenero)
                    .addComponent(btnEditarGenero)
                    .addComponent(btnRemoverGenero))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnCadastrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarGeneroActionPerformed
        // TODO add your handling code here:
        cadastrarGenero();
        limparCampos();
        listarGenero();
    }//GEN-LAST:event_btnCadastrarGeneroActionPerformed

    private void tbGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGeneroMouseClicked
        // TODO add your handling code here:

        DefaultTableModel tabela = (DefaultTableModel) tbGenero.getModel();
        String cmpCodigo = tabela.getValueAt(tbGenero.getSelectedRow(), 0).toString();
        String cmpTipo = tabela.getValueAt(tbGenero.getSelectedRow(), 1).toString();
        String cmpDescricao = tabela.getValueAt(tbGenero.getSelectedRow(), 2).toString();

        txtIdGenero.setText(cmpCodigo);
        txtNomeGenero.setText(cmpTipo);
        txaDescricao.setText(cmpDescricao);

        btnCadastrarGenero.setEnabled(false);
        btnEditarGenero.setEnabled(true);
        btnRemoverGenero.setEnabled(true);

    }//GEN-LAST:event_tbGeneroMouseClicked

    private void btnEditarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGeneroActionPerformed
        // TODO add your handling code here:
        editarGenero();
        limparCampos();
        listarGenero();
    }//GEN-LAST:event_btnEditarGeneroActionPerformed

    private void btnRemoverGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverGeneroActionPerformed
        // TODO add your handling code here::
        Object[] opt = {"Sim", "Não"};
        if (JOptionPane.showOptionDialog(null, "Deseja excluir do Banco de dados?", "Aviso", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, opt, opt[0]) == JOptionPane.YES_OPTION) {
            removerGenero();
            limparCampos();
            listarGenero();
        }
        limparCampos();
    }//GEN-LAST:event_btnRemoverGeneroActionPerformed

    public void limparCampos() {

        //limpa os campos textfield
        txtIdGenero.setText("");
        txtNomeGenero.setText("");
        txaDescricao.setText("");
        //habilita e desabilita botões.
        btnCadastrarGenero.setEnabled(true);
        btnEditarGenero.setEnabled(false);
        btnRemoverGenero.setEnabled(false);
    }

    public void listarGenero() {
        //consulta os dados da tbgenero do banco de dados
        try {
            GeneroDAO generoDao = new GeneroDAO();
            DefaultTableModel tabela = (DefaultTableModel) tbGenero.getModel();
            tabela.setNumRows(0);
            ArrayList<GeneroDTO> lista = generoDao.PesquisarGenero();
            for (int i = 0; i < lista.size(); i++) {
                tabela.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getDescricao()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Consultar dados da tabela Genero:" + erro);
        }
    }

    public void cadastrarGenero() {

        String nomeGenero = txtNomeGenero.getText();
        String descricaoGenero = txaDescricao.getText();
        
        GeneroDTO generoDto = new GeneroDTO();
        generoDto.setNome(nomeGenero);
        generoDto.setDescricao(descricaoGenero);

        GeneroDAO generoDao = new GeneroDAO();
        generoDao.CadastrarGenero(generoDto);

    }

    public void editarGenero() {

        Long idGenero = Long.parseLong(txtIdGenero.getText());
        //long idCat = idCategoria.get(cmbCategoria.getSelectedIndex() - 1);
        String nomeGenero = txtNomeGenero.getText();
        String descricaoGenero = txaDescricao.getText();

        GeneroDTO generoDto = new GeneroDTO();
        generoDto.setId(idGenero);
        //generoDto.setIdCat(idCat);
        generoDto.setNome(nomeGenero);
        generoDto.setDescricao(descricaoGenero);

        GeneroDAO generoDao = new GeneroDAO();
        generoDao.AtualizarGenero(generoDto);

    }

    public void removerGenero() {

        Long idGenero = Long.parseLong(txtIdGenero.getText());
        GeneroDTO generoDto = new GeneroDTO();
        generoDto.setId(idGenero);

        GeneroDAO generoDao = new GeneroDAO();
        generoDao.RemoverGenero(generoDto);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarGenero;
    private javax.swing.JButton btnEditarGenero;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnRemoverGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbGenero;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtIdGenero;
    private javax.swing.JTextField txtNomeGenero;
    // End of variables declaration//GEN-END:variables
}
