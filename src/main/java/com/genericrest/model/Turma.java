/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thiag
 */
@Entity
@XmlRootElement(name = "turma")
@Table(name = "turma")
@NamedQueries({
    @NamedQuery(name ="Turma.findByNome", query = "select e from Turma e where e.nome = :nome")
})
public class Turma extends AbstractEntity{
    
    private Double qtdVagas;
    private String horas;
    private String nome;

    public Double getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(Double qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Turma other = (Turma) entity;
        this.nome = other.nome;
        this.horas = other.horas;
        this.qtdVagas = other.qtdVagas;
    }
    
}
