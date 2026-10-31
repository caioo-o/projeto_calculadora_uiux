#!/bin/sh
# Gera a documentação JavaDoc em docs/ (abra docs/index.html no navegador)
javadoc -encoding UTF-8 -docencoding UTF-8 -charset UTF-8 -author -version \
  -windowtitle "Projeto Calculadora" -doctitle "Projeto Calculadora - FinançApp" \
  -d docs -sourcepath src:test -subpackages calculadora
