package br.com.alura.orcamento;

import br.com.alura.orcamento.situacao.EmAnalise;
import br.com.alura.orcamento.situacao.Reprovado;
import br.com.alura.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situação;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
        this.valor = valor;
        this.situação = new EmAnalise();
    }

    public void setSituação(SituacaoOrcamento situação) {
        this.situação = situação;
    }

    public SituacaoOrcamento getSituação() {
        return situação;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situação.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }
    public void aplicar(){
        this.situação.aprovar(this);
    }

    public void reprovar(){
        this.situação.reprovar(this);
    }

    public void finalizar(){
        this.situação.finalizar(this);
    }
    public BigDecimal getValor() {
        return valor;
    }
    public int getQuantidadeItens() {
        return quantidadeItens;
    }


}

