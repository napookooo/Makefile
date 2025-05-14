main:
	javac -d classes/ ./src/net/code/*.java

run:
	java App

clean:
	rm -rf classes/

pack:
	jar cfm main.jar manifest.txt -C classes net
