package com.estudos.estudo_dto.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // identifica a classe como entidade e será mapeada no bco de dados.
@Getter // anotação do lombok que possibilita métodos getters sem escrevê-los
@Setter
@NoArgsConstructor // essa anotação do lombok é responsável por gerar um construtor sem parâmetros.
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //gerado automaticamente usando a estratégia IDENTITY.
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String matricula;
    private boolean admin = false;

    public Usuario( String nome, String email, String senha, String matricula) {
     
    	this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.matricula = matricula;

      }	
	}

