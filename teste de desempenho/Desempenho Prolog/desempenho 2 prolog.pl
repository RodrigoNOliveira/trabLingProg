% Predicado para gerar uma grande lista de números aleatórios
geraLista(0, []).
geraLista(N, [H|T]) :- N > 0, random(1, 5000, H), N1 is N - 1, geraLista(N1, T).

% Predicado para encontrar o valor máximo em uma lista
maior([], Max, Max).
maior([H|T], Max, Result) :- H > Max, maior(T, H, Result).
maior([H|T], Max, Result) :- H =< Max, maior(T, Max, Result).

% Consulta para realizar a manipulação de dados
/*?- geraLista(1000000, Lista), maior(Lista, 0, MaiorValor), 
write('Valor máximo encontrado: '), write(MaiorValor), nl.*/