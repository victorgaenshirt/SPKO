parser grammar Aufgabe2aParser;

//Parser für Aufgabe 2a
options { tokenVocab=Aufgabe2aLexer; }

//mailadress : USER MAILSIGN DOMAIN ENDING;
prog:   expr ;
expr : USER MAILSIGN DOMAIN ENDING;
mailList : expr (COMMA expr)*;