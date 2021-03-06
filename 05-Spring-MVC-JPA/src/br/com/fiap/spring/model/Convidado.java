package br.com.fiap.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_CONVIDADO1")
@SequenceGenerator(name = "convidado", sequenceName = "SQ_T_CONVIDADO1", allocationSize = 1)
public class Convidado {

	@Id
	@GeneratedValue(generator = "convidado", strategy = GenerationType.SEQUENCE)
	private int codigo;

	private String nome;

	private boolean confirmado;

	private String email;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isConfirmado() {
		return confirmado;
	}

	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
