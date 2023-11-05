/* Aufgabe 1b)
    Erkennen Sie mit ANTLR 4 Lexer-Regeln Zeitangaben im digitalen 12-Sunden-Format gemäß https://en.wikipedia.org/wiki/12-hour_clock. 
    Beachten Sie auch die alternativen Schreibweisen 12 midnight, Midnight, 12 noon und Noon. */

grammar TimeLexerchris;

/*
Parser rules start with a lower case. These rules focus on helping you build an abstract syntax tree out of your parsed tokens. */
prog:   (CLOCK NEWLINE? )*;
CLOCK:  Hour COLON Minute;

/* Lexer rules always start with an uppercase letter. These rules focus on defining the tokens that will form the foundation of your parser rules. */
/* Hour und Minute als fragment zu definieren hat den Vorteil, dass diese nicht in umgekehrter Reihenfolge erkannt werden können.
    Das wäre der Fall, wenn man diese als Token definieren würde statt als fragment. */ 
fragment Hour : [0-9] | ONETOTWELVE;
fragment ONETOTWELVE : [01] [0-2];
fragment Minute : [0-5] [0-9];

DT : 'AM' | 'PM' | 'am' | 'pm';
COLON : (':');

WS  :   [ \t\r\n]+ -> skip;
NEWLINE : [\r\n]+ ;



/* 
Befehl für die Kommandozeile:

antlr4-parse TimeLexer.g4 prog -gui
1:01AM
STRG+D

akzeptiert den String, startet aber irgendwie die gui nicht 
 */