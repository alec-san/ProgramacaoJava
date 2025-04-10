/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edu.bibliotecadesktop.conexao;

import br.com.edu.bibliotecadesktop.dto.EditoraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alecksandre
 */
public class EditoraDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<EditoraDTO> lista = new ArrayList<>();

    public ArrayList<EditoraDTO> PesquisarEditora() {
        conn = new ConexaoDAO().connectaBD();
        String sql = "SELECT * FROM editoras";
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                EditoraDTO objEditoraDTO = new EditoraDTO();
                if (rs.getString("Nome") != null) {      //não mostrar conteúdo vazio
                    objEditoraDTO.setId(rs.getLong("EditoraID"));
                    objEditoraDTO.setNome(rs.getString("Nome"));
                    lista.add(objEditoraDTO);
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EditoraDao listar: " + erro.getMessage());
        }
        return lista;
    }

    public void CadastrarEditora(EditoraDTO objEditoraDTO) {
        conn = new ConexaoDAO().connectaBD();
        String sql = "INSERT INTO editoraS (Nome) VALUES (?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objEditoraDTO.getNome());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " EditoraDao cadastrar: " + erro.getMessage());
        }
    }

    public void AtualizarEditora(EditoraDTO objEditoraDTO) {
        conn = new ConexaoDAO().connectaBD();
        String sql = "UPDATE editoras SET Nome = ? WHERE EditoraID = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objEditoraDTO.getNome());
            pstm.setLong(2, objEditoraDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EditoraDAO atualizar: " + erro.getMessage());
        }
    }

    public void DeletarEditora(EditoraDTO objEditoraDTO) {
        conn = new ConexaoDAO().connectaBD();
        String sql = "DELETE FROM editoras WHERE EditoraID = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objEditoraDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EditoraDAO deletar: " + erro.getMessage());
        }
    }
}
