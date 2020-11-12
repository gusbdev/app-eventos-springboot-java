package br.eventoapp.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;


@Entity
public class Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;

	@NotEmpty(message = "Este campo não pode estar vazio!")
	@NonNull
	@NotBlank
	private String nome;
	
	@NotEmpty(message = "Este campo não pode estar vazio!")
	@NonNull
	@NotBlank
	private String local;
	
	@NotEmpty(message = "Este campo não pode estar vazio!")
	@NonNull
	@NotBlank
	private String data;

	@NotEmpty(message = "Este campo não pode estar vazio!")
	@NonNull
	@NotBlank
	private String horario;
	
	@OneToMany
	private List<Convidado> convidados;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
}