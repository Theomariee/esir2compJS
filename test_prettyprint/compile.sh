#!/bin/bash
#bash script to compile each file from toCompile directory to compiled directory
toCompile = "./expectedCompilation/"
compiled = "./compiled/"
for filename in $toCompile; do
	./whpp $toCompile/filename $compiled/filename