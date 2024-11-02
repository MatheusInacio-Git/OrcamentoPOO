package com.example.orcamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orcamento {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String responsavel;
    private double valor;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String status = "pendente";

    public int getId() {
        return id;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }
}
