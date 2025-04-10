/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.edu.bibliotecadesktop.view;

import br.com.edu.bibliotecadesktop.conexao.LivroDAO;
import br.com.edu.bibliotecadesktop.conexao.VolumeDAO;
import br.com.edu.bibliotecadesktop.dto.LivroDTO;
import br.com.edu.bibliotecadesktop.dto.VolumeDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alecksandre
 */
public class friVolume extends javax.swing.JInternalFrame {

    Vector<Long> idLivro = new Vector<>();

    /**
     * Creates new form friVolume
     */
    public friVolume() {
        initComponents();
        //listarVolume();
        popularComboBoxNome();
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
        txtIdVolume = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVolume = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        cmbNomeLivro = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVolume = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Volume");

        jLabel1.setText("Código:");

        txtIdVolume.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIdVolume.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Volume:");

        txtVolume.setText("Único");

        jLabel4.setText("Preço:");

        txtPreco.setText("0.00");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        tbVolume.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código do Livro", "Nome do Livro", "Volume", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVolume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVolumeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVolume);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(cmbNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCadastrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRemover))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPreco)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListar)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnEditar)
                    .addComponent(btnRemover))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarVolume();
        listarVolume();
        limparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // 
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tbVolumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVolumeMouseClicked
        // Coleta os dados dos campos da tabela
        DefaultTableModel tabela = (DefaultTableModel) tbVolume.getModel();
        String cmpIdVolume = tabela.getValueAt(tbVolume.getSelectedRow(), 0).toString();
        String cmpNomeLivro = tabela.getValueAt(tbVolume.getSelectedRow(), 1).toString();
        String cmpVolume = tabela.getValueAt(tbVolume.getSelectedRow(), 2).toString();
        String cmpPrecoVolume = tabela.getValueAt(tbVolume.getSelectedRow(), 3).toString();

        //passa os dados para os campos texto e combox
        txtIdVolume.setText(cmpIdVolume);
        txtVolume.setText(cmpVolume);
        txtPreco.setText(cmpPrecoVolume);
        cmbNomeLivro.setSelectedItem(cmpNomeLivro);

        //habilita e desabilita os botões
        btnEditar.setEnabled(true);
        btnRemover.setEnabled(true);
        btnCadastrar.setEnabled(false);
    }//GEN-LAST:event_tbVolumeMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        editarVolume();
        listarVolume();
        limparCampos();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        removerVolume();
        listarVolume();
        limparCampos();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        listarVolume();
        Long id_livro = idLivro.get(cmbNomeLivro.getSelectedIndex() - 1);
        txtIdVolume.setText(Long.toString(id_livro));
    }//GEN-LAST:event_btnListarActionPerformed

    public void limparCampos() {

        txtIdVolume.setText("");
        txtVolume.setText("");
        txtPreco.setText("");
        cmbNomeLivro.setSelectedIndex(0);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnCadastrar.setEnabled(true);

    }

    public void listarVolume() {

        Long id_livro = idLivro.get(cmbNomeLivro.getSelectedIndex() - 1);
        VolumeDTO volumeDto = new VolumeDTO();
        volumeDto.setId(id_livro);

        DefaultTableModel tabela = (DefaultTableModel) tbVolume.getModel();
        tabela.setNumRows(0);

        VolumeDAO volumeDao = new VolumeDAO();
        ArrayList<VolumeDTO> lista = volumeDao.PesquisarIdVolume(volumeDto);
        for (int i = 0; i < lista.size(); i++) {
            tabela.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getNome(),
                lista.get(i).getVolume(),
                lista.get(i).getPreco()
            });
        }
    }

    public void popularComboBoxNome() {

        LivroDAO livroDao = new LivroDAO();
        ArrayList<LivroDTO> lista = livroDao.PesquisarLivro();
        cmbNomeLivro.addItem(" ");
        for (LivroDTO f : lista) {
            idLivro.addElement(f.getId());
            cmbNomeLivro.addItem(f.getNome());
        }
    }

    public void cadastrarVolume() {

        Long id_livro = idLivro.get(cmbNomeLivro.getSelectedIndex() - 1);
        String volumeLivro = txtVolume.getText();
        String volumePreco = txtPreco.getText();

        VolumeDTO volumeDto = new VolumeDTO();
        volumeDto.setId(id_livro);
        volumeDto.setVolume(volumeLivro);
        volumeDto.setPreco(Double.valueOf(volumePreco));

        VolumeDAO volumeDao = new VolumeDAO();
        volumeDao.CadastrarVolume(volumeDto);
    }

    public void editarVolume() {

        Long id = Long.parseLong(txtIdVolume.getText());
        String volume = txtVolume.getText();
        Double preco = Double.valueOf(txtPreco.getText());

        VolumeDTO volumeDto = new VolumeDTO();
        volumeDto.setId(id);
        volumeDto.setVolume(volume);
        volumeDto.setPreco(preco);

        VolumeDAO volumeDao = new VolumeDAO();
        volumeDao.EditarVolume(volumeDto);
    }

    public void removerVolume() {

        Long id = Long.parseLong(txtIdVolume.getText());
        String volume = txtVolume.getText();

        VolumeDTO volumeDto = new VolumeDTO();
        volumeDto.setId(id);
        volumeDto.setVolume(volume);

        VolumeDAO volumeDao = new VolumeDAO();
        volumeDao.RemoverVolume(volumeDto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbNomeLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbVolume;
    private javax.swing.JTextField txtIdVolume;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables
}
