#!/bin/bash

# autor Théo Barreto Silva
# descrição Esse script vai pedir um número para o usuário e vai listar os números entre 1 e "o número digitado"

echo "Digite um número!"
read numero

i=1

while [ $i -lt $numero ]
do
	echo "- $i"
	i=$((i+1))
done
