#!/bin/bash
# autor Théo Barreto Silva
# Descrição Esse script vai pedir a idade do usuário e dizer se ele pode beber bebidas alcóolicas nos EUA

echo "Digite a sua idade:"
read idade

idade_permitida=21

if [ $idade -lt $idade_permitida ]
then
	echo "Nos EUA, você não pode beber bebidas alcóolicas"
else
	echo "Nos EUA, você pode beber bebidas alcóolicas"
fi
