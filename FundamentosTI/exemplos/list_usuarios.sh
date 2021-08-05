#!/bin/bash
var=$(cut -d: -f1 /etc/passwd)
echo "Os usuários do sistema são:"
echo $var
