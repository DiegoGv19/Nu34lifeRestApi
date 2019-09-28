package com.nu34life.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(Model model){
        //model.addAttribute("mensaje", "Bienvenido a Nu34Life");
        //model.addAttribute("fecha", new Date());

        String nombre = "Armando Javier";
        Date fechaPub = new Date();
        Double salario = 9000.00;

        model.addAttribute("nombre", nombre);
        model.addAttribute("fecha", fechaPub);
        model.addAttribute("salario", salario);

        return "home";
    }

    @GetMapping("/listado")
    public String getListado(Model model){
        List<String> lista = new ArrayList<String>();

        lista.add("Espinaca");
        lista.add("Zanahoria");
        lista.add("Papaya");
        lista.add("Lechuga");

        model.addAttribute("listaIngredientes", lista);

        return "lista";
    }
}
