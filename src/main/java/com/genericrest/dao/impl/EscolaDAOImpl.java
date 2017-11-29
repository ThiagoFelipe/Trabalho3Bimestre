/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.EscolaDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Escola;
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
public class EscolaDAOImpl extends GenericDAO<Escola, Long> implements EscolaDAO {

    private static final Logger LOG = LoggerFactory.getLogger(EscolaDAOImpl.class);

    public EscolaDAOImpl() {
        super(Escola.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public Escola findByNome(String nome) {
        Query query = getEntityManager().createNamedQuery("Escola.findBynome", Escola.class);
        query.setParameter("nome", nome);
        List<Escola> escola = query.getResultList();
        
        
        if (escola == null || escola.isEmpty()) {
            return null;
        } else if (escola.size() > 1) {
            throw new NonUniqueResultException();
        } else {
            return escola.get(0);
        }
    }
}
