class Produto {
    String nome;
    int quantidade;
    double precoUnitario;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;

        // Validação da quantidade
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 1;
            System.out.println("Aviso: Quantidade inválida para " + nome + ". Usando 1.");
        }

        // Validação do preço
        if (preco >= 0) {
            this.precoUnitario = preco;
        } else {
            this.precoUnitario = 0;
            System.out.println("Aviso: Preço inválido para " + nome + ". Usando 0.");
        }
    }
    public double calcularTotalItem() {
        return quantidade * precoUnitario;
    }
}

