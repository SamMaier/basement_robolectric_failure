#!/bin/bash
DIR="$(dirname "$(realpath "$0")")"
rm -f $DIR/target/dependency/play-services-basement.jar
unzip $DIR/target/dependency/play-services-basement*.aar classes.jar -d $DIR/target/dependency/
mv $DIR/target/dependency/classes.jar $DIR/target/dependency/play-services-basement.jar
javac -d $DIR -cp $DIR/target/dependency/"*" $DIR/SimpleRobolectricTest.java && java -cp $DIR:$DIR/target/specialcases/*:$DIR/target/dependency/* org.junit.runner.JUnitCore smaier.SimpleRobolectricTest

