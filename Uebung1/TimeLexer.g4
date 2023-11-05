grammar TimeLexer;
prog:   (expr NEWLINE)* ;
expr:   HOUR DP MINUTE DT;

ONETOTWELVE : [1] [0-2];
HOUR : [0-9] | ONETOTWELVE;
MINUTE : [0-5] [0-9];

DT : 'AM' | 'PM';
DP : (':');

NEWLINE : [\r\n]+ ;



/* 
Befehl für die Kommandozeile:

antlr4-parse TimeLexer.g4 prog -gui
1:01AM
STRG+D

akzeptiert den String, startet aber irgendwie die gui nicht 
 */