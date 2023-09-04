package br.com.alura;

import br.com.alura.imposto.CalculadoraDeImposto;
import br.com.alura.imposto.ICMS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}