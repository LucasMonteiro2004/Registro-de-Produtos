package registro;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroMercadorias registro = new RegistroMercadorias();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Definindo o Locale para US

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Buscar Produto");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (opcao == 1) {
                System.out.println("Digite o nome do produto:");
                String nome = scanner.nextLine();
                System.out.println("Digite o preço do produto:");
                double preco = scanner.nextDouble();
                System.out.println("Digite a quantidade do produto:");
                int quantidade = scanner.nextInt();
                Produto produto = new Produto(nome, preco, quantidade);
                registro.adicionarProduto(produto);
                System.out.println("Produto adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Digite o termo de busca:");
                String termo = scanner.nextLine();
                List<Produto> resultados = registro.buscarProduto(termo);
                if (resultados.isEmpty()) {
                    System.out.println("Nenhum produto encontrado com o termo especificado.");
                } else {
                    System.out.println("Produtos encontrados:");
                    for (Produto produto : resultados) {
                        System.out.println(produto);
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
