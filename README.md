# MaratonaProgramacao
Resolução de exercícios em Java

13- O Crivo de Eratóstenes:
O Crivo de Eratóstenes é um sistema que permit-se obter os números primos seguindo os seguintes passos: 
1)Elimina o número 1
2) Elimina os múltiplos do menor número primo, que é 2.
3) Elimina os múltiplos do próximo número primo, que é 3.
4) Elimina os múltiplos do próximo número primo, que é 5.
5) Elimina os múltiplos do próximo número primo, que é 7.
6) Os números que não foram eliminados são os números primos entre 1 e 100

14) Descreva o Algoritmo de número decimal para binário:
Para realizar a conversão de decimal para binário, realiza-se a divisão sucessiva por 2 (base do sistema binário).
O resultado da conversão será dado pelo último quociente (MSB) e o agrupamento dos restos de divisão será o número binário.
A leitura do resultado é feita do último quociente para o primeiro resto.

15) Algoritmo para se calcular a probabilidade de algo acontecer:
Esse conceito pode ser representado como fração, porcentagem e até mesmo como número decimal.
Como a probabilidade é baseada em chances reais de determinado evento acontecer, seus valores não podem ser menores do que 0.
O cálculo de probabilidade é feito da seguinte forma:
P=n(evento)/n(amostra)
O número de eventos também é o número de casos favoráveis. Enquanto o número da amostra é o número de casos possíveis.

16- Descreve o que são Grafos e o Algoritmo de Dijkstra:
O algoritmo de Dijkstra soluciona o problema do caminho mais curto num grafo dirigido ou não dirigido com arestas de peso não negativo, em tempo computacional O(m + n log n) onde m é o número de arestas e n é o número de vértices. O algoritmo que serve para resolver o mesmo problema em um grafo com pesos negativos é o algoritmo de Bellman-Ford, que possui maior tempo de execução que o Dijkstra. O algoritmo considera um conjunto S de menores caminhos, iniciado com um vértice inicial I. A cada passo do algoritmo busca-se nas adjacências dos vértices pertencentes a S aquele vértice com menor distância relativa a I e adiciona-o a S e, então, repetindo os passos até que todos os vértices alcançáveis por I estejam em S. Arestas que ligam vértices já pertencentes a S são desconsideradas.
