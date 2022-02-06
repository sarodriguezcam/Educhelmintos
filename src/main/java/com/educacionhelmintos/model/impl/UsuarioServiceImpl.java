package com.educacionhelmintos.model.impl;

import com.educacionhelmintos.model.dto.UsuarioDTO;
import com.educacionhelmintos.model.entity.Usuario;
import com.educacionhelmintos.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioDTO usuarioDTO;


    @Override
    public Usuario findByUsername(String username) {
            return usuarioDTO.findByUsername(username);
    }

    @Override
    public Usuario registrar(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioDTO.save(usuario);
    }
}

