/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orcamentocomposite;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PICHAU
 */


public class GrupoOrcamento implements ComponenteOrcamento {

    private String descricao;
    private List<ComponenteOrcamento> componentes;

    public GrupoOrcamento(String descricao) {
        this.descricao = descricao;
        this.componentes = new ArrayList<>();
    }

    public void adicionar(ComponenteOrcamento componente) {
        componentes.add(componente);
    }

    public void remover(ComponenteOrcamento componente) {
        componentes.remove(componente);
    }

    @Override
    public double calcularCusto() {
        double total = 0;

        for (ComponenteOrcamento componente : componentes) {
            total += componente.calcularCusto();
        }

        return total;
    }

    public String getDescricao() {
        return descricao;
    }
}