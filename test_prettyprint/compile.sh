#!/bin/bash
#bash script to compile each file from toCompile directory to compiled directory
for filename in `ls toCompile`
do
	java -jar ./toCompile/$filename ./compiled/$filename
done
#multiplier le fichiers 1 x fois pour les tests de linéarité
#java -jar ./toCompile/test1.wh ./compiled/test9