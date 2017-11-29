/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;


import javax.json.Json;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thiag
 */
@Entity
@XmlRootElement(name = "aluno")
@Table(name = "aluno")
@NamedQueries({
    @NamedQuery(name ="Aluno.findByNome", query = "select e from Aluno e where e.nome = :nome")
})
public class Aluno extends AbstractEntity{
    
    
    private String nome;
    private String RA;
    
    @ManyToOne
    private Turma turma;

    public Aluno(String nome, String RA, Turma turma) {
        this.nome = nome;
        this.RA = RA;
        this.turma = turma;
    }
   
    

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public Aluno() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Aluno other = (Aluno) entity;
        this.nome = other.nome;
        this.RA = other.RA;
        this.turma = other.turma;
    }
    
}
