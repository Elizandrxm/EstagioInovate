# Sistema SuperMarket.⋆❀° 

Sistema desenvolvido em Java para simular o caixa de um supermercado. O programa registra produtos, calcula o valor total da compra e aplica desconto automaticamente quando aplicável.

## Estrutura do Projeto

O projeto foi desenvolvido utilizando os princípios da Programação Orientada a Objetos (POO), com separação clara de responsabilidades:

- **Classe Produto**: Responsável por armazenar os dados do produto (nome, quantidade, preço unitário) e validar as entradas.
- **Classe Main**: Responsável pela interação com o usuário, fluxo do programa, cálculo do total e aplicação do desconto.

## Funcionalidades

- Cadastro de múltiplos produtos em uma única compra
- Validação automática de entradas:
  - Quantidades menores ou iguais a zero são ajustadas para 1
  - Preços negativos são ajustados para 0
  - Mensagens de aviso são exibidas ao usuário
- Cálculo do valor total da compra com duas casas decimais
- Aplicação de desconto de 10% para compras acima de R$ 100,00
- Exibição clara do valor original, desconto aplicado e valor final (quando aplicável)

## Pré-requisitos

- Java JDK 11 ou superior instalado
- Terminal ou prompt de comando


Validações implementadas
Regra	Comportamento
Quantidade <= 0	Ajusta para 1 e exibe aviso
Preço negativo	Ajusta para 0 e exibe aviso
Separador decimal	Aceita ponto ou vírgula
Tecnologia utilizada
Java (JDK 11 ou superior)

Autora : Elizandra Maria
