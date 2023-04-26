package EX_CONTA;

public class Compra {

    //atributos
    private float valorTotal;
    Pedido []pedidos=new Pedido[10];//associacao por composicao
    Pagamento []pagamentos=new Pagamento[10];//associacao por composicao

    //metodos
    public void realizarCompra(){

    }

    //get e set
    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
