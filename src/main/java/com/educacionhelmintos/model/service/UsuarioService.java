package com.educacionhelmintos.model.service;

import com.educacionhelmintos.model.entity.Usuario;

public interface UsuarioService {
    public Usuario findByUsername(String username);
    public Usuario registrar(Usuario usuario);
}