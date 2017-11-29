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
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author thiag
 */
@ManagedBean
@Path("/aula")
class AulasRestService extends GenericCRUDRestService<Aulas> implements AulasService{
    
    private static final Logger LOG = LoggerFactory.getLogger(AulasRestService.class);
    
    @Inject
    private AulasDAO aulaDAO;

    public AulasRestService() {
        super(Aulas.class);
    }

    @GET
    @Path("nome/{param}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

    @Override
    public Response getByNome(String nome) {
        getLogger().debug("Pesquise o nome: {}", nome);
        Aulas found = aulaDAO.findByNome(nome);
        if (found == null) {
            return Response.noContent().build();
        }
        return Response.ok().entity(found).build();
    }
    
    @Override
    public GenericEntity listToGenericEntity(List<Aulas> list) {
        return new GenericEntity<List<Aulas>>(list){};
    }

    @Override
    public DAO getDao() {
        return aulaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
