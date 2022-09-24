package br.com.dio.labpadroesprojetospring.gof.repository;

import br.com.dio.labpadroesprojetospring.gof.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
