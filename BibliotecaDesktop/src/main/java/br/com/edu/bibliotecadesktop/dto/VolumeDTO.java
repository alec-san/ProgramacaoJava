/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edu.bibliotecadesktop.dto;

/**
 *
 * @author Alecksandre
 */
public class VolumeDTO {
    
    public long id;
    public String Volume;
    public Double Preco;
    
    public String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
