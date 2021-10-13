<h1 align="center">
  <p> Insertion Sort recursivo </p>
</h1>

## 📝 Descrição

Escreva um programa que ordena um array de inteiros utilizando o insertion sort. No entanto, dessa vez, sua implementação deve ser recursiva.

Seu programa deve imprimir o status do array a inserção ordenada (exceto a primeira).

## 📌 Entrada

Seu programa irá ler apenas um linha de entrada, que consiste em uma lista de inteiros separados por espaço.

## 📌 Saída

Na saída, imprima o array a cada inserção ordenada. Seu programa deve parar assim que imprimir a sequência ordenada.

## ⚠️ Restrições

Seu programa deve, obrigatoriamente, utilizar recursão.

## 👉 Dica

Imprima o array com `Arrays.toString()`

## 📥 Input

``` 
(1)
    5 0 6 2

(2)
    4 3 2 1
```

## 📤 Output

``` 
(1)
    [0, 5, 6, 2]
    [0, 5, 6, 2]
    [0, 2, 5, 6]

(2)
    [3, 4, 2, 1]
    [2, 3, 4, 1]
    [1, 2, 3, 4]
```
