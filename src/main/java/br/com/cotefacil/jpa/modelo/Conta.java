package br.com.cotefacil.jpa.modelo;

import javax.persistence.Entity;

@Entity
public class Conta {
	
	private Long id;
	private Integer agencia;
	private Integer numero;
	private String Titular;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	
	
	

}
