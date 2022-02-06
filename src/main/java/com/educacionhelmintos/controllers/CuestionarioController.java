package com.educacionhelmintos.controllers;

import com.educacionhelmintos.model.entity.Diagnostico;
import com.educacionhelmintos.model.entity.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class CuestionarioController {


    @GetMapping("/private/index/cuestionario/{claveid}")
    public String showcuestionario(@PathVariable(value="claveid")String claveid, Model model){

        Diagnostico diagnostico=new Diagnostico();
        model.addAttribute("diagnostico", diagnostico);
        return "cuestionario";
    }

    @PostMapping("/private/index/cuestionario/resultados")
    public String hacerdiagnostico (@ModelAttribute("diagnostico") Diagnostico diagnostico){

        int habitos=0;
        int sintomas=0;

        if (diagnostico.getPisos()!=null)
            habitos++;
        if (diagnostico.getAcueducto()!=null)
            habitos++;
        if (diagnostico.getZapatos()!=null)
            habitos++;
        if (diagnostico.getFrutas()!=null)
            habitos++;
        if (diagnostico.getDientes()!=null)
            habitos++;
        if (diagnostico.getDefeca()!=null)
            habitos++;
        if (diagnostico.getLavado()!=null)
            habitos++;

        System.out.println(habitos);

        if (diagnostico.getDiarrea()!=null)
            sintomas++;
        if (diagnostico.getDolor()!=null)
            sintomas++;
        if (diagnostico.getDebilidad()!=null)
            sintomas++;
        if (diagnostico.getMalestar()!=null)
            sintomas++;
        if (diagnostico.getApetito()!=null)
            sintomas++;

        System.out.println(sintomas);

        if ((Objects.equals(diagnostico.getDx(), "si") && (diagnostico.getZapatos()!=null || diagnostico.getAcueducto()!=null || diagnostico.getDiarrea()!=null))
        || (diagnostico.getDiarrea()!=null && ((sintomas >2)||(diagnostico.getZapatos()!=null || diagnostico.getAcueducto()!=null)||(habitos>3)))
        ||(sintomas>2 && habitos>3)
        ){
            System.out.println("provable contagio");
            return "provablecontagio";
        }
        else if( (sintomas>3) || (sintomas>1 &&(habitos>2 || diagnostico.getZapatos()!=null || diagnostico.getAcueducto()!=null || diagnostico.getDiarrea()!=null))
        ){
            System.out.println("posible contagio");
            return "posiblecontagio";
        }
        else if( (diagnostico.getZapatos()!=null && diagnostico.getAcueducto()!=null)||(habitos>2 && (diagnostico.getZapatos()!=null || diagnostico.getAcueducto()!=null||diagnostico.getPisos()!=null||diagnostico.getDefeca()!=null))
        ||(habitos>3)
        ){
            System.out.println("alto riesgo");
            return "altoriesgo";
        }
        else if( diagnostico.getZapatos()!=null || diagnostico.getAcueducto()!=null||diagnostico.getPisos()!=null||diagnostico.getDefeca()!=null || habitos>2
        ){
            System.out.println("riesgo moderado");
            return "riesgomoderado";
        }
        else if(habitos<2 && sintomas==0
        ){
            System.out.println("no riesgo");
            return "noriesgo";
        }
        else {
            System.out.println("no contagio pero ve al medico");
            return "nocontagio";
        }
    }
}
