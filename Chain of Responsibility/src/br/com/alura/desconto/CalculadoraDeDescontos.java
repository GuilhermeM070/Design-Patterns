package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new OrcamentoMaisDeCincoItens(
                new OrcamentoValorMaiorQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }

}
