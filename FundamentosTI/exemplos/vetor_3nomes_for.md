#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai fazer um loop com 3 nomes, utilizando o for, ele vai imprimir "Oi, eu sou ____"
vetor[0]="Théo"
vetor[1]="Ana"
vetor[2]="Sophia"

for i in ${vetor[@]}
do
  echo "Oi, eu sou $i"
done
