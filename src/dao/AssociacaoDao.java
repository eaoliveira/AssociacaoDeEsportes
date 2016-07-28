package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Agendamento;

import modelo.Associado;
import modelo.Atividade;

@Stateless
public class AssociacaoDao {
	@PersistenceContext(unitName="AssociacaoDeEsportes")
	private EntityManager manager;
	
	public void adiciona(Object obj) {
		System.out.println("-- Salvo: " + obj);
		manager.merge(obj);
	}

	public Atividade getAtividade(int id) {
		return manager.find(Atividade.class, id);
	}

	public Associado getAssociado(int id) {
		return manager.find(Associado.class, id);
	}

	public void removeAtividade(int id) {
		Atividade obj = manager.find(Atividade.class, id);
		if (obj != null)
			manager.remove(obj);
	}
	
	public void removeAssociado(int id) {
		Associado obj = manager.find(Associado.class, id);
		if (obj != null)
			manager.remove(obj);
	}
	public void removeAgendamento(int id) {
		Agendamento obj = manager.find(Agendamento.class, id);
		if (obj != null)
			manager.remove(obj);
	}
	
	public List<Associado> getAssociados() {
		Query sql = manager.createQuery("from Associado", Associado.class);
		@SuppressWarnings("unchecked")
		List<Associado> lista = sql.getResultList();
		return lista;
	}
	
	public List<Atividade> getAtividades() {
		Query sql = manager.createQuery("from Atividade", Atividade.class);
		@SuppressWarnings("unchecked")
		List<Atividade> lista = sql.getResultList();
		return lista;	}
	
	public List<Agendamento> getAgendamentos() {
		Query sql = manager.createQuery("from Agendamento", Agendamento.class);
		@SuppressWarnings("unchecked")
		List<Agendamento> lista = sql.getResultList();
		return lista;	}
}
