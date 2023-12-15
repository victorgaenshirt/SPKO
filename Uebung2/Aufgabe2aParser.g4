parser grammar Aufgabe2aParser;

//Parser für Aufgabe 2a
options { tokenVocab=Aufgabe2aLexer; }

expr : userPart MAILSIGN domainPart;
userPart: USER;
domainPart: DOMAIN ENDING PUNKT;
mailList : expr (COMMA expr)*;