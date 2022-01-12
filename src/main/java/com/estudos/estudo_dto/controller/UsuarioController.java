package com.estudos.estudo_dto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estudos.estudo_dto.dto.UsuarioDTO;
import com.estudos.estudo_dto.model.Usuario;
import com.estudos.estudo_dto.repository.UsuarioRepository;

@RequestMapping("/usuario")
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuariosregistrados")//metodo para trazer todos os registros do sistema, construidos na dto
	public List<UsuarioDTO> listaUsuario(){
		List<Usuario> usuario = usuarioRepository.findAll();
		return UsuarioDTO.convert(usuario);
	}
	
	@PostMapping("/registrarusuario") //metodo para registrar
	public Usuario add(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
		
	}
	@PutMapping("/{usuarioId}") //metodo para editar registros
	public ResponseEntity<Usuario> update(@PathVariable Long usuarioId, @RequestBody Usuario usuario){
		
		if(!usuarioRepository.existsById(usuarioId)) {
			return ResponseEntity.notFound().build(); // laço caso o registro não exista
		}
		
		usuario.setId(usuarioId);
		usuario = usuarioRepository.save(usuario);
		return ResponseEntity.ok(usuario);
	}
	
	@DeleteMapping("/{usuarioId}")  // metodo para editar registros 
	public ResponseEntity<Void> delete(@PathVariable Long usuarioId){
		if(!usuarioRepository.existsById(usuarioId)) {
			return ResponseEntity.notFound().build();
		}
		usuarioRepository.deleteById(usuarioId);
		return ResponseEntity.noContent().build();
	}
}

 