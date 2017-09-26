/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.RemuneracaoDAO;
import com.genericrest.model.Remuneracao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
public class RemuneracaoDAOImpl extends GenericDAO<Remuneracao, Long> implements RemuneracaoDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(RemuneracaoDAOImpl.class);

    public RemuneracaoDAOImpl(Class<Remuneracao> entityClass) {
        super(entityClass);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
