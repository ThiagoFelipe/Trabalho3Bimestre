/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thiag
 */
@Entity
@XmlRootElement
@Table
public class Remuneracao extends AbstractEntity{
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dia;
    private double valor;

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Remuneracao() {
    }

    @Override
    public void updateParameters(Object entity) {
    }
    
}
