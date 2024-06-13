
public class NoVendas {
    Vendas vendas;
    NoVendas anterior;
    NoVendas proximo;

    public NoVendas(Vendas vendas) {
        this.vendas = vendas;
        this.anterior = null;
        this.proximo = null;
    }
}
