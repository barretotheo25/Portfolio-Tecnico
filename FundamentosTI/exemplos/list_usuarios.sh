#!/bin/bash
lista_usuarios=$(cut -d" " -f1 /etc/passwd)
echo "$lista_usuarios"
