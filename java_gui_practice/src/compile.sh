#!/bin/bash
rm -f *.class
echo "All the classes have been removed!"
javac *.java
echo "Compiling succesful!"
java Main
echo "Succesful run"
