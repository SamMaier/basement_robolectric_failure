#!/bin/bash
DIR="$(dirname "$(realpath "$0")")"
javac -d $DIR -cp $DIR/"*" $DIR/SimpleTest.java && java -cp $DIR:$DIR/* org.junit.runner.JUnitCore smaier.SimpleTest

