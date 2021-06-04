#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai imprimir os números de 1 a 10 em ordem decrescente.
i=10
while [ $i -gt 0 ]
do
  echo "- $i"
  i=$((i-1))
done
