package br.com.fiap.segurancacap8.controller;

import br.com.fiap.segurancacap8.exception.ResourceNotFoundException;
import br.com.fiap.segurancacap8.model.SolicitacaoOcorrencia;
import br.com.fiap.segurancacap8.repository.SolicitacaoOcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoOcorrenciaController {

    @Autowired
    private SolicitacaoOcorrenciaRepository solicitacaoOcorrenciaRepository;

    @PostMapping
    public SolicitacaoOcorrencia createSolicitacaoOcorrencia(@RequestBody SolicitacaoOcorrencia solicitacaoOcorrencia) {
        return solicitacaoOcorrenciaRepository.save(solicitacaoOcorrencia);
    }

    @GetMapping
    public List<SolicitacaoOcorrencia> getAllSolicitacaoOcorrencias() {
        return solicitacaoOcorrenciaRepository.findAll();
    }

    @GetMapping("/{id}")
    public SolicitacaoOcorrencia getSolicitacaoOcorrenciaById(@PathVariable Long id) {
        return solicitacaoOcorrenciaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Solicitação não encontrada"));
    }

    @PutMapping("/{id}")
    public SolicitacaoOcorrencia updateSolicitacaoOcorrencia(@PathVariable Long id, @RequestBody SolicitacaoOcorrencia solicitacaoOcorrenciaDetails) {
        SolicitacaoOcorrencia solicitacaoOcorrencia = solicitacaoOcorrenciaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Solicitação não encontrada"));
        solicitacaoOcorrencia.setTipo(solicitacaoOcorrenciaDetails.getTipo());
        solicitacaoOcorrencia.setDescricao(solicitacaoOcorrenciaDetails.getDescricao());
        solicitacaoOcorrencia.setDataFato(solicitacaoOcorrenciaDetails.getDataFato());
        solicitacaoOcorrencia.setHoraFato(solicitacaoOcorrenciaDetails.getHoraFato());
        solicitacaoOcorrencia.setUser(solicitacaoOcorrenciaDetails.getUser());
        solicitacaoOcorrencia.setZone(solicitacaoOcorrenciaDetails.getZone());
        return solicitacaoOcorrenciaRepository.save(solicitacaoOcorrencia);
    }

    @DeleteMapping("/{id}")
    public void deleteSolicitacaoOcorrencia(@PathVariable Long id) {
        SolicitacaoOcorrencia solicitacaoOcorrencia = solicitacaoOcorrenciaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Solicitação não encontrada"));
        solicitacaoOcorrenciaRepository.delete(solicitacaoOcorrencia);
    }
}
