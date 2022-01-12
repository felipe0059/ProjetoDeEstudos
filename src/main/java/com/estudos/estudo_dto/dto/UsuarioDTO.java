package com.estudos.estudo_dto.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estudos.estudo_dto.model.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UsuarioDTO {
	
	private Long id;
    private String nome;
    private String email;
    private String matricula;
    
    public UsuarioDTO (Usuario usuario) {
    	this.id = usuario.getId();
    	this.nome = usuario.getNome();
    	this.email = usuario.getEmail();
    	this.matricula = usuario.getMatricula();
    }
   //conversor de usuarios dto para uma lista
    
    public static List<UsuarioDTO> convert (List<Usuario> usuario) {
    	return usuario.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }
 
    
}
