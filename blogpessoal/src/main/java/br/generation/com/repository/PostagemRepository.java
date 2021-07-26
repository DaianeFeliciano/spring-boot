package br.generation.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.generation.com.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long > {
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	// busca todos pelo titulo, titulo = atributo da entidade
	

}
