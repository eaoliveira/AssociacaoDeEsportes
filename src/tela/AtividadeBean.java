package tela;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;
import javax.persistence.PersistenceException;

import dao.AssociacaoDao;

import modelo.Associado;
import modelo.Atividade;

@ManagedBean(name = "atividadeBean")
public class AtividadeBean {
	@EJB
	private AssociacaoDao dao;
	private ListDataModel<Atividade> atividades;
	private String descricao;

	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void salvar() {
				Atividade obj = new Atividade();
				obj.setDescr(descricao);
				descricao="";
dao.adiciona(obj);
		
	}
	public int getCount() {
		return getAtividades().getRowCount();
	}
	public ListDataModel<Atividade> getAtividades() {
		if(atividades == null) {
			atividades = new ListDataModel<>(dao.getAtividades());
		}
		return atividades;
	}

}
