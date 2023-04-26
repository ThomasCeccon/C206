package EX_CONTA;

public class FichaCliente {

    //atributos
    private Cliente cliente;//associacao por composicao
    private Compra compra;//associacao por composicao

    //metodo construtor para conta e cliente
    public FichaCliente(Cliente cliente, Compra compra) {
        this.cliente = new  cliente;
        this.compra = new  compra;
    }

    //metodos
    public void inicia(){

    }
    public boolean finaliza(){

        return true;
    }

    //get e set
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
