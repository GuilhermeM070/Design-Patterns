package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GerarPedido {
    private String cliente;
    private int quantidadeDeItens;
    private BigDecimal valorOrcamento;

    public GerarPedido(String cliente, int quantidadeDeItens, BigDecimal valorOrcamento) {
        this.cliente = cliente;
        this.quantidadeDeItens = quantidadeDeItens;
        this.valorOrcamento = valorOrcamento;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeDeItens);

        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedidos no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
