import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(".⋆❀° Seja bem-vindo ao SuperMarket .⋆❀°");
        System.out.print("Quantos itens você vai registrar hoje? ");
        int numProdutos = scanner.nextInt();
        scanner.nextLine();

        Produto[] produtos = new Produto[numProdutos];

        // Loop para cadastrar os produtos
        for (int i = 0; i < numProdutos; i++) {
            System.out.println("\n--- Produto " + (i + 1) + " ---");

            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade: ");
            int qtd = scanner.nextInt();

            System.out.print("Preço unitário: R$ ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer

            produtos[i] = new Produto(nome, qtd, preco);
        }

        // Cálculo total da compra
        double totalCompra = 0;
        for (int i = 0; i < numProdutos; i++) {
            totalCompra += produtos[i].calcularTotalItem();
        }

        // Exibe o resultado final
        System.out.println("\n==================================");
        if (totalCompra > 100) {
            double desconto = totalCompra * 0.10;
            System.out.printf("Valor original: R$ %.2f\n", totalCompra);
            System.out.printf("Desconto (10%%): R$ %.2f\n", desconto);
            System.out.printf("Total com desconto: R$ %.2f\n", (totalCompra - desconto));
        } else {
            System.out.printf("Valor total da compra: R$ %.2f\n", totalCompra);
        }
        System.out.println("==================================");

        scanner.close();
    }
}