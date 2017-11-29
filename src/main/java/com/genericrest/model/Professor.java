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
@XmlRootElement(name = "professor")
@Table(name = "professor")
@NamedQueries({
    @NamedQuery(name ="Professor.findByNome", query = "select e from Professor e where e.nome = :nome")
})
public class Professor extends AbstractEntity{
    
    private String nome;
    private String telefone;

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    @Override
    public void updateParameters(Object entity) {
        final Professor other = (Professor) entity;
        this.nome = other.nome;
        this.telefone = other.telefone;
    }
    
}
