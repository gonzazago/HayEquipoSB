package com.gonzazago.HayEquipo.services;

import com.gonzazago.HayEquipo.entities.Usuario;
import com.gonzazago.HayEquipo.dto.UsuarioDTO;
import org.springframework.stereotype.Service;
import com.gonzazago.HayEquipo.repository.UsuarioRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private final UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario registrarUsuario(UsuarioDTO usuarioDTO){

        Usuario usuario = new Usuario();

        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setMail(usuarioDTO.getMail());
        usuario.setPassword(usuarioDTO.getPassword());

        usuarioRepository.save(usuario);
        return usuario;

    }
}
