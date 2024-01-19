parser grammar Aufgabe2aParser;

//Parser für Aufgabe 2a
options { tokenVocab=Aufgabe2aLexer; }

expr : userPart MAILSIGN domainPart;
userPart: USER;
domainPart: DOMAIN ENDING;
mailList : expr (COMMA expr)*;

/*
so tuts:
antlr4-parse Aufgabe2aParser.g4 Aufgabe2aLexer.g4 expr -gui -tree -tokens -trace
 */