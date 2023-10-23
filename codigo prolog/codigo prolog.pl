
 /* NESSE CODIGO É IMPLEMENTADO EXEMPLOS DE PARA ILUSTRAR OS 
  * PRINCIPIOS LOGICOS E A PROGRAMAÇÃO DECLARATIVA, ]
  * UTILIZANDO FATOS E REGRAS BASICOS, RECURSAO */


:- discontiguous pai/2.

% Fatos: Definindo relações familiares
pai(joao, ana).  % João é pai de Ana
mae(ana, maria). % Ana é mãe de Maria
pai(pedro, joao). % Pedro é pai de João
mae(maria, carla). % Maria é mãe de Carla
pai(pedro, carla). % Pedro é pai de Luis
pai(jorge, Gustavo).  % Jorge é pai de Gustavo

% Regra: Definindo relação de avós
avo(Avo, Neto) :- pai(Avo, Filho), pai(Filho, Neto).

% Regra: Definindo relação de irmãos
irmao(X, Y) :- pai(Z, X), pai(Z, Y), X \= Y. % X é irmão de Y se ambos têm o mesmo pai e não são a mesma pessoa

% Regra: Verifica se alguém é casado
casados(X, Y) :- pai(X, Filho), mae(Y, Filho).