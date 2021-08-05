#!/bin/bash
# autor Théo Barreto Silva
# descrição Esse script vai receber como parâmetro um nome de um arquivo ou diretório e dizer quais permissões o usuário dono tem.
info=$(ls -ld $1)
permr=${info:1:1}
permw=${info:2:1}
permx=${info:3:1}

if [[ $permr == "r" ]]
then
	echo "O arquivo ou diretório tem permissão de leitura!"
else
	echo "O arquivo ou diretório não tem permissão de leitura!"
fi

if [[ $permw == "w" ]]
then
	echo "O arquivo ou diretório tem permissão de escrita!"
else
	echo "O arquivo ou diretório não tem permissão de escrita!"
fi

if [[ $permx == "x" ]]
then
	echo "O arquivo ou diretório tem permissão de execução!"
else
	echo "O arquivo ou diretório não tem permissão de execução!"
fi
