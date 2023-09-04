package br.com.alura;

import br.com.alura.pedido.GerarPedido;
import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeDeItens = Integer.parseInt(args[2]);

        GerarPedido gerador = new GerarPedido(cliente, quantidadeDeItens, valorOrcamento);
        gerador.executa();
    }
}