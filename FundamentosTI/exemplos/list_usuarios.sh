#!/bin/bash
# autor Théo Barreto Silva
# Descrição Esse script vai retornar todos os usuários do sistema.
var=$(cut -d: -f1 /etc/passwd)
echo "Os usuários do sistema são:"
echo $var
