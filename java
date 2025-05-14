main:
	javac -d classes/ ./src/net/code/*.java

run:
	java Main

clean:
	rm -rf classes/

pack:
	jar cfm main.jar manifest.txt -C classes net

# package the source code using `package net.code`

# manifest.txt file example \
  Main-Class: net.code.App \
  Class-Path: net.code


# dir structure \
  src/net/code \
  class/net/code (/net/code made by makefile)
