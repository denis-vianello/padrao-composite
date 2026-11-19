/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orcamentocomposite;

/**
 *
 * @author PICHAU
 */
public class ItemOrcamento implements ComponenteOrcamento {

    private String descricao;
    private double custo;

    public ItemOrcamento(String descricao, double custo) {
        this.descricao = descricao;
        this.custo = custo;
    }

    @Override
    public double calcularCusto() {
        return custo;
    }

    public String getDescricao() {
        return descricao;
    }
}
