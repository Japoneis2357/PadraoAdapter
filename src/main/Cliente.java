package main;

public class Cliente {

    IPedido pedido;
    PedidoAdapter persistencia;

    public Cliente() {
        pedido = new PedidoDescricao();
        persistencia = new PedidoAdapter(pedido);
    }

    public void setPedido(String descricao) {
        pedido.setPedido(descricao);
        persistencia.salvarPedido();
    }

    public String getPedido() {
        return persistencia.recuperarPedido();
    }

    // Mostra que está convertendo descrição para valor através do adaptador
    public float getValor() {
        return persistencia.getValor();
    }
}