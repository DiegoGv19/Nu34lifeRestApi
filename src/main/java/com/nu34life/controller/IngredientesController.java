package com.nu34life.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ingredientes")
public class IngredientesController {

    @GetMapping("/view/{id}")
    public String getIngredientes(@PathVariable("id") int idVariable, Model model){

        model.addAttribute("id", idVariable);

        return "ingrediente/mostrar";
    }
}
