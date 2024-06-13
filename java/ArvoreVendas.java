class ArvoreVendas {
    NoVendas raiz;

    public ArvoreVendas() {
        this.raiz = null;
    }

  
    public void inserir(Vendas vendas) {
        raiz = inserirRec(raiz, vendas);
    }

    private NoVendas inserirRec(NoVendas raiz, Vendas vendas) {
        if (raiz == null) {
            raiz = new NoVendas(vendas);
            return raiz;
        }
        if (vendas.id < raiz.vendas.id) {
            raiz.anterior = inserirRec(raiz.anterior, vendas);
        } else if (vendas.id > raiz.vendas.id) {
            raiz.proximo = inserirRec(raiz.proximo, vendas);
        }
        return raiz;
    }
    
    public Vendas buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Vendas buscarRec(NoVendas raiz, int id) {
        if (raiz == null || raiz.vendas.getId() == id) {
            return raiz != null ? raiz.vendas : null;
        }
        if (id < raiz.vendas.getId()) {
            return buscarRec(raiz.anterior, id);
        } else {
            return buscarRec(raiz.proximo, id);
        }
    }
    
    public void subtrairQuantidade() {
        subtrairQuantidadeRec(raiz);
    }

    private void subtrairQuantidadeRec(NoVendas raiz) {
        if (raiz != null) {
            raiz.vendas.produto.setQuantidade(raiz.vendas.produto.getQuantidade() - raiz.vendas.quantVendida);
            subtrairQuantidadeRec(raiz.anterior);
            subtrairQuantidadeRec(raiz.proximo);
        }
    }
    
    public void exibirVendas() {
        exibirVendasRec(raiz);
    }

    private void exibirVendasRec(NoVendas raiz) {
        if (raiz != null) {
            exibirVendasRec(raiz.anterior);
            System.out.println(raiz.vendas);
            exibirVendasRec(raiz.proximo);
        }
    }
}