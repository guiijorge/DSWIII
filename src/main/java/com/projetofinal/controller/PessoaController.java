package com.projetofinal.controller;

import com.projetofinal.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PessoaController {

    @GetMapping("/form-pessoa")
    public String formPessoa(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "formularioPessoa";
    }

    @PostMapping("/salvar-pessoa")
    public String salvarPessoa(@ModelAttribute Pessoa pessoa, Model model) {
        model.addAttribute("pessoa", pessoa);
        return "resultadoPessoa";
    }
}
