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
public class Aulas extends AbstractEntity{
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aulas() {
    }

    @Override
    public void updateParameters(Object entity) {
    }
    
}
