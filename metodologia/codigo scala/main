object ExemploFuncionalScala {

/*NESSE CODIGO É IMPLEMENTADO CONCEITOS FUNCIONAIS, ENTRE ELES IMUTABILIDADE,
FUNÇÕES DE PRIMEIRA CLASSE E EXPRESSÕES LAMBDA.
A imutabilidade esta presente na lista de valores utilizados para se calcular o fatorial, pois a variavel não é alterada, sim é criado outra
A recursividade esta presente na função Fatorial
A função calcular fatorial é uma expressão Lambda*/
  
  def fatorial(n: Int): Int = {
    if (n <= 0) 1
    else n * fatorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    val numeros = List(1, 2, 3, 4, 5, 6, 7)

    val calcularFatorial = (x: Int) => fatorial(x)

    val fatoriais = numeros.map(calcularFatorial)

    println("Números: " + numeros.mkString(", "))
    println("Fatoriais: " + fatoriais.mkString(", "))
  }
}