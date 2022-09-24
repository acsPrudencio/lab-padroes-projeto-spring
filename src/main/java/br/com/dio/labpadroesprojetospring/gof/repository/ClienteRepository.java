package br.com.dio.labpadroesprojetospring.gof.repository;

import br.com.dio.labpadroesprojetospring.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
