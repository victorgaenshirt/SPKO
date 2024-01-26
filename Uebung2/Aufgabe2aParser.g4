parser grammar Aufgabe2aParser;

//Parser für Aufgabe 2a
options { tokenVocab=Aufgabe2aLexer; }

//mailList : expr (COMMA expr)*;
expr : userPart MAILSIGN domainPart;
userPart: USER;
domainPart: REST;


/*
so tuts:

build.xml muss in den Ordner kopiert worden sein. (haben wir schon gemacht)
ant ausführen 

antlr4-parse Aufgabe2aParser.g4 Aufgabe2aLexer.g4 expr -gui -tree -tokens -trace

Syntax, um Parse Tree zu erstellen:
grun Expr prog -gui &
oder, wenn man test files hat:
grun nameGrammar StartVar test.txt -gui &

grun Aufgabe2aParser expr  -gui &

grun Aufgabe2aParser.g4  emailadressenForInput.txt mailList -gui &

 */