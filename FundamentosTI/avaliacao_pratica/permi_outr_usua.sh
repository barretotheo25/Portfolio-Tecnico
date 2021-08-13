#!/bin/bash

echo "Me diga qual diretório ou arquivo tu queres saber as permissões!"
read nome_dir_arq

perm_usuarios=$(ls -l $nome_dir_arq)

echo "$perm_usuarios"
