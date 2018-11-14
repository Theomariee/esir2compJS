#!/bin/bash
#bash script to compile each file from toCompile directory to compiled directory
for filename in `ls toCompile`
do
	echo $filename compilation...
	java -jar whpp.jar ./toCompile/$filename ./compiled/$filename
done

#multiplier le fichier 1 x fois pour les tests de linéarité

#un fichier de 12 lignes, 3 fois le fichier 1, écrit dans test9.wh
filename="test9"
rm ./toCompile/$filename.wh
for i in `seq 1 3`
do
	echo `cat ./toCompile/test1.wh` >> ./toCompile/$filename.wh
done
START=$(date +%s.%N)
java -jar whpp.jar ./toCompile/$filename.wh ./compiled/$filename.wh
END=$(date +%s.%N)
DIFF=$(echo "$END - $START" | bc)
echo ${DIFF} > ./compiled/${filename}time.txt
echo $filename lasted $DIFF seconds, written in compiled/${filename}time.txt

#un fichier de 120 lignes, 30 fois le fichier 1, écrit dans test10.wh
filename="test10"

#un fichier de 1200 lignes, 300 fois le fichier 1, écrit dans test11.wh
filename="test11"
