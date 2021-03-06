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
@XmlRootElement(name = "escolas")
@Table(name = "escolas")
@NamedQueries({
    @NamedQuery(name ="Escola.findByNome", query = "select e from Escola e where e.nome = :nome")
})
public class Escola extends AbstractEntity {
    
    private String nome;
    private String endereco;
    private Double numero;
    private String bairro;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Escola() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Escola other = (Escola) entity;
        this.nome = other.nome;
        this.endereco = other.endereco;
        this.bairro = other.bairro;
        this.numero = other.numero;
        this.telefone = other.telefone;
   }
    
}
