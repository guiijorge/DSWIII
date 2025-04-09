package com.projetofinal.controller;

import com.projetofinal.model.Conversao;
import com.projetofinal.service.ConversaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConversaoController {

    @Autowired
    private ConversaoService conversaoService;

    @GetMapping("/form-conversao")
    public String formConversao(Model model) {
        System.out.println("Entrou no controller");
        model.addAttribute("conversao", new Conversao());
        return "formularioConversao";
    }

    @PostMapping("/realizar-conversao")
    public String realizarConversao(@ModelAttribute Conversao conversao, Model model) {
        Conversao resultado = conversaoService.converter(conversao); // 👈 Aqui está a correção
        model.addAttribute("conversao", resultado);
        return "resultadoConversao";
    }
    @GetMapping("/")
    public String index() {
        return "redirect:/form-conversao";
    }

}
