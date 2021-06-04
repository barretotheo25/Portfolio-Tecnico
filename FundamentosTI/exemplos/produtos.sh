#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai pedir o preço de 15 produtos, em seguida irá calcular e escrever o maior preço lido e a média aritmética dos preços dos produtos
soma=0
maior=0
for i in $(seq 1 15)
do
  echo "O preço de $i produto:"
  real val
  if [ $val -gt $maior ]
  then
    maior=$val
  fi
  
  soma=$((soma+i))
done
media=$(bc <<< "scale=2;$soma/15)
echo "A média dos preços é $media!"
echo "O maior valor é $maior!"
