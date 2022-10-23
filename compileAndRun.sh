#!/bin/bash

javac -d classes *.java
pushd classes &> /dev/null
java OOP_LAB4
popd &> /dev/null
