/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.AulasDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Aulas;
import com.genericrest.service.AulasService;
import com.genericrest.service.GenericCRUDRestService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
public class AulasRestService extends GenericCRUDRestService<Aulas> implements AulasService{
    
    private static final Logger LOG = LoggerFactory.getLogger(AulasRestService.class);
    
    @Inject
    private AulasDAO aulasDAO;

    public AulasRestService(Class<Aulas> entityClass) {
        super(entityClass);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Aulas> list) {
        return new GenericEntity<List<Aulas>>(list){};
    }

    @Override
    public DAO getDao() {
        return aulasDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
