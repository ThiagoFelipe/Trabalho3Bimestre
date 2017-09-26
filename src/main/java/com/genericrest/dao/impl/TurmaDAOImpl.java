/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.TurmaDAO;
import com.genericrest.model.Turma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
public class TurmaDAOImpl extends GenericDAO<Turma, Long> implements TurmaDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(TurmaDAOImpl.class);

    public TurmaDAOImpl(Class<Turma> entityClass) {
        super(entityClass);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
