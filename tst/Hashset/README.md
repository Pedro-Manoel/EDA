<h1 align="center">
  <p> HashSet </p>
</h1>

## 📝 Descrição

HashSets implementam a noção matemática de conjunto em Java, isto é, não permitem elementos repetidos. HashSets são estruturas bem semelhantes à Tabelas Hash no que diz respeito à implementação, pois também podem ser baseadas em arrays e utilizam funções de hash para determinar onde armazenar o valor passado. Contudo, uma grande diferença é que eles não armazenam os pares chave-valor, mas apenas os valores.

Devido à natureza das funções de hash que utilizamos na construção de HashSets, colisões são inevitáveis. Isto é, para algum par de valores, existe a possibilidade de seus hashes serem iguais e, por consequência, esses objetos serão mapeados para a mesma posição.

Uma das maneiras de se resolver colisões é, caso o hash seja mapeado para uma posição já ocupada, o algoritmo de inserção procura por uma outra posição livre para inserir o valor. A essa estratégia, dá-se o nome de resolução de colisões por endereçamento aberto. Em particular, quando a tentativa é sempre verificar a próxima posição livre do array, diz-se que a estratégia utiliza um probing linear.

Implemente um programa que leia da entrada padrão operações em um HashSet imprima o seu estado sempre que as operações put e remove forem efetuadas.

O HashSet deve armazenar valores inteiros e deve resolver colisões por endereçamento aberto e probing linear.

Seu HashSet deve ter as seguintes funções:

```
- put <valor>
- remove <valor> 
- contains <valor>
```

Importante! Para facilitar os testes, seu HashSet sempre terá a seguinte função base de hash:

`hash(key) = key % M, onde M é o tamanho do HashSet.`

Importante! Caso o conjunto já esteja completamente cheio durante uma inserção, basta não adicionar o novo valor. Contudo, mesmo que a operação não seja realizada, imprima o conteúdo do conjunto.

## 📌 Entrada

Seu programa deve ler da entrada o tamanho da tabela e uma série de operações (put, remove e contains).

```
- put: adiciona um valor no conjunto 
- remove: remove o valor do conjunto
- contains: verifica se o conjunto contém um valor passado como parâmetro.
```

A leitura de operações deve ser encerrada com a palavra `end`.

## 📌 Saída

Seu programa deve imprimir o conteúdo do HashSet sempre que as operações put e remove forem efetuadas. Quando a operação contains for lida, seu programa deve imprimir true ou false.

## ⚠️ Restrições


- Seu HashSet deve ser baseado em arrays. 
- A função de hash deve ser sempre a mesma (exceto pelo probing): key % M, 
onde M é o tamanho do conjunto.
- Crie a classe HashSet para organizar o seu código.


## 📥 Input

``` 
5
put 0
put 14
put 20
put 0
contains 20
remove 20
contains 20
end
```

## 📤 Output

``` 
[0, null, null, null, null]
[0, null, null, null, 14]
[0, 20, null, null, 14]
[0, 20, null, null, 14]
true
[0, null, null, null, 14]
false
```
