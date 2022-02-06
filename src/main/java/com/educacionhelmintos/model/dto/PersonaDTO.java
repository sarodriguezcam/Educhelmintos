package com.educacionhelmintos.model.dto;

import com.educacionhelmintos.model.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaDTO extends JpaRepository <Persona, Long> {
    @Query(value="SELECT * FROM persona WHERE iduser = :claveid", nativeQuery = true)
    public List<Persona> selectpersonas (@Param("claveid")String clvaeid);
}
