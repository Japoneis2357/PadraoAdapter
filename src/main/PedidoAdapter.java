package main;

public class PedidoAdapter extends PedidoValor {

    private IPedido pedidoDescricao;

    public PedidoAdapter(IPedido pedidoDescricao) {
        this.pedidoDescricao = pedidoDescricao;
    }

    public String recuperarPedido() {
        if (this.getValor() >= 35.0f)
            pedidoDescricao.setPedido("X-Especial");
        else if (this.getValor() >= 25.0f)
            pedidoDescricao.setPedido("X-Bacon");
        else if (this.getValor() >= 15.0f)
            pedidoDescricao.setPedido("X-Salada");
        else
            pedidoDescricao.setPedido("X-Simples");

        return pedidoDescricao.getPedido();
    }

    public void salvarPedido() {
        if (pedidoDescricao.getPedido().equals("X-Especial"))
            this.setValor(35.0f);
        else if (pedidoDescricao.getPedido().equals("X-Bacon"))
            this.setValor(25.0f);
        else if (pedidoDescricao.getPedido().equals("X-Salada"))
            this.setValor(15.0f);
        else
            this.setValor(0.0f);
    }
}