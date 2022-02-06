package com.educacionhelmintos.controllers;

import com.educacionhelmintos.model.entity.Diagnostico;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EducacionController {

    @GetMapping("/private/index/menueducacion/{claveid}")
    public String showmenueducacion(@PathVariable(value="claveid")String claveid, Model model){

        return "menueducacion";
    }

    @GetMapping("/private/index/educacion/{claveid}")
    public String showeducacion(@PathVariable(value="claveid")String claveid, Model model){

        return "educacion";
    }

    @GetMapping("/private/index/examen/{claveid}")
    public String showexamen(@PathVariable(value="claveid")String claveid, Model model){

        return "examen";
    }
}
