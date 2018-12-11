#!/bin/bash
#bash script to compile each file from whileInput directory to javascriptOutput directory

#Empty the output folder before running the generation of files
rm javascriptOutput -rf
mkdir javascriptOutput

for filename in `ls whileInput`
do
	echo "---- compilation of the file $filename to ${filename::-3}.js"
	java -jar ../livrables/whc1/whc.jar ./whileInput/$filename -o ./javascriptOutput/"${filename::-3}.txt" #here the JS output is in TXT: easier to import as text
done

#rm temp -rf

#mocha test.js