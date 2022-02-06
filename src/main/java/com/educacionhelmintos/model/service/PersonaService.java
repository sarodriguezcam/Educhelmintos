package com.educacionhelmintos.model.service;

import com.educacionhelmintos.model.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> getAllPersonas ();
    void savePersona(Persona persona);
    Persona getPersonaById(long id);
    void deletePersonaById (long id);
    List<Persona> selectpersonas (String claveid);

}
