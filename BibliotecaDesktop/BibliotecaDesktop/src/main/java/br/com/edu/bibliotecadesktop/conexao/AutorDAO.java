/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edu.bibliotecadesktop.conexao;

import br.com.edu.bibliotecadesktop.dto.AutorDTO;

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
public class AutorDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AutorDTO> lista = new ArrayList<>();

    public ArrayList<AutorDTO> PesquisarAutor() {

        conn = new ConexaoDAO().connectaBD(); // abre a conexão com o banco de dados.

        String sql = "select * from tbautor";
        try {
            pstm = conn.prepareStatement(sql); //prepara a consulta com a string da linha acima
            rs = pstm.executeQuery(); // executa a query

            while (rs.next()) {
                AutorDTO objAutorDTO = new AutorDTO();
                objAutorDTO.setId(rs.getLong("idAutor")); //obtem a identificação do autor no banco de dados
                objAutorDTO.setNome(rs.getString("nomeAutor"));
                objAutorDTO.setPseudonimo(rs.getString("pseudonimoAutor"));
                lista.add(objAutorDTO);
            }
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AutorDao pesquisar: " + erro.getMessage());
        }
        return lista;
    }

    public void CadastrarAutor(AutorDTO objAutorDTO) {

        conn = new ConexaoDAO().connectaBD();
        String sqlInsert = "insert into tbautor (nomeAutor, pseudonimoAutor) values (?,?)";

        try {
            pstm = conn.prepareStatement(sqlInsert);
            pstm.setString(1, objAutorDTO.getNome());
            pstm.setString(2, objAutorDTO.getPseudonimo());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AutorDAO cadastrar: " + erro.getMessage());
        }
    }

    public void AtualizarAutor(AutorDTO objAutorDTO) {

        conn = new ConexaoDAO().connectaBD();
        String sqlUpdate = "update tbautor set nomeAutor = ?, pseudonimoAutor = ? where idAutor=?";

        try {
            pstm = conn.prepareStatement(sqlUpdate);

            pstm.setString(1, objAutorDTO.getNome());
            pstm.setString(2, objAutorDTO.getPseudonimo());
            pstm.setLong(3, objAutorDTO.getId());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AutorDAO atualizar: " + erro.getMessage());
        }
    }

    public void RemoverAutor(AutorDTO objAutorDTO) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "DELETE FROM tbautor WHERE idAutor = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objAutorDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AutorDAO deletar: " + erro.getMessage());
        }
    }
}
