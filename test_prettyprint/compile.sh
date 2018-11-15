#!/bin/bash
#bash script to compile each file from toCompile directory to compiled directory
for filename in `ls toCompile`
do
	echo $filename
	java -jar ./toCompile/$filename -o ./compiled/$filename
done

echo 'Fin du pretty-printing.'

#multiplier le fichier 1 x fois pour les tests de linéarité

#un fichier de 12 lignes, 3 fois le fichier 1
# rm ./toCompile/test9.wh
# for i in `seq 1 3`
# do
# 	./toCompile/test1.wh >> ./toCompile/test9.wh
# done
# START=$(date +%s.%N)
# java -jar ./toCompile/test9.wh ./compiled/test9.wh
# END=$(date +%s.%N)
# DIFF=$(echo "$END - $START" | bc)
# DIFF > ./compiled/test9time.txt


# #un fichier de 120 lignes, 30 fois le fichier 1
# rm ./toCompile/test10.wh
# for i in `seq 1 3`
# do
# 	./toCompile/test1.wh >> ./toCompile/test10.wh
# done
# START=$(date +%s.%N)
# java -jar ./toCompile/test10.wh ./compiled/test10.wh
# END=$(date +%s.%N)
# DIFF=$(echo "$END - $START" | bc)
# DIFF > ./compiled/test10time.txt


# #un fichier de 1200 lignes, 300 fois le fichier 1
# rm ./toCompile/test11.wh
# for i in `seq 1 3`
# do
# 	./toCompile/test1.wh >> ./toCompile/test11.wh
# done
# START=$(date +%s.%N)
# java -jar ./toCompile/test11.wh ./compiled/test11.wh
# END=$(date +%s.%N)
# DIFF=$(echo "$END - $START" | bc)
# DIFF > ./compiled/test11time.txt
