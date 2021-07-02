#!/bin/bash
# autor Théo Barreto Silva
# descrição  Esse script vai imprimir a lista de frutas com seus respectivos preços em ordem alfabética
var=$(cut -d" " -f2,3 lista_frutas | sort)
echo "$var"
