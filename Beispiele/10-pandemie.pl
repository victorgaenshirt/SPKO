% pandemie.pl
% eine Wissensbasis zum Lehrbetrieb in der Corona-Zeit

% Fakten:
geimpft(otto).
geimpft(klara).
genesen(willi).
genesen(erna).
getestet(bruno).
getestet(berta).
getestet(klara).

% Regeln:
zweiG(X) :- geimpft(X).
zweiG(X) :- genesen(X).

dreiG(X) :- zweiG(X).
dreiG(X) :- getestet(X).

spko(X) :- member(X, [otto,klara,erna,bruno]).
spko_praesenz(X) :- spko(X), dreiG(X).
spko_praesenz_alarmstufe2(X) :- spko(X), zweiG(X).

% Beispielanfrage "Darf klara in Praesenz an spko teilnehemen?"
% ?- spko_praesenz(klara)

% Beispielanfrage "Wer darf in Praesenz an spko teilnehemen?"
% ?- spko_praesenz(X)

