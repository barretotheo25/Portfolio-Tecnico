#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai pedir ao usuário um valor N e irá imprimir todos os valores entre 1 e N.
read N
Y=1
if [ $N -lt 1 ]
then
  echo "Digite um valor maior que zero"
fi
while [ $Y -lt $N ]
do
  echo "> $Y"
  Y=$(($Y+1))
done
echo "> $N"
