/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edu.bibliotecadesktop.conexao;

import br.com.edu.bibliotecadesktop.dto.LivroDTO;
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
public class LivroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();

    public ArrayList<LivroDTO> PesquisarLivro() {
        conn = new ConexaoDAO().connectaBD();
        String sql = " SELECT idlivro, nomeLivro, editora.nomeEditora, autor.nomeAutor, categoria.tipoCategoria, genero.TipoGenero \n"
                + " FROM tblivro \n"
                + " INNER JOIN tbEditora editora \n"
                + " ON tbLivro.fk_idEditora = editora.idEditora \n"
                + " INNER JOIN tbAutor autor \n"
                + " ON tbLivro.fk_idAutor = autor.idAutor \n"
                + " INNER JOIN tbCategoria categoria \n"
                + " ON  tbLivro.fk_idCategoria = categoria.idCategoria \n"
                + " INNER JOIN tbGenero genero \n"
                + " ON tbLivro.fk_idGenero = genero.idGenero";
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                LivroDTO objLivroDto = new LivroDTO();
                objLivroDto.setId(rs.getLong("idLivro"));
                objLivroDto.setNome(rs.getString("nomeLivro"));
                objLivroDto.setNomeEditora(rs.getString("editora.nomeEditora"));
                objLivroDto.setNomeAutor(rs.getString("autor.nomeAutor"));
                objLivroDto.setTipoCategoria(rs.getString("categoria.tipoCategoria"));
                objLivroDto.setTipoGenero(rs.getString("genero.tipoGenero"));
                lista.add(objLivroDto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO pesquisar: " + erro.getMessage());
        }
        return lista;
    }

    public void CadastrarLivro(LivroDTO objLivroDto) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "INSERT INTO tblivro(nomeLivro, fk_idEditora, fk_idAutor, fk_idCategoria, fk_idGenero) VALUES(?,?,?,?,?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivroDto.getNome());
            pstm.setLong(2, objLivroDto.getIdEditora());
            pstm.setLong(3, objLivroDto.getIdAutor());
            pstm.setLong(4, objLivroDto.getIdCategoria());
            pstm.setLong(5, objLivroDto.idGenero);
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO cadastrar livro: " + erro.getMessage());
        }
    }

    public void EditarLivro(LivroDTO objLivroDTO) {

        conn = new ConexaoDAO().connectaBD();
        //String sql = "UPDATE tblivro SET nomeLivro = ?, fk_idEditora = ?, fk_idAutor = ?, fk_idCategoria = ?, fk_idGenero = ? WHERE idLivro = ? ";
        String sql = "UPDATE dbbiblioteca.tblivro SET nomeLivro = ?, fk_idEditora = ?, fk_idAutor = ?,  fk_idCategoria = ?, fk_idGenero = ? WHERE idLivro = ?";

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome());
            pstm.setLong(2, objLivroDTO.getIdEditora());
            pstm.setLong(3, objLivroDTO.getIdAutor());
            pstm.setLong(4, objLivroDTO.getIdCategoria());
            pstm.setLong(5, objLivroDTO.getIdGenero());
            pstm.setLong(6, objLivroDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO Editar: " + erro.getMessage());
        }
    }

    public void RemoverLivro(LivroDTO objLivroDTO) {
 
        conn = new ConexaoDAO().connectaBD();
        String sql = "DELETE FROM tblivro WHERE idLivro = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objLivroDTO.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO deletar livro: " + erro.getMessage());
        }        
    }
    
}
