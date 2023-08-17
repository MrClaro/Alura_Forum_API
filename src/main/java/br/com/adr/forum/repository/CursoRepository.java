package br.com.adr.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adr.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	static Curso findByNome(String nome) {
		return null;
	}
 
}
