<h1 align="center">
  <p> Fila (Linked List) </p>
</h1>

## 📝 Descrição

Implemente uma fila baseada em uma linked list (duplamente encadeada). Seus algoritmos devem ser recursivos.

## 📌 Entrada

Seu programa deve ler da entrada uma série de operações (add, remove, element, search e print). A leitura de operações deve ser encerrada com a palavra `end`.

## 📌 Saída

Seu programa deve imprimir o conteúdo da fila sempre que uma operação print for lida. Se a fila estiver vazia, imprima `empty`.

Seu programa deve imprimir o elemento inicial da fila quando ler a operação element. Se a lista estiver vazia, imprima `empty`.

Se a fila estiver vazia e for lida a operação remove, imprima `empty`.

A operação search retorna a primeira posição (iniciando de 0) em que o elemento aparece na fila. Caso a fila não contenha o elemento imprima -1.

## ⚠️ Restrições e Observações

Você não pode usar coleção ou método algum do Collections framework. Sua implementação deve em nós ligados por referência.

Dica: Crie a classe Fila para organizar o seu código.

Lembre-se: tst vai testar apenas a entrada e saída do seu programa. Isso significa que você deve construir o main que leia os dados da entrada padrão manipula a sua Fila e imprime o que se espera na saída.

## 📥 Input

``` 
(1)
    print
    add 2
    element
    add 5
    print
    remove
    print
    add 11
    add 18
    add 20
    search 18
    remove
    print
    remove
    remove
    remove
    remove
    end

(2)
    search 8
    add 9
    search 9
    add 8
    search 9
    search 8
    remove
    search 9
    end

```

## 📤 Output

``` 
(1)
    empty
    2
    2 5
    5
    2
    11 18 20
    empty

(2)
    -1
    0
    0
    1
    -1
```
