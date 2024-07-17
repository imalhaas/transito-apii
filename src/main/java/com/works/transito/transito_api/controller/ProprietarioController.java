package com.works.transito.transito_api.controller;

import com.works.transito.transito_api.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar(){
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Lucas");
        proprietario1.setEmail("lucas@gmail.com");
        proprietario1.setTelefone("61 3399-3432");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Maria");
        proprietario2.setEmail("maria@gmail.com");
        proprietario2.setTelefone("61 3399-3332");

        return Arrays.asList(proprietario1,proprietario2);
    }
}
