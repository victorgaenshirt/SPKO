grammar Aufgabe2aLexer;

// Lexer für Aufgabe 2a
USER: [A-Za-z0-9-.]+;
MAILSIGN: '@';
DOMAIN: [A-Z a-z]+;
ENDING: '.de' | '.com' | '.org' | '.net';
COMMA: ',';
WS: [ \t\r\n]+ -> channel(HIDDEN);
