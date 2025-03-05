/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edu.bibliotecadesktop.conexao;

import br.com.edu.bibliotecadesktop.dto.CategoriaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alecksandre
 */
public class CategoriaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CategoriaDTO> lista = new ArrayList<>();

    public ArrayList<CategoriaDTO> PesquisarCategoria() {

        conn = new ConexaoDAO().connectaBD();
        String sql = "select * from tbcategoria";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CategoriaDTO objCategoriaDTO = new CategoriaDTO();
                objCategoriaDTO.setId(rs.getLong("idCategoria"));
                objCategoriaDTO.setTipo(rs.getString("tipoCategoria"));
                lista.add(objCategoriaDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CategoriaDAO pesquisar: " + erro.getMessage());
        }
        return lista;
    }

    public void CadastrarCategoria(CategoriaDTO objCategoriaDTO) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "INSERT INTO tbcategoria(tipoCategoria) VALUES (?)";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCategoriaDTO.getTipo());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CategoriaDAO cadastrar: " + erro.getMessage());
        }
    }

    public void AtualizarCategoria(CategoriaDTO objCategoriaDTO) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "UPDATE tbcategoria SET tipoCategoria = ? where idCategoria = ?";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCategoriaDTO.getTipo());
            pstm.setLong(2, objCategoriaDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CategoriaDAO atualizar: " + erro.getMessage());
        }
    }

    public ResultSet listarCategoria() {

        conn = new ConexaoDAO().connectaBD();
        String sql = "SELECT * FROM tbcategoria";

        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CategoriaDAO listar: " + erro.getMessage());
            return null;
        }
    }

    public void DeletarCategoria(CategoriaDTO objCategoria) {
        conn = new ConexaoDAO().connectaBD();
        String sql = "DELETE FROM tbcategoria WHERE idcategoria = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objCategoria.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CategoriaDAO deletar: " + erro.getMessage());
        }
    }

}
