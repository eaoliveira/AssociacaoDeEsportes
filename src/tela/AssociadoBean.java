package tela;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.ListDataModel;
import javax.persistence.PersistenceException;

import dao.AssociacaoDao;

import modelo.Associado;

@ManagedBean(name = "associadoBean")
public class AssociadoBean {
	@EJB
	private AssociacaoDao dao;
	private ListDataModel<Associado> associados;
	private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void salvar() {
				Associado obj = new Associado();
				obj.setNome(nome);
				obj.setEmail(email);
				nome="";
				email="";
				dao.adiciona(obj);
		
	}
	public int getCount() {
		return getAssociados().getRowCount();
	}
	public ListDataModel<Associado> getAssociados() {
		if(associados == null) {
			associados = new ListDataModel<>(dao.getAssociados());
		}
		return associados;
	}

}
