/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edu.bibliotecadesktop.conexao;

import br.com.edu.bibliotecadesktop.dto.GeneroDTO;
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
public class GeneroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<GeneroDTO> lista = new ArrayList<>();

    public ArrayList<GeneroDTO> PesquisarGenero() {
        conn = new ConexaoDAO().connectaBD();
        String sql = "SELECT * FROM tbgenero";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                GeneroDTO objGeneroDTO = new GeneroDTO();
                objGeneroDTO.setId(rs.getLong("idGenero"));
                objGeneroDTO.setTipo(rs.getString("tipoGenero"));
                lista.add(objGeneroDTO);
            }
            rs.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "GeneroDAO pesquisar: " + erro.getMessage());
        }
        return lista;
    }

    public void CadastrarGenero(GeneroDTO objGeneroDTO) {
        conn = new ConexaoDAO().connectaBD();
        String sql = "INSERT INTO tbgenero(tipoGenero) VALUES (?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objGeneroDTO.getTipo());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "GeneroDAO cadastrar: " + erro.getMessage());
        }
    }

    public void AtualizarGenero(GeneroDTO objGeneroDTO) {
        conn = new ConexaoDAO().connectaBD();
        String sql = "UPDATE tbgenero SET tipoGenero = ? WHERE idGenero = ? ";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objGeneroDTO.getTipo());
            pstm.setLong(2, objGeneroDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "GeneroDAO cadastrar: " + erro.getMessage());
        }
    }

    public void RemoverGenero(GeneroDTO objGeneroDTO) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "DELETE FROM tbgenero WHERE idGenero = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objGeneroDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "GeneroDAO deletar: " + erro.getMessage());
        }

    }
}
