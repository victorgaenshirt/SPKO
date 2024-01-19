/* Aufgabe 1b)
    Erkennen Sie mit ANTLR 4 Lexer-Regeln Zeitangaben im digitalen 12-Sunden-Format gemäß https://en.wikipedia.org/wiki/12-hour_clock. 
    Beachten Sie auch die alternativen Schreibweisen 12 midnight, Midnight, 12 noon und Noon. */

grammar TimeLexer;

/*
Parser rules start with a lower case. These rules focus on helping you build an abstract syntax tree out of your parsed tokens. */
prog:   TWELVETIME | MIDNIGHT | NOON | TIME DT NEWLINE?;

/* Lexer rules always start with an uppercase letter. These rules focus on defining the tokens that will form the foundation of your parser rules. */
/* Hour und Minute als fragment zu definieren, verhindert den Fall, dass  HOUR:HOUR oder MINUTE:MINUTE erkannt wird. (je nachdem, ob die Zeile 
    mit der Definition von HOUR oder MINUTE weiter oben im Code steht)
    Das wäre der Fall, wenn man diese als Token definieren würde statt als fragment. */ 
TIME:   Hour COLON Minute;

TWELVETIME: '12 midnight' | '12 noon';
MIDNIGHT:   'Midnight';
NOON:       'Noon';


fragment Hour : [0-9] | OneToTwelve;
fragment OneToTwelve : [01] [0-2];
fragment Minute : [0-5] [0-9];

DT : 'AM' | 'PM' | 'am' | 'pm' | 'a.m.' | 'p.m.';
COLON : (':');

WS  :   [ \t\r\n]+ -> skip;
NEWLINE : [\r\n]+ ;



/* 
Befehl für die Kommandozeile:

antlr4-parse TimeLexer.g4 prog -tokens -tree -gui -trace        //-tree und -trace müssen nicht angegeben werden, und gui funktioniert eh nicht ;)
01:01AM
STRG+D

 */