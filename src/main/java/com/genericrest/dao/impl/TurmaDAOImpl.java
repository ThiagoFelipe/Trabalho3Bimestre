/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.TurmaDAO;
import com.genericrest.model.Turma;
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
public class TurmaDAOImpl extends GenericDAO<Turma, Long> implements TurmaDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(TurmaDAOImpl.class);

    public TurmaDAOImpl() {
        super(Turma.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public Turma findByNome(String nome) {
        Query query = getEntityManager().createNamedQuery("Turma.findBynome", Turma.class);
        query.setParameter("nome", nome);
        List<Turma> turma = query.getResultList();
        
        
        if (turma == null || turma.isEmpty()) {
            return null;
        } else if (turma.size() > 1) {
            throw new NonUniqueResultException();
        } else {
            return turma.get(0);
        }
    }
    
}
