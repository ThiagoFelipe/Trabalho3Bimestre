/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Aluno;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genericrest.dao.AlunoDAO;

/**
 *
 * @author thiag
 */
@ApplicationScoped
public class AlunoDAOImpl extends GenericDAO<Aluno, Long> implements AlunoDAO{
    
    private static final Logger LOG = LoggerFactory.getLogger(AlunoDAOImpl.class);

    public AlunoDAOImpl() {
        super(Aluno.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public Aluno findByNome(String nome) {
        Query query = getEntityManager().createNamedQuery("Aluno.findBynome", Aluno.class);
        query.setParameter("nome", nome);
        List<Aluno> remuneracao = query.getResultList();
        
        
        if (remuneracao == null || remuneracao.isEmpty()) {
            return null;
        } else if (remuneracao.size() > 1) {
            throw new NonUniqueResultException();
        } else {
            return remuneracao.get(0);
        }
    }
    
}
