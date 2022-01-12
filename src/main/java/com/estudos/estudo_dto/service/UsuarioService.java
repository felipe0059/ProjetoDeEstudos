package com.estudos.estudo_dto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.estudo_dto.model.Usuario;
import com.estudos.estudo_dto.repository.UsuarioRepository;

@Service  // indicamos que esta classe é um serviço.
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
