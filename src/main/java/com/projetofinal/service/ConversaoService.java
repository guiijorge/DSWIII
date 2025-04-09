package com.projetofinal.service;

import com.projetofinal.model.Conversao;
import org.springframework.stereotype.Service;

@Service
public class ConversaoService {
    public Conversao converter(Conversao conversao) {
        conversao.converter();
        return conversao;
    }
}

