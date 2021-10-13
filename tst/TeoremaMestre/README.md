<h1 align="center">
  <p> Teorema mestre </p>
</h1>

## 📝 Descrição

Escreva um programa que, dada uma relação de recorrência, aplica o teorema mestre para determinar a sua classe assintótica.

O teorema mestre pode ser aplicado em funções no seguinte formato:

`T(n) = a '*' T(n/b) + theta(n'**'ord)`

Onde `a` é a quantidade de chamadas recursivas, `b` é o tamanho de cada subproblema e `ord` é a ordem da função somada a cada passo recursivo.

## 📌 Entrada

Seu programa recebe 3 valores inteiros constítuidos por `a`, `b` e `ord`.

## 📌 Saída

Seu programa deve aplicar as regras do teorema mestre e imprimir o theta da relação de recorrência.

## 📥 Input

``` 
(1)
    4 2 3

(2)
    9 3 2

(3)
    3 3 1
```

## 📤 Output

``` 
(1)
    T(n) = theta(n**3)

(2)
    T(n) = theta(n**2 * log n)

(3)
    T(n) = theta(n**1 * log n)
```
