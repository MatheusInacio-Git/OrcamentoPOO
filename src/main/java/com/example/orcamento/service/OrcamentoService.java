package com.example.orcamento.service;

import com.example.orcamento.model.Orcamento;
import com.example.orcamento.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrcamentoService {

        @Autowired
        private OrcamentoRepository orcamentoRepository;

        public Orcamento insertOrcamento(Orcamento orcamento){
            return orcamentoRepository.save(orcamento);
        }

        //select * from orcamento where id="id";
        public Orcamento selectById(int id){
            Optional<Orcamento> or = orcamentoRepository.findById(id);
            if(or.isEmpty()){
                throw new RuntimeException("Orçamento não encontrado");
            }
            return  or.get();
        }

        public Orcamento aprovarOrcamento(int id){
            Orcamento oc = selectById(id);
            if(oc != null){
                oc.setStatus("Aprovado");
                orcamentoRepository.save(oc);
            }
            return null;
        }

}
