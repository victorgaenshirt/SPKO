grammar TimeLexerchris;
prog:   (expr NEWLINE)* ;
expr:   HOUR COLON MINUTE DT;

fragment ONETOTWELVE : [1] [0-2];
HOUR : [0-9] | ONETOTWELVE;
MINUTE : [0-5] [0-9];

DT : 'AM' | 'PM';
COLON : (':');

NEWLINE : [\r\n]+ ;



/* 
Befehl für die Kommandozeile:

antlr4-parse TimeLexer.g4 prog -gui
1:01AM
STRG+D

akzeptiert den String, startet aber irgendwie die gui nicht 
 */