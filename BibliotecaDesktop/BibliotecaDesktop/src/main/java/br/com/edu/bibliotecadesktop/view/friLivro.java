/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.edu.bibliotecadesktop.view;

import br.com.edu.bibliotecadesktop.conexao.AutorDAO;
import br.com.edu.bibliotecadesktop.conexao.CategoriaDAO;
import br.com.edu.bibliotecadesktop.conexao.EditoraDAO;
import br.com.edu.bibliotecadesktop.conexao.GeneroDAO;
import br.com.edu.bibliotecadesktop.conexao.LivroDAO;
import br.com.edu.bibliotecadesktop.dto.AutorDTO;
import br.com.edu.bibliotecadesktop.dto.CategoriaDTO;
import br.com.edu.bibliotecadesktop.dto.EditoraDTO;
import br.com.edu.bibliotecadesktop.dto.GeneroDTO;
import br.com.edu.bibliotecadesktop.dto.LivroDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alecksandre
 */
public class friLivro extends javax.swing.JInternalFrame {

    Vector<Long> idEditora = new Vector<Long>();
    Vector<Long> idAutor = new Vector<Long>();
    Vector<Long> idCategoria = new Vector<Long>();
    Vector<Long> idGenero = new Vector<Long>();

    /**
     * Creates new form friLivro
     */
    public friLivro() {
        initComponents();
        listarLivro();
        listarEditora();
        listarAutor();
        listarCategoria();
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
        txtIdLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbEditora = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbAutor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnCadastrarLivro = new javax.swing.JButton();
        btnEditarLivro = new javax.swing.JButton();
        btnRemoverLivro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLivro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Livro");

        jLabel1.setText("Código:");

        txtIdLivro.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Editora:");

        jLabel4.setText("Autor:");

        jLabel5.setText("Categoria:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCadastrarLivro.setText("Cadastrar");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        btnEditarLivro.setText("Editar");
        btnEditarLivro.setEnabled(false);
        btnEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLivroActionPerformed(evt);
            }
        });

        btnRemoverLivro.setText("Remover");
        btnRemoverLivro.setEnabled(false);
        btnRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverLivroActionPerformed(evt);
            }
        });

        tbLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Autor", "Editora", "Categoria", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLivro);
        if (tbLivro.getColumnModel().getColumnCount() > 0) {
            tbLivro.getColumnModel().getColumn(0).setMinWidth(20);
            tbLivro.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel6.setText("Genero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbAutor, 0, 152, Short.MAX_VALUE)
                                    .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrarLivro)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarLivro)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoverLivro))
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCadastrarLivro)
                    .addComponent(btnEditarLivro)
                    .addComponent(btnRemoverLivro))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        // TODO add your handling code here:
        cadastrarLivro();
        limparCampos();
        listarLivro();
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void btnEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivroActionPerformed
        editarLivro();
        limparCampos();
        listarLivro();
    }//GEN-LAST:event_btnEditarLivroActionPerformed

    private void btnRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverLivroActionPerformed
        // TODO add your handling code here:
        removerLivro();
        limparCampos();
        listarLivro();
    }//GEN-LAST:event_btnRemoverLivroActionPerformed

    private void tbLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLivroMouseClicked
        // Coleta os dados da tabela
        DefaultTableModel tabela = (DefaultTableModel) tbLivro.getModel();
        String cmpCodigo = tabela.getValueAt(tbLivro.getSelectedRow(), 0).toString();
        String cmpNome = tabela.getValueAt(tbLivro.getSelectedRow(), 1).toString();
        String cmpAutor = tabela.getValueAt(tbLivro.getSelectedRow(), 2).toString();
        String cmpEditora = tabela.getValueAt(tbLivro.getSelectedRow(), 3).toString();
        String cmpCategoria = tabela.getValueAt(tbLivro.getSelectedRow(), 4).toString();
        String cmpGenero = tabela.getValueAt(tbLivro.getSelectedRow(), 5).toString();

        //passa os dados para os campos texto e combox
        txtIdLivro.setText(cmpCodigo);
        txtNomeLivro.setText(cmpNome);
        cmbAutor.setSelectedItem(cmpAutor);
        cmbEditora.setSelectedItem(cmpEditora);
        cmbCategoria.setSelectedItem(cmpCategoria);
        cmbGenero.setSelectedItem(cmpGenero);

        //habilita e desabilita os botões
        btnCadastrarLivro.setEnabled(false);
        btnEditarLivro.setEnabled(true);
        btnRemoverLivro.setEnabled(true);

    }//GEN-LAST:event_tbLivroMouseClicked

    public void limparCampos() {
        txtIdLivro.setText("");
        txtNomeLivro.setText("");
        cmbEditora.setSelectedIndex(0);
        cmbAutor.setSelectedIndex(0);
        cmbCategoria.setSelectedIndex(0);
        cmbGenero.setSelectedIndex(0);
        cmbGenero.setSelectedIndex(0);
        btnCadastrarLivro.setEnabled(true);
        btnEditarLivro.setEnabled(false);
        btnRemoverLivro.setEnabled(false);
    }

    public void cadastrarLivro() {

        String nomeLivro = txtNomeLivro.getText();
        Long id_editora = idEditora.get(cmbEditora.getSelectedIndex() - 1);
        long id_autor = idAutor.get(cmbAutor.getSelectedIndex() - 1);
        Long id_categoria = idCategoria.get(cmbCategoria.getSelectedIndex() - 1);
        Long id_genero = idGenero.get(cmbGenero.getSelectedIndex() - 1);

        LivroDTO livroDto = new LivroDTO();
        livroDto.setNome(nomeLivro);
        livroDto.setIdEditora(id_editora);
        livroDto.setIdAutor(id_autor);
        livroDto.setIdCategoria(id_categoria);
        livroDto.setIdGenero(id_genero);

        LivroDAO livroDao = new LivroDAO();
        livroDao.CadastrarLivro(livroDto);
    }

    public void editarLivro() {

        Long idLivro = Long.parseLong(txtIdLivro.getText());
        String nomeLivro = txtNomeLivro.getText();
        Long id_editora = idEditora.get(cmbEditora.getSelectedIndex() - 1);
        long id_autor = idAutor.get(cmbAutor.getSelectedIndex() - 1);
        Long id_categoria = idCategoria.get(cmbCategoria.getSelectedIndex() - 1);
        Long id_genero = idGenero.get(cmbGenero.getSelectedIndex() - 1);

        LivroDTO livroDto = new LivroDTO();
        livroDto.setId(idLivro);
        livroDto.setNome(nomeLivro);
        livroDto.setIdEditora(id_editora);
        livroDto.setIdAutor(id_autor);
        livroDto.setIdCategoria(id_categoria);
        livroDto.setIdGenero(id_genero);

        LivroDAO livroDao = new LivroDAO();
        livroDao.EditarLivro(livroDto);
    }

    public void removerLivro() {
        Long id_livro = Long.parseLong(txtIdLivro.getText());
        LivroDTO livroDto = new LivroDTO();
        livroDto.setId(id_livro);

        LivroDAO livroDao = new LivroDAO();
        livroDao.RemoverLivro(livroDto);
    }

    public void listarLivro() {

        LivroDAO livroDao = new LivroDAO();
        DefaultTableModel tabela = (DefaultTableModel) tbLivro.getModel();
        tabela.setNumRows(0);
        ArrayList<LivroDTO> lista = livroDao.PesquisarLivro();
        for (int i = 0; i < lista.size(); i++) {
            tabela.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getNome(),
                lista.get(i).getNomeAutor(),
                lista.get(i).getNomeEditora(),
                lista.get(i).getTipoCategoria(),
                lista.get(i).getTipoGenero()
            });
        }
    }

    public void listarEditora() {
        EditoraDAO editoraDao = new EditoraDAO();
        ArrayList<EditoraDTO> lista = editoraDao.PesquisarEditora();
        cmbEditora.addItem(" ");
        for (EditoraDTO f : lista) {
            idEditora.addElement(f.getId());
            cmbEditora.addItem(f.getNome());
        }
    }

    public void listarAutor() {
        AutorDAO autorDao = new AutorDAO();
        ArrayList<AutorDTO> lista = autorDao.PesquisarAutor();
        cmbAutor.addItem(" ");
        for (AutorDTO f : lista) {
            idAutor.addElement(f.getId());
            cmbAutor.addItem(f.getNome());
        }
    }

    public void listarCategoria() {
        CategoriaDAO categoriaDao = new CategoriaDAO();
        ArrayList<CategoriaDTO> lista = categoriaDao.PesquisarCategoria();
        cmbCategoria.addItem(" ");
        for (CategoriaDTO f : lista) {
            idCategoria.addElement(f.getId());
            cmbCategoria.addItem(f.getTipo());
        }
    }

    public void listarGenero() {
        GeneroDAO generoDao = new GeneroDAO();
        ArrayList<GeneroDTO> lista = generoDao.PesquisarGenero();
        cmbGenero.addItem(" ");
        for (GeneroDTO f : lista) {
            idGenero.addElement(f.getId());
            cmbGenero.addItem(f.getTipo());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnEditarLivro;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemoverLivro;
    private javax.swing.JComboBox<String> cmbAutor;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox cmbEditora;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLivro;
    private javax.swing.JTextField txtIdLivro;
    javax.swing.JTextField txtNomeLivro;
    // End of variables declaration//GEN-END:variables
}
