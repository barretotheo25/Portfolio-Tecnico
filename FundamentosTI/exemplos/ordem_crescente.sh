#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai imprimir os números de 1 a 10 em ordem crescente.
i=1
while [$i -lt 11 ]
do
  echo "- $i"
  i=$((i+1))
done
