#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai imprimir apenas a lista de frutas, sem os números de ordem nem os preços.
lista_frutas=$(cut -d" " -f2 lista_frutas)
echo "$lista_frutas"
