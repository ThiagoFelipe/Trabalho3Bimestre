/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ProfessorDAO;
import com.genericrest.model.Professor;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.ProfessorService;
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
@Path("/professor")
class ProfessorRestService extends GenericCRUDRestService<Professor> implements ProfessorService{
    
    private static final Logger LOG = LoggerFactory.getLogger(ProfessorRestService.class);
    
    @Inject
    private ProfessorDAO professorDAO;

    public ProfessorRestService() {
        super(Professor.class);
    }
    
    @GET
    @Path("nome/{param}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

    @Override
    public Response getByNome(String nome) {
        getLogger().debug("Pesquise o nome: {}", nome);
        Professor found = professorDAO.findByNome(nome);
        if (found == null) {
            return Response.noContent().build();
        }
        return Response.ok().entity(found).build();
    }

    @Override
    public GenericEntity listToGenericEntity(List<Professor> list) {
        return new GenericEntity<List<Professor>>(list){};
    }

    @Override
    public DAO getDao() {
        return professorDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
