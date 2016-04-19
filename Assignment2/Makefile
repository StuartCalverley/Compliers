ANTLR = /usr/local/lib/antlr-4.4-complete.jar
CP = $(ANTLR):.

all:
	java -jar $(ANTLR) -no-listener -no-visitor *.g4
	javac -cp $(CP) *.java

run:
	@java -cp $(CP) ParseFile inputfile

clean:
	rm -rf A2*.java A2*.tokens *.class
