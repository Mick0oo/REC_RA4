# Recuperação do RA4 - ORDENAÇÃO
# Resolução de Problemas Estruturados em Computação

Algoritmos requisitados:
- Radix Sort
- Quick Sort Não recursivo (Iterativo)
- Merge Sort Não recursivo (iterativo, bottom-up)

São comparados os resultados dos três algoritmos contra três datasets de 50 elementos desorganizados de formas diferentes.
Essa desorganização interage diferentemente com as fraquezas e as forças de cada um dos algoritmos.

Os datasets são caracterizados das seguintes formas:

Dataset 1: 
- 50 elementos, alternado com picos entre cada elemento (menor, maior).

Dataset 2: 
- 50 elementos, começa ordenado, tem um pico e continua invertido desde então.

Dataset 3: 
- 50 elementos, invertido. Sequência de 50 a 1.

O merge sort é o mais consistente em todos os datasets para as trocas e iterações.
O quick sort tem uma quantidade média de iterações muito maior que os outros algoritmos nos datasets invertidos (2,3).

# Conclusão
O melhor algoritmo no geral é o Radix. Ele o desempenho mais satisfatório quando comparado aos outros, para todos os datasets.

# Gráfico de barras

![Image](https://github.com/user-attachments/assets/a5501ac9-3ee0-4bca-a5d3-00c2fe822204)

# Gráficos de linhas

![Image](https://github.com/user-attachments/assets/7364989a-9525-4c82-8298-7391357536db)
![Image](https://github.com/user-attachments/assets/44d4fec7-14dc-4e77-8f25-6ab42c2b2f68)
![Image](https://github.com/user-attachments/assets/ed233626-485c-49a1-a313-a862c3d3f2e3)
