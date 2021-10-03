cd $2
javac -cp ../tester.jar $1.java && java -classpath ../tester.jar:. tester.Main $1
cd
