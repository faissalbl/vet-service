package br.com.jcf.vet.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.jcf.vet.entity.Dono;

public interface DonoRepository extends CrudRepository<Dono, Long> {

	List<Dono> findAll();
	
}
