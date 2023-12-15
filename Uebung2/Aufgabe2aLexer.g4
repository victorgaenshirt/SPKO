lexer grammar Aufgabe2aLexer;

// Lexer für Aufgabe 2a

USER: [A-Za-z 0-9 .-]+;
MAILSIGN: '@';
DOMAIN: [A-Za-z]+;
ENDING: '.de' | '.com' | '.org' | '.net';
PUNKT: '.';
COMMA: ','; //für die mailList

WS: [ \t\r\n]+ -> channel(HIDDEN);
ERROR: . -> channel(HIDDEN);