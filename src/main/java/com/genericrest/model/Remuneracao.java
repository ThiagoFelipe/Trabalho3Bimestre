/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author thiag
 */
@Entity
public class Remuneracao extends AbstractEntity{
    
    private Date data;
    private double valor;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
