#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai pedir ao usuário o ano atual, depois pedirá o ano de nascimento do usuário. Então, dirá se a pessoa pode votar ou não.
echo "Qual é o ano atual?"
read ano_atual
echo "Qual ano você nasceu?"
read ano_de_nascimento

ano_18=$((ano_atual-18))
ano_16=$((ano_atual-16))

if [ $ano_de_nascimento -le $ano_18 ]
then
  echo "Você deve votar!"
elif [ $ano_de_nascimento -le $ano_16 ]
then
  echo "Você pode votar!"
else
  echo "Você não pode votar!"
fi
