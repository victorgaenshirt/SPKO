lexer grammar Aufgabe2aLexer;

// Lexer für Aufgabe 2a

fragment USER: [A-Za-z 0-9 .-]+;
fragment MAILSIGN: '@';
fragment DOMAIN: [A-Za-z]+;
fragment ENDING: '.de' | '.com' | '.org' | '.net';
fragment PUNKT: '.';
fragment COMMA: ','; //für die mailList

WS: [ \t\r\n]+ -> channel(HIDDEN);
ERROR: . -> channel(HIDDEN);