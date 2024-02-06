package registro;

import java.util.ArrayList;
import java.util.List;

public class RegistroMercadorias {
    private List<Produto> produtos;

    public RegistroMercadorias() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> buscarProduto(String termo) {
        List<Produto> resultados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(termo.toLowerCase())) {
                resultados.add(produto);
            }
        }
        return resultados;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}

