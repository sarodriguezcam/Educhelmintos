package com.educacionhelmintos.controllers;

import com.educacionhelmintos.model.entity.Persona;
import com.educacionhelmintos.model.service.PersonaService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.logging.Logger;

@Controller
public class PersonaController {


    @Autowired
    private PersonaService personaService;



     /*@GetMapping("/private/index/listapersona")
    public String showpersonas(Model model){
        model.addAttribute("listaPersona",personaService.getAllPersonas());
        return "listapersona";
    }*/

   @GetMapping("/private/index/listapersona/nuevapersona")
    public String shownewpersona(Model model){
        Persona persona = new Persona();
        model.addAttribute("persona", persona);
        return "nuevapersona";
    }

    @PostMapping("/private/index/listapersona/savepersona/{iduser}")
    public String savepersona(@PathVariable(value="iduser") String iduser, @ModelAttribute("persona") Persona persona){
        personaService.savePersona(persona);
        String path ="redirect:/private/index/listapersona/%s";
        String pathn= String.format(path,iduser);
        return pathn;
    }

    @GetMapping("/private/index/listapersona/showupdatepersona/{id}")
    public String showupdatepersona(@PathVariable(value="id")long id, Model model){
        Persona persona=personaService.getPersonaById(id);
        model.addAttribute("persona", persona);
        return "updatepersona";
    }

    @GetMapping("/private/index/listapersona/borrarpersona/{id}/{iduser}")
    public String borrarpersona(@PathVariable(value="id")long id, @PathVariable(value="iduser") String iduser, Model model){

        this.personaService.deletePersonaById(id);
        String path ="redirect:/private/index/listapersona/%s";
        String pathn= String.format(path,iduser);
        return pathn;
    }

    @GetMapping("/private/index/listapersona/{claveid}")
    public String showpersonas(@PathVariable(value="claveid")String claveid,Model model){
        model.addAttribute("listaPersona",personaService.selectpersonas(claveid));
        return "listapersona";
    }
}
