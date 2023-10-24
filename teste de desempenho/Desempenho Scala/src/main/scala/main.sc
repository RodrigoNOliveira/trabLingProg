object DesempenhoScala {
  def calcularSoma(n: Int): Long = {
    var total = 0L
    for (i <- 1 to n) {
      total += i
    }
    total
  }

  def main(args: Array[String]): Unit = {
    val inicio = System.nanoTime()
    val resultado = calcularSoma(1000000)  // Altere o valor de N conforme necessário
    val fim = System.nanoTime()

    println(s"Resultado: $resultado")
    println(s"Tempo decorrido: ${(fim - inicio) / 1e6} milissegundos")
  }
}