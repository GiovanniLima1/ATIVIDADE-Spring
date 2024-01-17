package com.generation.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Size(min=2, max=50, message = "O nome deve ter no mínimo 2 caracteres e no máximo 50")
    @NotBlank(message = "Atributo nome é obrigatório")
    private String nome;

	@NotBlank(message = "Atributo preço é obrigatório")    
	private Double preco;  
    
	@Size(min=5, max=50, message = "O nome da distribuidora deve ter no mínimo 10 caracteres e no máximo 50")
	private String distribuidora;
    
	@Size(min=10, max=50, message = "O nome da produtora deve ter no mínimo 10 caracteres e no máximo 50")
    private String produtora; 
    
	@NotBlank(message = "Atributo classificação é obrigatório")
    private int classificacao;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categorias categorias;

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	
    
    
    
    
    
}
