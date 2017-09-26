/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.ProfessorDAO;
import com.genericrest.model.Professor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
public class ProfessorDAOImpl extends GenericDAO<Professor, Long> implements ProfessorDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(ProfessorDAOImpl.class);

    public ProfessorDAOImpl(Class<Professor> entityClass) {
        super(entityClass);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
