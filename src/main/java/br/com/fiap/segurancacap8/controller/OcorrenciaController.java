package br.com.fiap.segurancacap8.controller;

import br.com.fiap.segurancacap8.exception.ResourceNotFoundException;
import br.com.fiap.segurancacap8.model.Ocorrencia;
import br.com.fiap.segurancacap8.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    @Autowired
    private OcorrenciaRepository ocorrenciaRepository;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getAllOcorrencias() {
        return ocorrenciaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ocorrencia getOcorrenciaById(@PathVariable Long id) {
        return ocorrenciaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ocorrência não encontrada"));
    }
}

