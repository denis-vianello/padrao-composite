/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.mycompany.orcamentocomposite.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GrupoOrcamentoTest {

    @Test
    public void testarCustoItemIndividual() {
        ItemOrcamento pintura =
                new ItemOrcamento("Pintura", 2500.00);

        assertEquals(2500.00, pintura.calcularCusto(), 0.001);
    }

    @Test
    public void testarCustoGrupo() {
        GrupoOrcamento fundacao = new GrupoOrcamento("Fundação");

        fundacao.adicionar(
                new ItemOrcamento("Escavação", 3000.00));

        fundacao.adicionar(
                new ItemOrcamento("Concretagem", 5000.00));

        assertEquals(8000.00, fundacao.calcularCusto(), 0.001);
    }

    @Test
    public void testarCustoGruposAninhados() {
        GrupoOrcamento obra = new GrupoOrcamento("Obra");

        GrupoOrcamento fundacao = new GrupoOrcamento("Fundação");
        fundacao.adicionar(new ItemOrcamento("Escavação", 3000.00));
        fundacao.adicionar(new ItemOrcamento("Concretagem", 5000.00));

        GrupoOrcamento estrutura = new GrupoOrcamento("Estrutura");
        estrutura.adicionar(new ItemOrcamento("Pilares", 4000.00));
        estrutura.adicionar(new ItemOrcamento("Vigas", 3000.00));

        obra.adicionar(fundacao);
        obra.adicionar(estrutura);
        obra.adicionar(new ItemOrcamento("Pintura", 2500.00));

        assertEquals(17500.00, obra.calcularCusto(), 0.001);
    }

    @Test
    public void testarRemocaoDeComponente() {
        GrupoOrcamento acabamento = new GrupoOrcamento("Acabamento");

        ItemOrcamento pintura =
                new ItemOrcamento("Pintura", 2500.00);

        acabamento.adicionar(pintura);
        acabamento.adicionar(
                new ItemOrcamento("Piso", 3500.00));

        acabamento.remover(pintura);

        assertEquals(3500.00, acabamento.calcularCusto(), 0.001);
    }
}
