/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.ProfessorDAO;
import com.genericrest.model.Professor;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
@ApplicationScoped
public class ProfessorDAOImpl extends GenericDAO<Professor, Long> implements ProfessorDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(ProfessorDAOImpl.class);

    public ProfessorDAOImpl() {
        super(Professor.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public Professor findByNome(String nome) {
        Query query = getEntityManager().createNamedQuery("Professor.findBynome", Professor.class);
        query.setParameter("name", nome);
        List<Professor> professor = query.getResultList();
        
        
        if (professor == null || professor.isEmpty()) {
            return null;
        } else if (professor.size() > 1) {
            throw new NonUniqueResultException();
        } else {
            return professor.get(0);
        }
    }
}
