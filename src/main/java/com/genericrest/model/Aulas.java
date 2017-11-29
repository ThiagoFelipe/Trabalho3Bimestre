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
@XmlRootElement(name = "aula")
@Table(name = "aula")
@NamedQueries({
    @NamedQuery(name ="Aulas.findByNome", query = "select e from Aulas e where e.nome = :nome")
})
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
        
        final Aulas other = (Aulas) entity;
        this.nome = other.nome;
    }
    
}
