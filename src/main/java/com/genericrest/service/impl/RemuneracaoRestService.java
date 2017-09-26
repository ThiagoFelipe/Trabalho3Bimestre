/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.RemuneracaoDAO;
import com.genericrest.model.Remuneracao;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.RemuneracaoService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
public class RemuneracaoRestService extends GenericCRUDRestService<Remuneracao> implements RemuneracaoService{
    
     private static final Logger LOG = LoggerFactory.getLogger(RemuneracaoRestService.class);
    
    @Inject
    private RemuneracaoDAO remuneracaoDAO;

    public RemuneracaoRestService(Class<Remuneracao> entityClass) {
        super(entityClass);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Remuneracao> list) {
        return new GenericEntity<List<Remuneracao>>(list){};
    }

    @Override
    public DAO getDao() {
        return remuneracaoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}