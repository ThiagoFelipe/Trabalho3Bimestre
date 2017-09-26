/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.AulasDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Aulas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
public class AulasDAOImpl extends GenericDAO<Aulas, Long> implements AulasDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(AulasDAOImpl.class);

    public AulasDAOImpl(Class<Aulas> entityClass) {
        super(entityClass);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
