#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai pedir para o usuário nomes de pessoas utilizando loop. Ele vai parar de pedir a próxima pessoa quando o usuário digitar um “código de parada”. No final vai dizer quantidade de pessoas digitadas.

cod_parada="exit"
nome=""
i=0
echo "Se quiser sair, usar exit"
echo
while [[ $nome != $cod_parada ]]
do
  echo "Escreva um nome:"
  read nome
  if [[ $nome != $cod_parada ]]
  then
    vetor[$i]=$nome
    i=$((i+1))
    echo "O nome escolhido foi $nome"
  fi
done
echo "Tamanho do vetor: ${#vetor[@]}"
