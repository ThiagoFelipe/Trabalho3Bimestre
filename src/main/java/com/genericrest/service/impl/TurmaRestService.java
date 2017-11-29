/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.TurmaDAO;
import com.genericrest.model.Turma;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.TurmaService;
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
@Path("/turma")
class TurmaRestService extends GenericCRUDRestService<Turma> implements TurmaService{
    
    private static final Logger LOG = LoggerFactory.getLogger(TurmaRestService.class);
    
     @Inject
    private TurmaDAO turmaDAO;

    public TurmaRestService() {
        super(Turma.class);
    }
    
    @GET
    @Path("nome/{param}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

    @Override
    public Response getByNome(String nome) {
        getLogger().debug("Pesquise o nome: {}", nome);
        Turma found = turmaDAO.findByNome(nome);
        if (found == null) {
            return Response.noContent().build();
        }
        return Response.ok().entity(found).build();
    }
    
    @Override
    public GenericEntity listToGenericEntity(List<Turma> list) {
        return new GenericEntity<List<Turma>>(list){};
    }

    @Override
    public DAO getDao() {
        return turmaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
