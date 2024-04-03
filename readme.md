# Sistema de Criptografia

Este é um programa Java que implementa um sistema de criptografia simples com suporte para dois métodos de criptografia: a Cifra de César e o Código Morse.

## Funcionalidades

- **Cifra de César**: Uma técnica de criptografia na qual cada letra no texto é deslocada por um número fixo de posições no alfabeto.
- **Código Morse**: Um método de comunicação que utiliza uma série de pontos e traços para representar letras, números e sinais de pontuação.

## Estrutura do Projeto

- **`MetodoCriptografia`**: Superclasse abstrata que define o contrato para os métodos de criptografia.
- **`CodigoMorse`**: Subclasse que implementa o método de criptografia usando o código Morse.
- **`CifraDeCesar`**: Subclasse que implementa o método de criptografia usando a cifra de César.
- **`SistemaCriptografia`**: Classe principal que contém o método `main` para executar o programa e interagir com o usuário.

## Como Usar

1. Clone o repositório para sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento Java preferido.
3. Execute a classe `SistemaCriptografia`.
4. Siga as instruções no terminal para escolher entre descriptografar ou criptografar uma frase, selecionar o método de criptografia e fornecer a entrada necessária.

## Exemplo de Uso

```
Escolha uma opção:
1 - Decriptar uma frase
2 - Encriptar uma frase
0 - Sair

1

Escolha um método de criptografia:
1 - Cifra de César
2 - Código Morse

2

Digite a frase:

.... . .-.. .-.. --- / .-- --- .-. .-.. -..

Resultado:
HELLO WORLD
```

Neste exemplo, o usuário escolheu descriptografar uma frase usando o código Morse e forneceu a entrada correspondente. O programa então exibiu a frase descriptografada no terminal.

## Requisitos

- Java JDK 8 ou superior.


## Contribuição

Contribuições são bem-vindas! Se você encontrar problemas ou melhorias potenciais, sinta-se à vontade para abrir uma issue ou enviar um pull request.

