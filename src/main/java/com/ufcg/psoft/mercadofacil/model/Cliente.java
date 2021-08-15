package com.ufcg.psoft.mercadofacil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long CPF;

	private String nome;

	private Integer idade;

	private String endereco;

	// @OneToMany
	// private Carrinho carrinho;

	// private List<List<Compra>> comprasFeitas;

	private Cliente() {
	}

	public Cliente(Long cpf, String nome, Integer idade, String endereco) {
		this.CPF = cpf;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		// this.carrinho = new Carrinho();
		// this.comprasFeitas = new ArrayList<Carrinho>();
	}

	public Long getId() {
		return id;
	}

	public Long getCpf() {
		return CPF;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// public List<String> listarCompras() {
	// List<String> resultado = new ArrayList<String>();

	// return resultado;
	// }
}
