#!/bin/bash
#bash script to compile each file from toCompile directory to compiled directory

#Empty the output folder before running the generation of files
rm compiled -rf 
mkdir compiled
rm ./toCompile/test9.wh

for filename in `ls toCompile`
do
	echo $filename
	./whpp ./toCompile/$filename -o ./compiled/$filename
done

#pretty-print du pretty-print
filename="test9"
cp ./compiled/test1.wh ./expectedCompilation/expectedTest9.wh
cp ./compiled/test1.wh ./toCompile/$filename.wh
./whpp ./toCompile/$filename.wh -o ./compiled/$filename.wh
