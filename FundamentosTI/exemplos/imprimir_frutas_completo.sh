#!/bin/bash
# autor Théo Barreto Silva
# descrição esse script vai imprimir a lista de frutas com seus respectivos preços
var=$(cut -d" " -f2,3 lista_frutas)
echo "$var"
