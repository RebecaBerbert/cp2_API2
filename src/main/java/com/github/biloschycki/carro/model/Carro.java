package com.github.biloschycki.carro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carros")
public class Carro {

    @Id
    private Long id;

    @Column(name = "nome_carro", columnDefinition = "char(100)", nullable = false)
    private String nome;

    @Column(name = "ano_carro", columnDefinition = "char(100)", nullable = false)
    private int ano;

    @Column(name = "marca_carro", columnDefinition = "char(100)", nullable = false)
    private String marca;
    
    @Column(name = "modelo_carro", columnDefinition = "char(100)", nullable = false)
    private String modelo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   

}
