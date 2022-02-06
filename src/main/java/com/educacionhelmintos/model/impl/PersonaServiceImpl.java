package com.educacionhelmintos.model.impl;

import com.educacionhelmintos.model.dto.PersonaDTO;
import com.educacionhelmintos.model.entity.Persona;
import com.educacionhelmintos.model.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDTO personaDTO;
    @Override
    public List<Persona> getAllPersonas() {
        return personaDTO.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        this.personaDTO.save(persona);
    }

    @Override
    public Persona getPersonaById(long id) {
        Optional <Persona> optional=personaDTO.findById(id);
        Persona persona=null;
        if(optional.isPresent()){
            persona= optional.get();
        }else{
            throw new RuntimeException("No se encuentra la persona ::"+ id);
        }
        return persona;
    }

    @Override
    public void deletePersonaById(long id) {
        this.personaDTO.deleteById(id);
    }

    @Override
    public List<Persona> selectpersonas(String claveid) {
        return personaDTO.selectpersonas(claveid);
    }
}
