/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;

import com.genericrest.model.Aluno;

/**
 *
 * @author thiag
 */
public interface AlunoDAO extends DAO<Aluno, Long>{
    
    Aluno findByNome(String nome);

}
