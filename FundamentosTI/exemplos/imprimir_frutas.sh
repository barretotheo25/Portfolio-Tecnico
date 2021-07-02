#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai imprimir apenas a lista de frutas, sem os números de ordem nem os preços.
cd ..  # usei o “cd ..” pois minha lista de frutas estava em um diretório de fora
cd ..  # usei o “cd ..” pois minha lista de frutas estava em um diretório de fora
lista_frutas=$(cut -d" " -f2 lista_frutas)
echo "$lista_frutas"
