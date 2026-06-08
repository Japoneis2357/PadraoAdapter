package main;

public class PedidoDescricao implements IPedido {

    private String descricao;

    @Override
    public String getPedido() {
        return this.descricao;
    }

    @Override
    public void setPedido(String descricao) {
        this.descricao = descricao;
    }
}
