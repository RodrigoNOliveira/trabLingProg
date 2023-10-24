% Predicado para calcular o somatório dos números de 1 a N
calcular_soma(1, 1).
calcular_soma(N, Soma) :- N > 1, N1 is N - 1, calcular_soma(N1, SubSoma), Soma is SubSoma + N.



% calcular_soma(1000000, Result), write('Resultado: '), write(Result), nl.