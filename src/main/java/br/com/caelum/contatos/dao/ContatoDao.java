package br.com.caelum.contatos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.contatos.modelo.Contato;

@Repository
public class ContatoDao {
	
	@PersistenceContext
	private EntityManager manager;

	public List<Contato> lista() {
		return manager.createQuery("select t from Contato t", Contato.class).getResultList();
	}

	public void salva(Contato contato) {
		manager.persist(contato);
	}

}
