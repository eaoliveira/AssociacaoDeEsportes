package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="agendamento")
public class Agendamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idagendamento")
	private int Id;
	@ManyToOne
	@JoinColumn(name="idAssociado")
	private Associado associado;
	@ManyToOne
	@JoinColumn(name="idAtividade")
	private Atividade atividade;
	private String horario;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Associado getAssociado() {
		return associado;
	}
	public void setAssociado(Associado associado) {
		this.associado = associado;
	}
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
}
