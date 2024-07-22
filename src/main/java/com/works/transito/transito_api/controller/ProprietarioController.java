package com.works.transito.transito_api.controller;

import com.works.transito.transito_api.domain.model.Proprietario;
import com.works.transito.transito_api.repository.ProprietarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@RestController
public class ProprietarioController {

    private final ProprietarioRepository proprietarioRepository;


    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
     //   return proprietarioRepository.findByNomeContaining("a");
      return proprietarioRepository.findAll();
    }
}
