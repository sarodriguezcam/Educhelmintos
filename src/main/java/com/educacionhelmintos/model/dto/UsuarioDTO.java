package com.educacionhelmintos.model.dto;

import com.educacionhelmintos.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDTO extends JpaRepository <Usuario,Long> {
    public Usuario findByUsername(String username);
}
