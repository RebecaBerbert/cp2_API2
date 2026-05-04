package com.github.biloschycki.carro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Consultorio {
     @Id
    private Long id;

    @Column(name = "nome_paciente", columnDefinition = "char(100)", nullable = false)
    private String nome;



    @Column(name = "tutor_paciente", columnDefinition = "char(100)", nullable = false)
    private String tutor;

    @Column(name = "idade_paciente", columnDefinition = "char(100)", nullable = false)
    private int idade;

    @Column(name = "especie_paciente", columnDefinition = "char(100)", nullable = false)
    private String especie;

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

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }



}
