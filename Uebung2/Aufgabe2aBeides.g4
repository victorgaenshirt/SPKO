grammar Aufgabe2aBeides;


//expr : USER MAILSIGN DOMAIN PUNKT ENDING;
expr : USER MAILSIGN;
//mailList : expr (COMMA expr)*;

// Lexer für Aufgabe 2a
USER: [A-Za-z0-9-.]+;
MAILSIGN: '@';
DOMAIN: 'hallo';
PUNKT: '.';
ENDING: 'de';
//ENDING: '.de' | '.com' | '.org' | '.net';
COMMA: ',';
WS: [ \t\r\n]+ -> channel(HIDDEN);