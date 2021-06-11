#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai fazer um loop com 3 nomes, utilizando o while, ele vai imprimir "Oi, eu sou ____".

vetor[0]="Hadassa"
vetor[1]="Raissa"
vetor[2]="Maria Júlia"

tam_vetor=${#vetor[@]}
i=0
while [ $i -lt $tam_vetor ]
do
  echo "Oi, eu sou ${vetor[$i]}"
  i=$((i+1)) # aux++
done
