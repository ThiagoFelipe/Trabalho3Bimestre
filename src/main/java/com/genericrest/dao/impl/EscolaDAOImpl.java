/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.EscolaDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Escola;
import javax.enterprise.context.ApplicationScoped;
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

}
