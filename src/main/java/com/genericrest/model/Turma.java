/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import javax.persistence.Entity;

/**
 *
 * @author thiag
 */
@Entity
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
    }
    
}
