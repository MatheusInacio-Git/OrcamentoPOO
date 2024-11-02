package com.example.orcamento.controller;

import com.example.orcamento.model.Orcamento;
import com.example.orcamento.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @PostMapping
    public Orcamento addOrcamento(@RequestBody Orcamento orcamento) {
        return orcamentoService.insertOrcamento(orcamento);
    }
    @GetMapping("/{id}")
    public Orcamento orcamentoById(@PathVariable int id) {
        return orcamentoService.selectById(id);
    }
    @PutMapping("/{id}/aprovar")
    public Orcamento aprovarOrcamento(@PathVariable int id) {
       return orcamentoService.aprovarOrcamento(id);
    }
}
