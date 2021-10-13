<h1 align="center">
  <p> Fura fila </p>
</h1>

## 📝 Descrição

Suponha que um array representa uma fila para entrada em um show. Contudo, o pessoal da terceira idade (todas as pessoas a partir do índice i), resolveu exercer o seu direito de ter prioridade na entrada. Assim, você deve deslocar (um a um) os idosos para o início da fila, respeitando, naturalmente a ordem entre os idosos.

## 📌 Entrada

Seu programa deve ler 2 linhas. A primeira contém uma sequência (representando a fila) de inteiros separados por espaço.

A segunda contém um índice válido i da sequência. Esse índice marca o início dos idosos na fila.

## 📌 Saída

Seu programa deve imprimir o array depois de fazer cada elemento a partir da posição i ocupar o seu lugar no início da fila.

Para cada operação de fura-fila feita, você deve imprimir o estado atual do array. Veja os exemplos de entrada e saída para um melhor entendimento.

Considere que o índice passado é válido.

## ⚠️ Restrições

Não é permitido utilizar outro array diferente do utilizado para armazenar a sequência inicial.

## 📥 Input

```
(1)
    0 1 2 3 4 5 6 7 8
    4

(2)
    5 1 7 3 9 10
    2
```

## 📤 Output

```
(1)
    [4, 0, 1, 2, 3, 5, 6, 7, 8]
    [4, 5, 0, 1, 2, 3, 6, 7, 8]
    [4, 5, 6, 0, 1, 2, 3, 7, 8]
    [4, 5, 6, 7, 0, 1, 2, 3, 8]
    [4, 5, 6, 7, 8, 0, 1, 2, 3]

(2)
    [7, 5, 1, 3, 9, 10]
    [7, 3, 5, 1, 9, 10]
    [7, 3, 9, 5, 1, 10]
    [7, 3, 9, 10, 5, 1]
```
