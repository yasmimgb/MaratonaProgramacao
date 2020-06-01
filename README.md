# MaratonaProgramacao
Resolução de exercícios em Java

1- O que é um algoritmo Recursivo?
Em programação, a recursividade é um mecanismo útil e poderoso que permite a uma função chamar a si mesma direta ou indiretamente, ou seja, uma função é dita recursiva se ela contém pelo menos uma chamada explícita ou implícita a si própria. A idéia básica de um algoritmo recursivo consiste em diminuir sucessivamente o problema em um problema menor ou mais simples, até que o tamanho ou a simplicidade do problema reduzido permita resolvê-lo de forma direta, sem recorrer a si mesmo. Quando isso ocorre, diz-se que o algoritmo atingiu uma condição de parada, a qual deve estar presente em pelo menos um local dentro algoritmo. Sem esta condição o algoritmo não para de chamar a si mesmo, até estourar a capacidade da pilha, o que geralmente causa efeitos colaterais e até mesmo o término indesejável do programa. Para todo algoritmo recursivo existe um outro correspondente iterativo (não recursivo), que executa a mesma tarefa. Implementar um algoritmo recursivo, partindo de uma definição recursiva do problema, em uma linguagem de programação de alto nível como Pascal e C é simples e quase imediato, pois o seu código é praticamente transcrito para a sintaxe da linguagem. Por essa razão, em geral, os algoritmos recursivos possuem código mais claro (legível) e mais compacto do que os correspondentes iterativos. Além disso, muitas vezes, é evidente a natureza recursiva do problema a ser resolvido, como é o caso de problemas envolvendo árvores — estruturas de dados naturalmente recursivas. Entretanto, também há desvantagens: i) algoritmos recursivos quase sempre consomem mais recursos (especialmente memória, devido uso intensivo da pilha) do computador, logo tendem a apresentar um desempenho inferior aos iterativos; e ii) algoritmos recursivos são mais difíceis de serem depurados, especialmente quando for alta a profundidade de recursão (número máximo de chamadas simultâneas).
2- Descreva o algoritmo de Algoritmo de Euclides
A ideia principal no Algoritmo de Euclides é que o MDC pode ser calculado recursivamente, usando o resto da divisão como entrada 
para o próximo passo, o que é baseado na seguinte propriedade do MDC:
{\displaystyle MDC(a,b)=MDC(b,r)}MDC(a,b)=MDC(b,r)
onde {\displaystyle r}r é o resto da divisão de {\displaystyle a}a por {\displaystyle b}b.
Isso quer dizer que o resto da divisão em uma chamada do algoritmo será usado como entrada para a próxima chamada.
Sabemos que esse resto é calculado da seguinte forma: {\displaystyle r=a-bq}r=a-bq, onde 
{\displaystyle q={\frac {a}{b}}}q={\frac  {a}{b}} é uma divisão inteira.
Desta forma, podemos substituir as variáveis para obter uma sequência: 
usando {\displaystyle a=r_{k-1}}a=r_{{k-1}}, {\displaystyle b=r_{k}}b=r_{k} e {\displaystyle r=r_{k+1}}r=r_{{k+1}}, temos a seguinte sequência:
{\displaystyle r_{k+1}=r_{k-1}-r_{k}q}r_{{k+1}}=r_{{k-1}}-r_{k}q
que nos diz que para calcular o próximo resto, basta multiplicar o resto atual por 
{\displaystyle q={\frac {r_{k-1}}{r_{k}}}}q={\frac  {r_{{k-1}}}{r_{k}}} e depois subtrair do resto anterior.
Quando o próximo resto for igual a zero, o algoritmo termina a execução e o resto atual 
({\displaystyle r_{k}}r_{k}) é o máximo divisor comum.
A partir dessas observações, podemos facilmente derivar uma versão completa do algoritmo.
3- Explique o que é a sequência de Fibonacci.
Sequência de Fibonacci consiste numa sucessão infinita de números que obedecem um padrão em que 
cada elemento subsequente é a soma dos dois anteriores. Assim, após 0 e 1, vêm 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc.
Esta sequência foi descoberta pelo matemático italiano Leonardo Fibonacci (1170 - 1250), também conhecido por Leonardo Pisa
ou Leonardo Bigollo. A constatação de Fibonacci foi feita a partir da observação do crescimento de uma população de coelhos.
A sequência começa pelo número 0 e 1, sendo que este se repete e, posteriormente, a soma dos dois últimos numerais forma o 
próximo: 1 + 1 = 2. Depois a sequência continua a somar-se: 1 + 2 = 3; 2 + 3 = 5; 3 + 5 = 8; e assim infinitamente.
Esta sequência de números está, misteriosamente, interligada com diversos fenômenos da natureza, conforme constatou-se ao
longo dos anos os estudos matemáticos.
4- Descreva o Algoritmo de BubbleSort
Bubble Sort é um algoritmo de ordenação que pode ser aplicado em Arrays e Listas dinâmicas. Se o objetivo é ordenar 
os valores em forma decrescente, então, a posição atual é comparada com a próxima posição e, se a posição atual for maior 
que a posição posterior, é realizada a troca dos valores nessa posição. Caso contrário, não é realizada a troca, apenas 
passa-se para o próximo par de comparações.
Se o objetivo é ordenar os valores em forma crescente, então, a posição atual é comparada com a próxima posição e, se 
a posição atual for menor que a posição posterior, é realizada a troca. Caso contrário, a troca não é feita e passa-se 
para o próximo par de comparação.
Um array ou lista pode estar já ordenado no momento em que se solicita a ordenação, dessa forma, esta situação tem de ser 
considerada na implementação do algoritmo. Assim, demonstrarei a representação gráfica e o teste de mesa das duas situações 
usando array. Vamos utilizá-lo para analisar e testar o comportamento deste algoritmo. Apenas reforçando que em Linguagem C 
o vetor começa na posição 0. Utilizamos o comando de controle FOR para manipular vetores, então, aqui implementaremos um for
que irá da posição 0 até a posição 4 e será incrementado de 1, iniciando em zero. Dessa forma conseguimos obter o valor dos 
elementos das posições que serão comparadas usando o comando de controle IF e, conforme a ordem desejada fazer a troca se for necessária.
Para que não ocorra repetição desnecessária, utilizaremos uma FLAG, que nos avisará quando o vetor estará ordenado e, assim,
a execução será terminada. Essa FLAG sempre será setada com 1 quando houver uma troca. Dessa forma, enquanto n for menor ou 
igual ao tamanho do vetor e, ao mesmo tempo a FLAG for igual a 1, então, deve-se continuar ordenando, caso contrário, o vetor 
estará ordenado.

5- O Problema do palíndromo é a verificação se uma palavra lida normalmente, ou seja, da esquerda pra direita e lida ao contrário, ou seja, da direita pra esquerda é lida da mesma forma, por exemplo, na palavra "Arara", ou na frase: "Socorram me subi no onibus em marrocos".

usando o seguinte programa em Java, podemos confirmar se uma palavra é, ou não, palíndroma
import java.util.Scanner;

    public class Ex1 {
    	public static void main(String[]args) {
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("Digite uma palavra ou frase:");
    		String palavra = sc.nextLine();
    		String orig = palavra;
    		palavra = palavra.replace(" ","").toLowerCase();
    		String palindromo = "";
    	
    		
    		for(int i = palavra.length() -1; i >= 0; i--){
    			
    			palindromo += palavra.charAt(i);

    		}
    		
    		if(palindromo.equals(palavra)) {
    			System.out.print(orig + " é um palíndromo!");
    		}
    		else {
    			System.out.print(orig + " não é um palíndromo!");
    			
    		}
    		sc.close();
    	}

    }

6- O problema do caixeiro viajante, é basicamente um problema matemático, que nos pede para calcular a menor distância possível entre um número de cidades, pensando nos mercadores que querem economizar o máximo de recursos possível, sem passar duas vezes pela mesma cidade e sempre retornando para a cidade inicial

7- Consistindo na ideia de preencher uma mochila com o maior número de itens possível, o problema da mochila é algo que todos passamos ou passaremos alguma vez na vida, por exemplo, quando viajamos e temos que colocar na mala as coisas que serão necessárias na viajem. O problema da mochila é um problema de programação linear inteira e é classificado como NP-hard, caso alguém deseje listar todas as possibilidades e tomar a maior delas, a complexidade do problema cresce na ordem de 2^n (dois elevado a n), onde n é o número de itens. Supondo um computador que analisa 1 bilhão de vetores por segundo e retorna a melhor combinação, iríamos precisar de aproximadamente 30 anos para analisar um caso com 60 itens, mais de 60 anos para um caso com 61 itens, conforme Martello e Toth (1990) apresentaram. Porém, alguns algoritmos precisam de apenas poucos segundos para resolver problemas com 1000000 itens em um computador simples.

8- O triângulo de Pascal tem o objetivo de dispor os coeficientes binomiais, de modo que os coeficientes de mesmo numerador agrupem-se em uma mesma linha, e coeficientes de mesmo denominador agrupem-se na mesma coluna. O triângulo de Pascal é construído colocando-se os números binomiais de mesmo numerador na mesma linha e os coeficientes de mesmo denominador na mesma coluna.

9 - Descreva o Binômio de Newton
O Binômio de Newton refere-se a potência na forma (x + y)n , onde x e y são números reais e n é um número natural.
O desenvolvimento do binômio de Newton em alguns casos é bastante simples. Podendo ser feita multiplicando-se diretamente todos os termos.
Contudo, nem sempre é conveniente utilizar esse método, pois de acordo com o expoente, os cálculos ficarão extremamente trabalhosos.
Exemplo
Represente a forma expandida do binômio (4 + y)3:
Como o expoente do binômio é 3, vamos multiplicar os termos da seguinte forma:
(4 + y) . (4 + y) . (4 + y) = (16 + 8y + y2) . (4 + y) = 64 + 48y + 12y2 + y

10 - Descreva o Algoritmo que calcule o MMC
O MMC entre dois números naturais (vou me limitar ao conjunto dos números naturais) é o menor número natural que é múltiplo de ambos os números. Exemplos:
o MMC de 24 e 12 é igual a 24;
o MMC de 36 e 14 é igual a 252;
o MMC de 11 e 9 é igual a 99.
Um método seria fatorando os números em potências inteiras de números primos e multiplicando apenas as maiores potências de cada primo:
60=22×3×560=22×3×5
100=22×52100=22×52
A maior potência de 22 é 2222. A maior potência de 33 é 33. A maior potência de 55 é 5252, logo
MMC(60,100)=22×3×52=300MMC⁡(60,100)=22×3×52=300
O problema dos métodos anteriores é que a fatoração de números inteiros é um problema NP, não existindo um algoritmo que possa fazer isso de maneira eficiente.

11 - Descreva o Algoritmo que calcule o MDC
O máximo divisor comum entre dois número pode ser determinado através de um algoritmo de 2300 anos (cerca de 300 A.C.), o algoritmo de Euclides. Para calcular o mdc(m,n) para 0 <= n < m, o algoritmo de Euclides usa a seguinte recorrência: mdc(m,0) == m; mdc(m,n) == mdc(n, m % n), para n > 0.

12 - Descreva o Algoritmo de números perfeitos
Em Matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número. Euclides descobriu que os quatro primeiros números perfeitos são gerados pela fórmula: 2n-1(2n - 1): para n = 2: 21(22 - 1) = 6.

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

17 - O numero de armstrong, ou numero narcisista, é o numero que se somado todos os seus algorismos elevado a quantidade de algorismo que compõe o numero, retornará ele mesmo.
18 - PageRank é o sistema utilizado na google para determinar a notoriedade de um site no mecanismo de pesquisa. Esse sistema utiliza o apontamento de outros sites para classificar ele como relevante ou não.

19 - Algoritimo determistico é aquele que para uma determidada entrada de dados sempre resultará em uma saída, passando pelos mesmos processos sempre. Já o probabilistico consiste no processo de probabilidade de resultado ou entrada de dados, podendo assim não ter um resultado unico para uma entrada. O melhor e pior caso para um algoritimo, é a relação entre varios fatores, como por exemplo a velocidade de execução e a quantidade de recurso que tal algoritmo irá usar, traçando uma relação entre esses fatores se encontra o melhor e pior caso.

20 - Algoritimo genético é uma tecnica inspirada no processo biologico de evolução. São criadas soluções aleatorias para um problema, e essas soluções que conseguirem passar pelo problema são recombinados e sofrem mutação nas entradas de dados para que tenham um melhor desempenho no proximo obstaculo.

21- Em matemática, uma cadeia de Markov é um caso particular de processo estocástico com estados discretos (o parâmetro, em geral o tempo, pode ser discreto ou contínuo) com a propriedade de que a distribuição de probabilidade do próximo estado depende apenas do estado atual e não na sequência de eventos que precederam, uma propriedade chamada de Markoviana, chamada assim em homenagem ao matemático Andrei Andreyevich Markov. A definição dessa propriedade, também chamada de memória markoviana, é que os estados anteriores são irrelevantes para a predição dos estados seguintes, desde que o estado atual seja conhecido. Cadeias de Markov têm muitas aplicações como modelos estatísticos de processos do mundo real.

22- O estado da arte é o nível mais alto de desenvolvimento, seja de um aparelho, de uma técnica ou de uma área científica, alcançado em um tempo definido, como "Este novo televisor reflete o estado da arte em tecnologia de projeção", ou "Jimi Hendrix trouxe o estado da arte para a guitarra". Portanto sigifica dizer que aquele algoritmo ou teoria é a melhor possível no momento em que foi pensado ou criado, ou seja, a maior evolução até esse ponto.
