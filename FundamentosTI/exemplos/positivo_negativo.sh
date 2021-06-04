#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai pedir ao usuário um valor e em seguida vai dizer se o valor é negativo ou positivo.
echo "Digite um valor"
read valor

if [ $valor -lt 0 ]
then
  echo "O valor é negativo!"
else
  echo "O valor é positivo!"
fi
