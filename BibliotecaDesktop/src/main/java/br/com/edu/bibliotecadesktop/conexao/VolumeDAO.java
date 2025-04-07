/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edu.bibliotecadesktop.conexao;

import br.com.edu.bibliotecadesktop.dto.VolumeDTO;
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
public class VolumeDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VolumeDTO> lista = new ArrayList<VolumeDTO>();

    public ArrayList<VolumeDTO> ListarVolume() {

        conn = new ConexaoDAO().connectaBD();
        String sql = "SELECT fk_idLivro, livro.nomeLivro, volumeLivro, volumePreco \n"
                + "FROM tbvolume \n"
                + "INNER JOIN tbLivro livro \n"
                + "ON tbvolume.fk_idLivro = livro.idlivro";
        try {
            pstm = conn.prepareCall(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                VolumeDTO objVolumeDto = new VolumeDTO();
                objVolumeDto.setId(rs.getLong("fk_idLivro"));
                objVolumeDto.setNome(rs.getString("livro.nomeLivro"));
                objVolumeDto.setVolume(rs.getString("volumeLivro"));
                objVolumeDto.setPreco(rs.getDouble("volumePreco"));
                lista.add(objVolumeDto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VolumeDao listar: " + erro.getMessage());
        }
        return lista;
    }

    public void CadastrarVolume(VolumeDTO objVolumeDto) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "INSERT INTO tbvolume(volumeLivro, fk_idLivro, volumePreco)VALUES(?,?,?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objVolumeDto.getVolume());
            pstm.setLong(2, objVolumeDto.getId());
            pstm.setDouble(3, objVolumeDto.getPreco());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VolumeDAO cadastrar livro: " + erro.getMessage());
        }
    }

    public void EditarVolume(VolumeDTO objVolumeDto) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "UPDATE tbvolume SET volumePreco = ? WHERE fk_idLivro = ? AND volumeLivro = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, objVolumeDto.getPreco());
            pstm.setLong(2, objVolumeDto.getId());
            pstm.setString(3, objVolumeDto.getVolume());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VolumeDAO editar dados do Volume e Preço: " + erro.getMessage());
        }
    }

    public void RemoverVolume(VolumeDTO objVolumeDto) {

        conn = new ConexaoDAO().connectaBD();
        String sql = "DELETE FROM tbvolume WHERE fk_idLivro = ? AND volumeLivro = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objVolumeDto.getId());
            pstm.setString(2, objVolumeDto.getVolume());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VolumeDAO deletar volume: " + erro.getMessage());
        }

    }

    public ArrayList<VolumeDTO> PesquisarIdVolume(VolumeDTO objVolumeDto) {

        conn = new ConexaoDAO().connectaBD();

        String sql = "SELECT fk_idLivro, livro.nomeLivro, volumeLivro, volumePreco \n"
                + "FROM tbvolume \n"
                + "INNER JOIN tbLivro livro \n"
                + "ON tbvolume.fk_idLivro = livro.idlivro \n"
                + "WHERE fk_idLivro = ?";

        //String sql2 = "Select * from tbvolume where fk_idLivro = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, objVolumeDto.getId());

            rs = pstm.executeQuery();
            while (rs.next()) {
                VolumeDTO volumeDto = new VolumeDTO();
                volumeDto.setId(rs.getLong("fk_idLivro"));
                volumeDto.setNome(rs.getString("livro.nomeLivro"));
                volumeDto.setVolume(rs.getString("volumeLivro"));
                volumeDto.setPreco(rs.getDouble("volumePreco"));
                lista.add(volumeDto);

                System.out.println("id:" + volumeDto.getId());
                System.out.println("Nome:" + volumeDto.getNome());
                System.out.println("Volume:" + volumeDto.getVolume());
                System.out.println("Preço:" + volumeDto.getPreco());
                System.out.println("---------");
                

            }
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VolumeDao listar: " + erro.getMessage());
        }
        return lista;
    }
}
