#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai pedir ao usuário um valor N e irá imprimir todos os valores entre 1 e N, porém ele só vai aceitar valores maiores que 0.

echo "Digite um valor"
read N
if [ $N -gt 0 ]
then
  
    for i in $(seq 1 $N)
    do
      echo "- $i"
    done
else
    echo "Digitem um valo maior que zero"
fi
