lexer grammar Aufgabe2aLexer;

// Lexer für Aufgabe 2a

USER: [A-Za-z0-9-]+;
MAILSIGN: [@];
REST:   Domain Ending;
WS: [ \t\r\n]+ -> channel(HIDDEN);
ERROR: . -> channel(HIDDEN);

fragment Domain: [A-Za-z]+;
fragment Ending: '.de' | '.com' | '.org' | '.net';


