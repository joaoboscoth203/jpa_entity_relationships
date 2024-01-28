package br.com.project.example_one_to_one.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.example_one_to_one.modelo.Colaborador;

@Repository
public interface ColaboradorRepositorio extends CrudRepository<Colaborador, Long> {
    
}
